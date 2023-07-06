
  fetch("http://localhost:8080/api/fermata")
    .then(response => {
        console.log(response.json());
    })
    .catch(error => {
        // handle the error
    });
