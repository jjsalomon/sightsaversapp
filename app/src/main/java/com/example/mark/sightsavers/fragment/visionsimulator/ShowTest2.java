package com.example.mark.sightsavers.fragment.visionsimulator;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.mark.sightsavers.R;



public class ShowTest2 extends Activity implements View.OnClickListener {

    Button fivebtn;
    Button sizebtn;
    ResultsData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_test2);
        data = new ResultsData();

        fivebtn = (Button)findViewById(R.id.five);
        sizebtn = (Button)findViewById(R.id.six);

        fivebtn.setOnClickListener(this);
        sizebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.five:{
                Intent intent = new Intent(this,ShowTest2.class);
                data.addData("Five");
                startActivity(intent);
            }

            case R.id.deer:{
                Intent intent = new Intent(this,ShowTest2.class);
                data.addData("Six");
                startActivity(intent);

            }

        }
    }

}
