const fs = require('node:fs/promises')

async function logFile(){
    try{
        const data = await fs.readFile('example.txt','utf8');
        console.log(data)
    }catch(error){
        console.error("Error: ", error.message)
    }
}
console.log(logFile());