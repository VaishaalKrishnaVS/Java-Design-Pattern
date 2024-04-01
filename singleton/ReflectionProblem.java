import java.lang.reflect.Constructor;

public class ReflectionProblem {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = null;

        Constructor[] constructors = Logger.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                log2 = (Logger) constructor.newInstance();
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.err.println(log1.hashCode());
        System.err.println(log2.hashCode());
    }
}
