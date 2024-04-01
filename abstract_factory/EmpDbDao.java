package abstract_factory;

public class EmpDbDao implements dao {

    @Override
    public void save() {
        System.err.println("saving emp data in db");
    }

}
