function sendMail() {
  var params = {
    name: document.getElementById("name").value,
    email: document.getElementById("email").value,
    seat: document.getElementById("seat").value,
    date: document.getElementById("date").value,
    price: document.getElementById("price").value,
  };

  const serviceID = "service_jb4njho";
  const templateID = "template_ibzse8s";

  emailjs
    .send(serviceID, templateID, params)
    .then((res) => {
      document.getElementById("name").value = "";
      document.getElementById("email").value = "";
      document.getElementById("seat").value = "";
      document.getElementById("date").value = "";
      document.getElementById("price").value = "";
      console.log(res);
      alert("Your message sent successfully!!");
    })
    .catch((err) => console.log(err));
}
