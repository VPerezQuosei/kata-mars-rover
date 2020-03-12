package es.redflag.katas.marsrover;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Right implements Command {

    Map<String, String> dirMap = new HashMap<>();

    public Right() {
        dirMap.put("N", "E");
        dirMap.put("E", "S");
        dirMap.put("S", "W");
        dirMap.put("W", "N");
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
