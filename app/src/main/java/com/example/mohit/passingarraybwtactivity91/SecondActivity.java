package com.example.mohit.passingarraybwtactivity91;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tname, tdesig, tnumb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tname = findViewById(R.id.txtname);
        tdesig = findViewById(R.id.txtdesig);
        tnumb = findViewById(R.id.txtnum);
        
        //getting data in the form of array
        String []data = getIntent().getStringArrayExtra("data_key");
        tname.setText(data[0]);
        tdesig.setText(data[1]);
        tnumb.setText(data[2]);
    }
}
