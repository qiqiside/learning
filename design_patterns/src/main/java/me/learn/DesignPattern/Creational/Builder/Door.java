package me.learn.DesignPattern.Creational.Builder;

public class Door implements Side {

    private Room roomFrom;
    private Room roomTo;

    public Door(Room roomFrom, Room roomTo) {
        this.roomFrom = roomFrom;
        this.roomTo = roomTo;
    }

}
