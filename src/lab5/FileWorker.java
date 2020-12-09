package lab5;

import java.io.*;
import java.util.ArrayList;

class FileWorker
{
    void writeList(ArrayList<Shape> shapes, String filename) throws IOException
    {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(shapes);
        }
    }

    ArrayList<Shape> readList(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))){
            ArrayList shapes = (ArrayList<Shape>) objectInputStream.readObject();
            return shapes;
        }
    }
}