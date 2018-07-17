package Factory;

/**
 * Created by Phoebus Gannicus on 7/17/2018.
 */
public class SecureSqlServerConnection extends Connection {
    public SecureSqlServerConnection(){

    }

    public String description(){
        return "SQL Server secured";
    }
}
