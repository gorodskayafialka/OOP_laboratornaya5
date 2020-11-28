package lab5;


import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapesToWrite = new ArrayList<>();
        ArrayList<Shape> readShapes = null;
        shapesToWrite.add(new Circle (22));
        shapesToWrite.add(new Square (2.11));
        shapesToWrite.add(new Rectangle (12,14));
        shapesToWrite.add(new Triangle (123,234, 321));
        FileWorker fileWorker = new FileWorker();
        try {
            fileWorker.writeList(shapesToWrite, "C:\\Users\\Ксения Лучкова\\IdeaProjects\\Files\\SavedShapes.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            readShapes = fileWorker.readList("C:\\Users\\Ксения Лучкова\\IdeaProjects\\Files\\SavedShapes.dat");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(readShapes);
    }
}
