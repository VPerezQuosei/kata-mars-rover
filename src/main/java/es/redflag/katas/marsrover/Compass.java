
package es.redflag.katas.marsrover;

class Compass {

    private String facing = "N";

    public void changeDirection(String orientation) {
        this.facing = orientation;
    }

    public String orientation() {
        return facing;
    }
}
