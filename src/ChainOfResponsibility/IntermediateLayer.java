package ChainOfResponsibility;

/**
 * Created by Phoebus Gannicus on 7/18/2018.
 */
public class IntermediateLayer implements HelpInterface {
    final int INTERMEDIATE_LAYER_HELP = 1;
    HelpInterface successor;

    public IntermediateLayer(HelpInterface s){
        successor = s;
    }

    public void getHelp(int helpConstant) {
        if(helpConstant != INTERMEDIATE_LAYER_HELP){
            successor.getHelp(helpConstant);
        }else{
            System.out.println("This is the Intermediate Layer. Nice eh?");
        }
    }
}
