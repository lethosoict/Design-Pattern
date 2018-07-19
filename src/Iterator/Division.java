package Iterator;

/**
 * Created by Phoebus Gannicus on 7/19/2018.
 */
public class Division {
    private VP[] VPs = new VP[100];
    int number = 0;
    private String name;

    public Division(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void add(String  n){
        VP vp = new VP(n, name);
        VPs[number++] = vp;
    }

    public DivisionIterator iterator(){
        return new DivisionIterator(VPs);
    }
}
