package factory;

public class PersonFactory {
    public static Person createPerson(String person){
        if(person.equals("male")) return new Male();
        return new Female();
    }
}
