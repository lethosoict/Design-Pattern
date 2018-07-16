package Decorate;

public class Keyboard extends ComputerComponent{

    Computer computer;

    public Keyboard(Computer c){
        computer = c;
    }

    @Override
    public String description() {
        return computer.description()+" and a Keyboard";
    }
}
