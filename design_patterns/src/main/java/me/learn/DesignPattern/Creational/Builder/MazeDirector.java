package me.learn.DesignPattern.Creational.Builder;

public class MazeDirector {

    Maze createMaze(MazeBuilder builder) {
        builder.buildMaze();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);

        return builder.getMaze();
    }

    Maze createComplexMaze(MazeBuilder builder) {
        builder.buildMaze();

        int size = StandardMazeBuilder.WIDTH * StandardMazeBuilder.HEIGHT;
        for (int i = 1 ; i < size ; i ++) {
            builder.buildRoom(i);
        }

        int p0 = (int) (Math.random() * size);
        for (int i = 0 ; i < 10 ; i ++) {
            int roomFrom = p0;

            int d = (int) (Math.random() * 4);
            switch (d) {
                case 0:
                    p0 -= StandardMazeBuilder.WIDTH;
                    if (p0 < 0) {
                        p0 += size;
                    }
                    break;

                case 1:
                    p0 += StandardMazeBuilder.WIDTH;
                    if (p0 >= size) {
                        p0 -= size;
                    }
                    break;

                case 2:
                    p0 -= 1;
                    if (p0 < 0) {
                        p0 += size;
                    }
                    break;

                case 3:
                    p0 += 1;
                    if (p0 >= size) {
                        p0 -= size;
                    }
                    break;
            }

//            System.out.println("door " + roomFrom + ", " + p0);
            builder.buildDoor(roomFrom, p0);
        }

        return builder.getMaze();
    }

}
