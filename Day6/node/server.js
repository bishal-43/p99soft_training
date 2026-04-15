const http = require('http')

const server = http.createServer((req,res)=>{
    const url = req.url;
    const method = req.method;

    
    if(url === "/" && method === "GET"){
        res.writeHead(200,{'content-type':'text/plain'});
        res.end("welcome to node.js");
    }else if(url === "/about" && method === "GET"){
        res.end("about us");
    }else{
        res.writeHead(404);
        res.end("page not found")
    }
});

const PORT = 3000;

server.listen(PORT,()=>{
    console.log(`server is running on port: ${PORT}`);
})