package Factory;


/**
 * Created by Phoebus Gannicus on 7/17/2018.
 */
public class SecuredFactory extends ConnectionFactory {
    @Override
    public Connection CreateConnection(String type) {
        if (type.equals("Oracle")) {
            return new SecureOracleConnection();
        }
        else if(type.equals("SQL Server")){
            return new  SecureSqlServerConnection();
        }
        else if(type.equals("MySql")){
            return new SecureMySqlConnection();
        }
        return null;
    }
}
