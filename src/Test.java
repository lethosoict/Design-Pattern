import Decorate.Computer;
import Decorate.Disk;
import Decorate.Keyboard;
import Decorate.Monittor;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monittor(computer);
        computer = new Keyboard(computer);
        System.out.println(computer.description());
    }
}
