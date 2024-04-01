package abstract_factory;

public class DbDaoFactory extends DaoAbstractFactory{

    @Override
    public dao createDao(String type) {
        if(type.equals("emp")) return new EmpDbDao();
        return new DptDbDao();
    }
    
}
