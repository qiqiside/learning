package me.learn.DesignPattern.Creational.Builder;

public interface MazeBuilder {

    void buildMaze();
    void buildRoom(Integer roomNo);
    void buildDoor(Integer roomFrom, Integer roomTo);
    Maze getMaze();

}
