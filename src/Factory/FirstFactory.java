package Factory;

/**
 * Created by Phoebus Gannicus on 7/17/2018.
 */
public class FirstFactory {
    protected String type;

    public FirstFactory(String t){
        type = t;
    }

    FirstFactory fst = new FirstFactory("MySQL");
}
