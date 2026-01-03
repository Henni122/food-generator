document.addEventListener("DOMContentLoaded", () => {


    const getRandomFoodBtn = document.getElementById("get-random-dish");


    async function fetchRecipies() {

        const url = "http://localhost:8080/api/random-meal";

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

    /*
    const randomMat = document.createElement("p");
                    randomMat.innerText = JSON.stringify(response);
                    document.body.appendChild(randomMat);
     */


    function displayRecipieInformation(data) {
        console.log(data);

        document.getElementById("name").innerText = meal.name;
        document.getElementById("source").innerText = meal.source;
        document.getElementById("image").src = meal.image;
    }


    function formatDisplayedData() {

    }
})


