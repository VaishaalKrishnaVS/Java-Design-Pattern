package abstract_factory;

public class DaoProducer {
    public static DaoAbstractFactory createDaoAbstractFactory(String type){
        if (type.equals("xml")) {
            return new XMLDaoFactory();
        }
        return new DbDaoFactory();
    }
}
