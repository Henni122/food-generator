document.addEventListener("DOMContentLoaded", () => {


    const getRandomFoodBtn = document.getElementById("get-random-dish");


    async function fetchRecipies() {

        try {
            const url = `https://www.themealdb.com/api/json/v1/1/random.php`;

            fetch(url)
                .then(response => response.json())
                .catch(error => {
                    console.error("Error fetching data:", error);
                });
        }
        catch (error) {
            console.error("An unexcpected error occurred:", error);
        }
    }
    getRandomFoodBtn.addEventListener("click", () => {
        fetchRecipies().then(response => fetchRecipies());

    })

    /*
    const randomMat = document.createElement("p");
                    randomMat.innerText = JSON.stringify(response);
                    document.body.appendChild(randomMat);
     */


    function displayRecipieInformation(data) {


    }


    function formatDisplayedData() {

    }
})


