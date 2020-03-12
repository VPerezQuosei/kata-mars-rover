package es.redflag.katas.marsrover;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CommandFactory {

    private Map<Character, Command> cmds = new HashMap<>();       

    public void register(Character cmdName, Command cmd) {
        cmds.putIfAbsent(cmdName, cmd); 
    }

    public Optional<Command> get(Character cmdName) {
        return Optional.ofNullable(cmds.get(cmdName));
    }
}
