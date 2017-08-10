package com.haerokim.yieldcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button theory = (Button) findViewById(R.id.theory);
        theory.setOnClickListener(this);
    }

    public void onClick(View v) {
        EditText saliInput = (EditText) findViewById(R.id.saliInput);
        EditText aspiOutput = (EditText) findViewById(R.id.aspiOutput);
        TextView resultTheory = (TextView) findViewById(R.id.resultTheory);

        double sali = Double.parseDouble(saliInput.getText().toString());
        double aspi = Double.parseDouble(aspiOutput.getText().toString());
        double result;

        switch (v.getId()) {
            case R.id.theory:
                result = ((aspi / 180.16) / (sali / 138.12)) * 100;
                resultTheory.setText("" + result);
                break;
        }
    }
}
