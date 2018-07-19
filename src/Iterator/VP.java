package Iterator;

/**
 * Created by Phoebus Gannicus on 7/19/2018.
 */
public class VP {
    private String name;
    private String division;

    public VP(String n, String d){
        name = n;
        division = d;
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println("Name: "+name+"; Division: "+division);
    }
}
