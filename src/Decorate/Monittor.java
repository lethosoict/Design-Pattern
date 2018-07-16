package Decorate;

public class Monittor extends ComputerComponent {
    Computer computer;

    public Monittor(Computer c){
        computer = c;
    }

    @Override
    public String description() {
        return computer.description()+" and a Monitor";
    }
}
