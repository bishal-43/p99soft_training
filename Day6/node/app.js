const express = require('express');

const app = express();
const PORT = 5000

app.use(express.json())

app.get('/',(req,res)=>{
    res.status(200).send("hello world");
});

app.post('/api/users',(req,res)=>{
    const userData = req.body;
    console.log("received data",userData);

    res.status(201).json({message:"user created successfully",data:userData});
})

app.get('/about',(req,res)=>{
    res.status(200).send("about aus page")

})


app.listen(PORT,() =>{
    console.log(`Express is running on port: ${PORT}`);
})