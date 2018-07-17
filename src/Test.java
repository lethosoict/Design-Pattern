import Decorate.Computer;
import Decorate.Disk;
import Decorate.Keyboard;
import Decorate.Monittor;
import Factory.Connection;
import Factory.FirstFactory;
import Factory.SecuredFactory;

public class Test {
    public static void main(String[] args) {

        /* Decorate Pattern Design
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monittor(computer);
        computer = new Keyboard(computer);
        System.out.println(computer.description());
        */

        SecuredFactory factory;
        factory = new SecuredFactory();

        Connection connection = factory.CreateConnection("MySql");
        System.out.println("You are connecting with "+connection.description());
    }
}
