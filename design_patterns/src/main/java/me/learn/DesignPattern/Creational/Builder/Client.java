package me.learn.DesignPattern.Creational.Builder;

public class Client {

    public static void main(String[] args) {
        StandardMazeBuilder builder = new StandardMazeBuilder();
        MazeDirector director = new MazeDirector();

        Maze maze = director.createMaze(builder);
        maze.show();

        maze = director.createComplexMaze(builder);
        maze.show();
    }

}
