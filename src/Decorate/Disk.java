package Decorate;

public class Disk extends ComputerComponent {

    Computer computer;

    public Disk(Computer c){

        computer = c;
    }

    @Override
    public String description() {
        return computer.description()+" and a Disk";
    }
}
