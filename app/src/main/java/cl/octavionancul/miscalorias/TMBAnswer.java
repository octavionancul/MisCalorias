package cl.octavionancul.miscalorias;

/**
 * Created by Octavio on 04/04/2018.
 */

public class TMBAnswer {

    private int age,weight,height;
    private String gender;

    public TMBAnswer(int age, int weight, int height, String gender) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }


}
