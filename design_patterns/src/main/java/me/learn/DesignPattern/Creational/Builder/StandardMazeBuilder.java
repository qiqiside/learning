package me.learn.DesignPattern.Creational.Builder;

public class StandardMazeBuilder implements MazeBuilder {

    public static final Integer WIDTH = 8;
    public static final Integer HEIGHT = 8;

    private Maze maze;

    private Direction commonWall(Room r1, Room r2) {
        Integer fromRow = r1.getNo() / WIDTH;
        Integer toRow = r2.getNo() / HEIGHT;

        Integer fromCol = r1.getNo() % WIDTH;
        Integer toCol = r2.getNo() % HEIGHT;

        if (fromRow.equals(toRow)) {
            if (fromCol == toCol - 1)
                return Direction.WEST;

            if (fromCol == toCol + 1)
                return Direction.EAST;
        }

        if (fromCol.equals(toCol)) {
            if (fromRow == toRow - 1)
                return Direction.SOUTH;

            if (fromRow == toRow + 1)
                return Direction.NORTH;
        }

        return null;
    }

    public void buildMaze() {
        maze = new Maze();
    }

    public void buildRoom(Integer roomNo) {
        if (maze.roomNo(roomNo) == null) {
            Room room = new Room(roomNo);
            maze.addRoom(roomNo, room);

            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.WEST, new Wall());
            room.setSide(Direction.EAST, new Wall());
        }
    }

    public void buildDoor(Integer roomFrom, Integer roomTo) {
        Room r1 = maze.roomNo(roomFrom);
        Room r2 = maze.roomNo(roomTo);
        Door d = new Door(r1, r2);

        r1.setSide(commonWall(r1, r2), d);
        r2.setSide(commonWall(r2, r1), d);
    }

    public Maze getMaze() {
        return maze;
    }

}
