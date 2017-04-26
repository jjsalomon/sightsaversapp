package com.example.mark.sightsavers.visionsimulator.vsimulator;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.mark.sightsavers.MainActivity;
import com.example.mark.sightsavers.R;

public class ShowResults2 extends Activity implements View.OnClickListener {

    Button nextbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_results2);

        nextbtn = (Button)findViewById(R.id.nexbtn2);
        nextbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.nexbtn2:{
                Intent intent = new Intent(this, ShowTest3.class);
                startActivity(intent);
            }
        }
    }

}
