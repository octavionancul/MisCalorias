package cl.octavionancul.miscalorias;

import android.util.Log;

/**
 * Created by Octavio on 04/04/2018.
 */

public class TMBResult extends TMBAnswer {

    public TMBResult(int age, int weight, int height, String gender) {
        super(age, weight, height, gender);
    }

    private int processingTMB(){
        int age = getAge();
        int weight = getWeight();
        int height = getHeight();
        String gender = getGender();

        if(gender.equals("Hombre")){
        //    Log.d("dd", String.valueOf(((10*weight)+(6.25*height)-(5*age)+5)));
            return (int) ((10*weight)+(6.25*height)-(5*age)+5);
        }else{
            return (int) ((10*weight)+(6.25*height)-(5*age)-161);
        }
    }

    public int getTMB(){

        return processingTMB();
    }
}
