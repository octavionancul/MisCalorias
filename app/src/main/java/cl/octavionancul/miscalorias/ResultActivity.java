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
            tv.setText("En reposo (TMB) necesitas "+ value+" calorias aldia");
            Log.d("dd", getIntent().getStringExtra("tmb"));
            Log.d("dd", value);

            //The key argument here must match that used in the other activity
        }

    }
}
