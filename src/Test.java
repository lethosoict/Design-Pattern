import Decorate.Computer;
import Decorate.Disk;
import Decorate.Keyboard;
import Decorate.Monittor;
import Factory.Connection;
import Factory.FirstFactory;
import Factory.SecuredFactory;
import Observer.Archiver;
import Observer.Boss;
import Observer.Client;
import Observer.Database;

public class Test {
    public static void main(String[] args) {

        /* //Decorate Pattern Design
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monittor(computer);
        computer = new Keyboard(computer);
        System.out.println(computer.description());
        */

        /* //Factory Pattern Design
        SecuredFactory factory;
        factory = new SecuredFactory();

        Connection connection = factory.CreateConnection("MySql");
        System.out.println("You are connecting with "+connection.description());
        */

        Database database = new Database();
        Archiver archiver = new Archiver();
        Client client = new Client();
        Boss boss = new Boss();

        database.registerObserver(archiver);
        database.registerObserver(client);
        database.registerObserver(boss);
        database.editRecord("delete", "record 1");

    }
}
