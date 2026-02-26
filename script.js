document.getElementById("registrationform").addEventListener("submit",function(e){
    e.preventDefault();

  const username = document.getElementById("username").value;
  const email = document.getElementById("email").value;
   const dob = document.getElementById("dob").value;
   const department =document.getElementById("department").value;
    const phone = document.getElementById("phone").value;
    

  fetch("http://localhost:3000/login", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      username: username,
      email:email,
      dob:dob,
      department:department,
      phone:phone,
      
    })
  })
  .then(response => response.json())
  .then(data => {
    alert(data.message);
  })
  .catch(error => {
    console.log(error);
  });
});
