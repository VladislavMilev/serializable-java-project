import java.io.*;

//
//          Класс с методом для Сериализации
//

class Serialization {

    void Serialize(String GsonName, String fileName) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(GsonName);

        } catch (IOException ex) {
            System.out.println("ERROR");
            ex.printStackTrace();
        }
    }
}