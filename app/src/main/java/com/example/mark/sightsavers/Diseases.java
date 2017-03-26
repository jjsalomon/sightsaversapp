package com.example.mark.sightsavers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diseases extends Activity implements View.OnClickListener {

    Button Trachoma_Bt, River_Bt, Cataract_Bt, Glaucoma_Bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);

        Trachoma_Bt = (Button) findViewById(R.id.button4);
        River_Bt = (Button) findViewById(R.id.button5);
        Cataract_Bt = (Button) findViewById(R.id.button6);
        Glaucoma_Bt = (Button) findViewById(R.id.button7);

        Trachoma_Bt.setOnClickListener(this);
        River_Bt.setOnClickListener(this);
        Cataract_Bt.setOnClickListener(this);
        Glaucoma_Bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button4: {
                Intent trachomaIntent = new Intent(this, Trachoma.class);
                startActivity(trachomaIntent);

                break;
            }

            case R.id.button5: {
                Intent riverBlindnessIntent = new Intent(this, RiverBlindness.class);
                startActivity(riverBlindnessIntent);

                break;
            }

            case R.id.button6: {
                Intent cataractIntent = new Intent(this, Cataract.class);
                startActivity(cataractIntent);

                break;
            }

            case R.id.button7: {
                Intent glaucomaIntent = new Intent(this, Glaucoma.class);
                startActivity(glaucomaIntent);

                break;
            }

        } // Switch END
    } // onClick END
}
