package abstract_factory;

public class DptDbDao implements dao {

    @Override
    public void save() {
        System.err.println("saving Department data in db");
    }

}
