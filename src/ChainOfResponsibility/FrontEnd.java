package ChainOfResponsibility;

/**
 * Created by Phoebus Gannicus on 7/18/2018.
 */
public class FrontEnd implements HelpInterface {

    HelpInterface successor;

    public FrontEnd(HelpInterface s){
        successor = s;
    }

    public void getHelp(int helpConstant) {

    }
}
