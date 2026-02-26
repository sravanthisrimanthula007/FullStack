const express = require("express");
const mysql = require("mysql2");
const cors = require("cors");

const app = express();
app.use(cors());
app.use(express.json());
app.use(express.static(__dirname));
const db = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"Sravanthi@07",
    database:"task1_db"

});
db.connect((err)=>{
    if(err){
        console.log("Database connection failed");
        console.log(err);
    }
    else{
        console.log("Database connected");
    }
});
app.post("/login",(req,res)=>{
    const {username,email,dob,department,phone} = req.body;
    if(!username||!email||!dob||!department||!phone){
        return res.json({message:"All fields are required!!"});
    }
    const sql = "INSERT INTO Studentreg(username,email,dob,department,phone) VALUES(?,?,?,?,?)";
    db.query(sql,[username,email,dob,department,phone],(err,result)=>
    {
        if(err){
            res.json({message:"data insertion failed!!"});
        }
        else{
            res.json({message:"data insertion successful!"});
        }
    });
});
app.get("",(req,res)=>{
    const sql = "SELECT * FROM Studentreg";
    db.query(sql,(err,result)=>{
        if(err){
            console.log("Insert Error: ",err);
            res.status(500).json({message:"error inserting data"});
        }
        else{
            res.json(result);
        }
    });
});
app.listen(3000,()=>{
    console.log("Server started on port 30000");
}
);