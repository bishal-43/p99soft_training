import {readFileSync} from "fs";
import {join} from "path";

const dataPath = join(import.meta.dirname,"../data/seaports-data.json");
let ports = JSON.parse(readFileSync(dataPath,"utf-8"));

const ok = ({res,data,status=200})=>{
    
    res.status(status).json({success:true,data});
};

const fail = ({res, message, status}) =>
    res.status(status).json({success:false,error:message});

export const getAllPorts = (req,res)=>{
    const {country, status, port_role,page,limit } = req.query;

    let result = ports;

    if(country){
        result = result.filter((p)=>
        p.country.toLowerCase().includes(country.toLowerCase()));
    }

    if(status){
        result=result.filter((p) =>
        p.status.toLowerCase() === status.toLowerCase());
    }

    if(port_role){
        result = result.filter((p)=> p.port_role.toLowerCase() === port_role.toLowerCase());
    }

    const pagenum = Math.max(1,parseInt(page) || 1);
    const limitnum = Math.min(100, Math.max(1, parseInt(limit) || 10));
    const total = result.length;
    const totalPages = Math.ceil(total/limitnum);
    const start = (pagenum -1 ) * limitnum;
    const paginated = result.slice(start, start+limitnum)

    
    ok({res, data:{
        ports:paginated,
        pagination:{
            total,
            page:pagenum,
            limit:limitnum,
            totalPages,
        }}
    });

};

export const getPortByCode = (req,res) =>{
    const {code} = req.params;

    const port = ports.find((p)=> p.unlocode.toLowerCase() === code.toLowerCase());
    if (!port){
    return fail(res,`Ports with unlocode "${code}" not found`,404);
    }
    
    ok({res,data:port});
};


export const createPort = (req,res)=>{
    const {unlocode,country,name,port_role,status}=req.body;
    const missing =[];

    if(!unlocode) missing.push("unlocode");
    if(!name) missing.push("name");
    if(!country) missing.push("country");
    if(!port_role) missing.push("port_role");
    if(!status) missing.push("status");

    if(missing.length>0){
        return fail({res, message:`Missing required fields: ${missing.join(" ")}`,status:400});
    }

    const exists = ports.some(
        (p)=> p.unlocode.toLowerCase() === unlocode.toLowerCase()
    );

    if(exists){
        return fail({res, message:  `A port with unlocode "${unlocode}" already exists`, status: 400});
    }

    const newPort = {...req.body, unlocode:unlocode.toUpperCase()};
    ports.push(newPort);

    ok({res, data:newPort});

    
}


export const deletePort = (req,res) =>{
    const {code} = req.params;

    const index = ports.findIndex((p) =>
    p.unlocode.toLowerCase() === code.toLowerCase());

    if(index === -1){
        return fail(res,`Port with unlocode "${code}" not found`);
    }

    const removed = ports.splice(index,1);

    ok({res, data:removed})


}



export default getAllPorts;getPortByCode;createPort;deletePort;