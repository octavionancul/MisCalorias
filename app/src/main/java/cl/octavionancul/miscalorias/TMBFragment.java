package cl.octavionancul.miscalorias;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.text.TextUtils.isEmpty;


/**
 * A simple {@link Fragment} subclass.
 */
public class TMBFragment extends Fragment {

    public TMBFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tmb, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button calculate = view.findViewById(R.id.calculateBtn);
        final RadioGroup radioGroup = view.findViewById(R.id.genderRg);
        final EditText ageEt = view.findViewById(R.id.ageEt);
        final EditText heightEt = view.findViewById(R.id.heightEt);
        final EditText weightEt = view.findViewById(R.id.weightEt);

            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                  int selectedId = radioGroup.getCheckedRadioButtonId();

                  if (selectedId == -1) {
                    Toast.makeText(getContext(), "Seleccione genero", Toast.LENGTH_SHORT).show();

                } else {
                    RadioButton radioButton1 = radioGroup.findViewById(selectedId);
                    String gender = radioButton1.getText().toString();
                    if (isEmpty(ageEt.getText().toString())) {
                        ageEt.setError("Ingrese edad");

                    } else if (isEmpty(heightEt.getText().toString())) {
                        heightEt.setError("Ingrese altura");

                    } else if (isEmpty(weightEt.getText().toString())) {
                        weightEt.setError("Ingrese peso");

                    }else{
                        int age = Integer.parseInt(ageEt.getText().toString());
                        int height = Integer.parseInt(heightEt.getText().toString());
                        int weight = Integer.parseInt(weightEt.getText().toString());

                        int tmb = new TMBResult(age, weight, height, gender).getTMB();
                        int myCalories = (int) (tmb *1.2);
                        Intent intent = new Intent(getActivity(),ResultActivity.class);
                        intent.putExtra("tmb",String.valueOf(tmb));
                        intent.putExtra("myCalories",String.valueOf(myCalories));
                        startActivity(intent);

                    }
                }


            }
        });


    }
}
