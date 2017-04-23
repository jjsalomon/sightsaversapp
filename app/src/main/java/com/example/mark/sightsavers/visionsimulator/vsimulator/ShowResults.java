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


    TextView firstresult;
    TextView secondresult;
    TextView thirdresult;

    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showresults);

        firstresult = (TextView)findViewById(R.id.firstRes);
        firstresult.setText(ResultsData.getFirstInstance().getResults(1));

        secondresult = (TextView)findViewById(R.id.secondRes);
        secondresult.setText(ResultsData.getFirstInstance().getResults(2));

        thirdresult =(TextView)findViewById(R.id.thirdRes);
        thirdresult.setText(ResultsData.getFirstInstance().getResults(3));

        nextBtn = (Button)findViewById(R.id.nextbtn);

        nextBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.nextbtn:{
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }
    }
}
