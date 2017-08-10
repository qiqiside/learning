package me.learn.DesignPattern.Creational.Builder;

import java.util.HashMap;
import java.util.Map;

public class Room {

    private Integer no;
    private Map<Direction, Side> sides;

    public Room(Integer no) {
        this.no = no;
        sides = new HashMap<Direction, Side>();
    }

    public void setSide(Direction direction, Side side) {
        if (direction == null)
            return;

        sides.put(direction, side);
    }

    public Integer getNo() {
        return no;
    }

    public String toString() {
        if (no == null || sides == null)
            return "Room[] -- empty";

        StringBuilder s = new StringBuilder("Room[" + this.no + "] -- ");
        int cur = 0;
        for (Direction direction : sides.keySet()) {
            s.append(direction.toString().substring(0, 1)).append(": ");

            Side side = sides.get(direction);
            if (side instanceof Wall) {
                s.append("wall");
            } else if (side instanceof Door) {
                s.append("door");
            }

            if (cur < sides.size() - 1) {
                s.append(", ");
            }

            cur ++;
        }

        return s.toString();
    }

}
