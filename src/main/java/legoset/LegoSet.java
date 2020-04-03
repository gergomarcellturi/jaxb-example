package legoset;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "name", "theme", "subtheme",
        "year", "pieces", "tags",
        "minifigs", "weight", "url" })
@Data
public class LegoSet {

    @XmlAttribute
    String number;

    String name;

    String theme;

    String subtheme;


    @XmlJavaTypeAdapter(YearAdapter.class)
    Year year;

    int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    List<Minifig> minifigs;

    Weight weight;

    String url;
}
