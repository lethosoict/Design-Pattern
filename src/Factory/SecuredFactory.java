package Factory;

import java.sql.Connection;

/**
 * Created by Phoebus Gannicus on 7/17/2018.
 */
public class SecuredFactory extends ConnectionFactory {
    @Override
    public Connection CreateConnection(String type) {
        return null;
    }
}
