import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Master> masters = new ArrayList<>();

        masters.add(new Master("John", "Doe", 20));
        masters.add(new Master("Andrew", "Johanson", 22));
        masters.add(new Master("Roman", "Simple", 21));
        masters.add(new Master("Jane", "Cutak", 42));

//
//          Генерация GSON
//
        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        String stringGsonName = GSON.toJson(masters);

//
//          Сериализация и помещение GSON в файл
//

        Serialization serialization = new Serialization();
        serialization.Serialize(stringGsonName, "masters.txt");
    }
}
