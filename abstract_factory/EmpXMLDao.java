package abstract_factory;

public class EmpXMLDao implements dao {

    @Override
    public void save() {
        System.err.println("saving emp data in XML");
    }

}
