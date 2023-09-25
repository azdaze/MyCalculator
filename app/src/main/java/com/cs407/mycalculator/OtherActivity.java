package com.cs407.mycalculator;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("RESULT");
        textView.setText(str);
    }

}
