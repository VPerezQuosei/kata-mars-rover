package es.redflag.katas.marsrover;

public class Rover {

    private Compass compass             = new Compass();
    private CommandFactory cmdFactory   = new CommandFactory();

    public Rover(){
        cmdFactory.register('L', new Left());
        cmdFactory.register('R', new Right());
    }

    public String orientation() {
        return compass.orientation();
    }

    public void executeOrder(String commands) {
        for (char command : commands.toCharArray()) {
            executeCommand(command);
        }
    }

    private void executeCommand(char command) {
        cmdFactory.get(command).ifPresent(cmd -> cmd.setNewDirection(compass));
    }
}
