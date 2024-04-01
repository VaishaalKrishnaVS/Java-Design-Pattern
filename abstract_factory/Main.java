package abstract_factory;

public class Main {
    public static void main(String[] args) {
        DaoAbstractFactory xmlFactory = DaoProducer.createDaoAbstractFactory("xml");
        dao xmlEmpDao = xmlFactory.createDao("emp");
        xmlEmpDao.save();
    }
}
