package oslomet.foodgenerator.dto;


/*
Ansvar: data som sendes UT (eller IN)


Hva gjør den?
- Bestemmer hva frontend får se
- Skjuler unødvendige felt
- Gir kontroll over JSON-struktur


Skal inneholde:
- Enkle felt
- Ingen anotasjoner for database


Skal IKKE inneholde:
- @Entity
- database logikk


DTO er
 */

public class MealDto {
    private String name;
    private String source;
    private String image;

    public MealDto(String name, String souorce, String image) {
        this.name = name;
        this.source = souorce;
        this.image = image;
    }

    public String getName() {
        return name;
    }


    public String getSource() {
        return source;
    }


    public String getImage() {
        return image;
    }

}

