package legoset;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlValue
    String minifig;

    @XmlAttribute
    int count;

    public Minifig(String minifig, int count) {
        this.minifig = minifig;
        this.count = count;
    }
}
