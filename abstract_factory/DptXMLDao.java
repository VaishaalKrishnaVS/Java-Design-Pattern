package abstract_factory;

public class DptXMLDao implements dao {

    @Override
    public void save() {
        System.err.println("saving Department data in XML");
    }

}
