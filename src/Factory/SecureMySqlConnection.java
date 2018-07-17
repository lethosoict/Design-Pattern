package Factory;

/**
 * Created by Phoebus Gannicus on 7/17/2018.
 */
public class SecureMySqlConnection extends Connection {
    public SecureMySqlConnection(){

    }

    public String description(){
        return "MySql secure";
    }
}
