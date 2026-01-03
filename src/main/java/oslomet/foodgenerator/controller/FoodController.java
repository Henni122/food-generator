package oslomet.foodgenerator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import oslomet.foodgenerator.service.FoodService;


/*
Denne klassen skal ha ansvaret for HTTP og REST

Den skal gjøre:
- Ta imot request fra front-end (fetch)
- Returnerer responses (JSON)
- Mapper URL -> metode

Klassen skal inneholde
@RestController
@GetMapping, PostMapping osv
Kaller service klassen og aldri repository direkte

Skal ikke inneholde
Business logic
Databasekode
Tilfeldige beregninger
 */


@RestController
@RequestMapping("/api")
public class FoodController {

    @GetMapping("/random")
    public void getFood() {

    }

}
