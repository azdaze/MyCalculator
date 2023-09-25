package com.cs407.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void addFunc(View view) {
        EditText first = findViewById(R.id.FirstNum);
        EditText second = findViewById(R.id.SecondNum);

        String firster = first.getText().toString();
        String seconder = second.getText().toString();

        int firstNum = Integer.parseInt(firster);
        int secondNum = Integer.parseInt(seconder);

        int result = firstNum + secondNum;
        goToActivity("Result: " + result);
    }

    public void subtractFunc(View view) {
        EditText first = findViewById(R.id.FirstNum);
        EditText second = findViewById(R.id.SecondNum);

        String firster = first.getText().toString();
        String seconder = second.getText().toString();

        int firstNum = Integer.parseInt(firster);
        int secondNum = Integer.parseInt(seconder);

        int result = firstNum - secondNum;
        goToActivity("Result: " + result);
    }

    public void multiplyFunc(View view) {
        EditText first = findViewById(R.id.FirstNum);
        EditText second = findViewById(R.id.SecondNum);

        String firster = first.getText().toString();
        String seconder = second.getText().toString();

        int firstNum = Integer.parseInt(firster);
        int secondNum = Integer.parseInt(seconder);

        int result = firstNum * secondNum;
        goToActivity("Result: " + result);
    }

    public void divideFunc(View view) {
        EditText first = findViewById(R.id.FirstNum);
        EditText second = findViewById(R.id.SecondNum);

        String firster = first.getText().toString();
        String seconder = second.getText().toString();

        int firstNum = Integer.parseInt(firster);
        int secondNum = Integer.parseInt(seconder);

        if (secondNum == 0)
        {
            goToActivity("Divide by Zero Error Occurred");
        }
        else {
            int result = firstNum / secondNum;
            goToActivity("Result: " + result);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, OtherActivity.class);
        intent.putExtra("RESULT", s);
        startActivity(intent);
    }
}