import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//
//          Класс основы генерации GSON
//

public class Master implements Serializable{
    @SerializedName("NAME")
    private final String name;

    @SerializedName("SURNAME")
    private final String surname;

    @SerializedName("AGE")
    private int age;

    Master(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
