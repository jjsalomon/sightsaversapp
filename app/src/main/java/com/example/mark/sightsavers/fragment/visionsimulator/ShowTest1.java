package com.example.mark.sightsavers.fragment.visionsimulator;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.mark.sightsavers.R;

import static android.R.attr.value;

public class ShowTest1 extends Activity implements View.OnClickListener{

    Button cowbtn;
    Button deerbtn;
    ResultsData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        data = new ResultsData();

        cowbtn = (Button)findViewById(R.id.cow);
        deerbtn = (Button)findViewById(R.id.deer);

        cowbtn.setOnClickListener(this);
        deerbtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.cow:{
                Intent intent = new Intent(this,ShowTest2.class);
                data.addData("Cow");
                startActivity(intent);
            }

            case R.id.deer:{
                Intent intent = new Intent(this,ShowTest2.class);
                data.addData("Deer");
                startActivity(intent);
            }

        }
    }

}
