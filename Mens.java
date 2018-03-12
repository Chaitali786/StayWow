package com.example.chaitali.staywow;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by chaitali on 2018-03-12.
 */
public class Mens  extends Activity {

    public Mens() {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.mens);
        final EditText e1 = (EditText)this.findViewById(R.id.editText1);
        final EditText e2 = (EditText)this.findViewById(R.id.editText2);
        final TextView tv3 = (TextView)this.findViewById(R.id.textresult);
        Button btncalculate = (Button)this.findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();
                if(TextUtils.isEmpty(str1)) {
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                } else if(TextUtils.isEmpty(str2)) {
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                } else {
                    float weight = Float.parseFloat(str1);
                    float height = Float.parseFloat(str2) / 100.0F;
                    float bmiValue = Mens.this.calculateBMI(weight, height);
                    String bmiInterpretation = Mens.this.interpretBMI(bmiValue);
                    tv3.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));
                }
            }
        });
    }

    private float calculateBMI(float weight, float height) {
        float result = weight / (height * height);
        return result;
    }

    private String interpretBMI(float bmiValue) {
        return bmiValue < 16.0F?"Severely underweight":((double)bmiValue < 18.5D?"Underweight":(bmiValue < 25.0F?"Normal":(bmiValue < 30.0F?"Overweight":"Obese")));
    }
}//end of program
