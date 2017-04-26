package com.example.mark.sightsavers.visionsimulator.vsimulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mark.sightsavers.MainActivity;
import com.example.mark.sightsavers.R;

/**
 * Created by azkei on 23/04/2017.
 */

public class ShowResults extends Activity implements View.OnClickListener{



    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showresults1);


        nextBtn = (Button)findViewById(R.id.nexbtn);

        nextBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.nexbtn:{
                Intent intent = new Intent(this, ShowTest2.class);
                startActivity(intent);
            }
        }
    }
}
