document.addEventListener("DOMContentLoaded", () => {


    const getRandomFoodBtn = document.getElementById("get-random-dish");


    const url = "http://localhost:8080/api/random-meal";

    async function fetchRecipies() {

        try {
            const response = await fetch(url);

            if (!response.ok) {
                throw new Error(`Response status ${response.status}`);
            }

            const result = await response.json();
            displayRecipieInformation(result)
        }

        catch (error) {
            console.error(error.message);
        }
    }
    getRandomFoodBtn.addEventListener("click", fetchRecipies);



    function displayRecipieInformation(data) {
        console.log(data);

        document.getElementById("name").innerText = data.name;
        const foodSource =  document.getElementById("source");
        foodSource.textContent = "View Recepie";
        foodSource.target = "_blank";
        foodSource.href = data.source;


        document.getElementById("image").src = data.image;
    }
})


