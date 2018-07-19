package Iterator;
import java.util.Iterator;

/**
 * Created by Phoebus Gannicus on 7/19/2018.
 */
public class DivisionIterator implements Iterator {
    private VP[] VPs;
    private int location = 0;

    public DivisionIterator(VP[] v){
        VPs = v;
    }

    @Override
    public boolean hasNext() {
        if(location < VPs.length && VPs[location] != null){
            return true;
        } else
        return false;
    }

    @Override
    public VP next() {
        return VPs[location++];
    }


}
