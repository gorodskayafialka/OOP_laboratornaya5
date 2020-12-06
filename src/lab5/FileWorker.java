package lab5;

import java.io.*;
import java.util.ArrayList;

class FileWorker
{
    void writeList(ArrayList<Shape> shapes, String filename) throws IOException
    {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
        objectOutputStream.writeObject(shapes);
        objectOutputStream.close();
    }

    ArrayList<Shape> readList(String filename) throws IOException, ClassNotFoundException {
        ArrayList shapes = new ArrayList();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        shapes = (ArrayList<Shape>)objectInputStream.readObject();
        return shapes;
    }
}