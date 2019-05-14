package by.it.group673602.eliseev.lab6_7spring.src.main.java.app.domains;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

public enum City {
    MINSK("Минск"),
    GRODNO("Гродно"),
    GOMEL("Гомель"),
    VITEBSK("Витебск"),
    BREST("Брест");

    private String value;

    City(String s){
        this.value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
