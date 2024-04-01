package abstract_factory;

public class XMLDaoFactory extends DaoAbstractFactory{

    @Override
    public dao createDao(String type) {
        if(type.equals("emp")) return new EmpXMLDao();
        return new DptXMLDao();
    }
    
}
