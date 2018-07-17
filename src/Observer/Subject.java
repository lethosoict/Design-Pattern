package Observer;



/**
 * Created by Phoebus Gannicus on 7/17/2018.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
