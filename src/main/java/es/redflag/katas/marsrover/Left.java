package es.redflag.katas.marsrover;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Left implements Command {

    Map<String, String> dirMap = new HashMap<>();

    public Left() {
        dirMap.put("N", "W");
        dirMap.put("E", "N");
        dirMap.put("S", "E");
        dirMap.put("W", "S");
    }

    @Override
    public void setNewDirection(Compass compass) {
        String orientation = compass.orientation();
        Optional.ofNullable(
            dirMap.get(orientation)
        ).ifPresent(
            d -> compass.changeDirection(d)
        );
    }
}
