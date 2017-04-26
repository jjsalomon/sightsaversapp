package com.example.mark.sightsavers.visionsimulator.vsimulator;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.mark.sightsavers.MainActivity;
import com.example.mark.sightsavers.R;

public class ShowResults3 extends Activity implements View.OnClickListener{

    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_results3);

        nextBtn = (Button)findViewById(R.id.nexbtn3);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.nexbtn3:{
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }
    }
}
