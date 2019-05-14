package by.it.group673602.eliseev.lab6_7spring.src.main.java.app;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(Integer id){
        super("Couldn't find person" + id);
    }
}
