package cl.octavionancul.miscalorias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("tmb");
            String value2 = extras.getString("myCalories");

           TextView tv = findViewById(R.id.resultTv);
            tv.setText("Metabolismo basal: "+ value+" calorias al dia. \n\nCalorias necesarias para mantener el peso (sedentarios): "+value2+" calorias por dia.");

        }

    }
}
