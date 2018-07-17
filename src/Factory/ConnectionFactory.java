package Factory;

/**
 * Created by Phoebus Gannicus on 7/17/2018.
 */
public abstract class ConnectionFactory {
    public ConnectionFactory(){

    }

    protected abstract Factory.Connection CreateConnection(String type);
}
