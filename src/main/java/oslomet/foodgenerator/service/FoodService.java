package oslomet.foodgenerator.service;



/*
Ansvar: Logikk og regler

Hva skal denne klassen gjøre?

- All logikk skjer her
- Filtrerer basert på kriterier
- Konverterer Model -> DTO (Data Transfer Object)

Klassen skal inneholde:
Buiseness logic
Samspill mellom flere repositories
Validering (enkel)


Skal ikke inneholde:
- HTTP
- @RequestMapping
- Direkte JSON-formattering

SERVICE KLASSEN ER SELVE HJERNEN TIL PROSJEKTET
 */


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import oslomet.foodgenerator.API.MealApiResponse;
import oslomet.foodgenerator.API.MealFromApi;
import oslomet.foodgenerator.dto.MealDto;


@Service
public class FoodService {
    private final String API_URL = "https://www.themealdb.com/api/json/v1/1/random.php";

    public MealDto getRandomMeal() {
        RestTemplate restTemplate = new RestTemplate();

        MealApiResponse response = restTemplate.getForObject(API_URL, MealApiResponse.class);

        MealFromApi meal = response.getMeals().get(0);

        return new MealDto(
                meal.getStrMeal(),
                meal.getStrSource(),
                meal.getStrMealThumb()
        );


    }

}