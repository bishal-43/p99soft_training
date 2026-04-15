
import express from "express";

import portsRouter from "./routes/ports/routes.js";

const app = express();
const PORT = 3000;


app.use(express.json());

app.use((req,_res,next)=>{
    console.log(`[${new Date().toISOString()}] ${req.method} ${req.url}`);
    next();
})


app.use("/ports",portsRouter);
app.get("/",(_req,res)=>{
    res.json({message:`Ports api is running on ${PORT}`})
})


app.listen(PORT,()=>{
    
    console.log(`app is running on port: ${PORT}`)
})

