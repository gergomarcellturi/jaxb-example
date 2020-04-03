package legoset;

import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.time.Year;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws JAXBException {
        LegoSet legoset = new LegoSet();

        legoset.setName("Imperial TIE Fighter");
        legoset.setNumber("75211");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);

        legoset.setTags(new LinkedHashSet<>(Arrays.asList(
                "Starfighter", "Stormtrooper", "Star Wars", "Solo")));

        legoset.setMinifigs(List.of(
                new Minifig("Imperial Mudtrooper", 2),
                new Minifig("Imperial Pilot", 1),
                new Minifig("Mimban Stormtrooper", 1)
                ));

        legoset.setWeight(new Weight("kg", 0.89));

        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset, System.out);
    }
}
