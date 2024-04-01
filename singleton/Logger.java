import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

    // This is lazy initialization
    private static volatile Logger instance;

    // This is eager initialization
    // private static Logger instance = new Logger();
    // We can also use a static block for the same

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null)
                    instance = new Logger();
            }
        }
        return instance;
    }

    // To avoid issues in serializing we need to create this method
    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}