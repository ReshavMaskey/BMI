package com.example.bmiapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bmiapplication.logic.BMICategory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnConvert, btnClose;
    EditText txtWeight, txtHeight;
    TextView lblResult;

    float weight,height,bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConvert = findViewById(R.id.btnConvert);
        txtHeight = findViewById(R.id.txtHeight);
        txtWeight = findViewById(R.id.txtWeight);
        btnClose = findViewById(R.id.btnClose);
        lblResult = findViewById(R.id.lblResult);

        btnConvert.setOnClickListener(this);
        btnClose.setOnClickListener(this);


    }

//    private  void bmiCalculation(){
//        weight = Float.parseFloat(txtWeight.getText().toString());
//        height = Float.parseFloat(txtHeight.getText().toString());
//        System.out.println("Height: "+height +"weight: "+weight);
//        bmi = weight /(height * height);
//        lblResult.setText("BMI :[ "+bmi+" ]\n");
//    }
public void calculateBMI() {
    String heightStr = txtHeight.getText().toString();
    String weightStr = txtWeight.getText().toString();

    if (heightStr != null && !"".equals(heightStr)
            && weightStr != null  &&  !"".equals(weightStr)) {
        float heightValue = Float.parseFloat(heightStr)/100;
        float weightValue = Float.parseFloat(weightStr);

        float bmi = (weightValue / (heightValue * heightValue));

        lblResult.setText("BMI :[ "+bmi+" ]\n");
        displayBMI();
    }
}

    public void displayBMI(){
        BMICategory  bmic = new BMICategory();
        lblResult.append(bmic.getCategory(bmi));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnConvert:
            calculateBMI();
//            displayBMI();
                break;
                default:
                    break;
        }

    }
}
