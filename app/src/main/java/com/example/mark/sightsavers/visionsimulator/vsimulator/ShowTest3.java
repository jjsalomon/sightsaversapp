package com.example.mark.sightsavers.visionsimulator.vsimulator;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.mark.sightsavers.R;



public class ShowTest3 extends Activity implements View.OnClickListener {

    Button buttontwo;
    Button buttonsix;
    Button buttontwntysix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);

        buttontwo = (Button)findViewById(R.id.btntwo);
        buttonsix = (Button)findViewById(R.id.btnsix);
        buttontwntysix = (Button)findViewById(R.id.btntwntysix);

        buttontwo.setOnClickListener(this);
        buttonsix.setOnClickListener(this);
        buttontwntysix.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btntwo:{
                Intent intent = new Intent(this,ShowResults3.class);
                startActivity(intent);
            }

            case R.id.btnsix:{
                Intent intent = new Intent(this,ShowResults3.class);
                startActivity(intent);
            }

            case R.id.btntwntysix:{
                Intent intent = new Intent(this,ShowResults3.class);
                startActivity(intent);
            }

        }
    }

}
