import Decorate.Computer;
import Decorate.Disk;
import Decorate.Keyboard;
import Decorate.Monittor;
import Factory.FirstFactory;

public class Test {
    public static void main(String[] args) {

        /* Decorate Pattern Design
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monittor(computer);
        computer = new Keyboard(computer);
        System.out.println(computer.description());
        */

        FirstFactory factory = new FirstFactory("Oracle");
    }
}
