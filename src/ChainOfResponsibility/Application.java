package ChainOfResponsibility;

/**
 * Created by Phoebus Gannicus on 7/18/2018.
 */
public class Application implements HelpInterface {
    public Application(){
        
    }

    @Override
    public void getHelp(int helpConstant) {
        System.out.println("This is the MegaGigaCo Application");
    }
}
