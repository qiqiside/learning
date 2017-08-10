package me.learn.DesignPattern.Creational.Builder;

import java.util.Map;
import java.util.TreeMap;

public class Maze {

    private Map<Integer, Room> rooms = new TreeMap<Integer, Room>();

    public void addRoom(Integer no, Room room) {
        rooms.put(no, room);
    }

    public Room roomNo(Integer no) {
        return rooms.get(no);
    }

    public void show() {
        System.out.println("MAZE = {");

        if (rooms != null) {
            for (Integer no : rooms.keySet()) {
                System.out.println("    " + rooms.get(no));
            }
        }

        System.out.println("}");
    }


}
