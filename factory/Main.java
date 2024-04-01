package factory;

public class Main {
    public static void main(String[] args) {
        Person female = PersonFactory.createPerson("female");
        Person male = PersonFactory.createPerson("male");
        female.wish();
        male.wish();
    }
}
