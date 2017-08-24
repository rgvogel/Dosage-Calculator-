package Dosage.Calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.content.Intent;

public class MainActivity extends AppCompatActivity    {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner drugS = (Spinner) findViewById( R.id.spin_drug);
        final Button Enz_next = (Button) findViewById(R.id.Enz_next);
        final EditText weight = (EditText)findViewById(R.id.field_weight);
        Enz_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String str1 = weight.getText().toString();
                String str2 = drugS.toString();
                if(TextUtils.isEmpty(str1)){
                    weight.setError("Please enter your weight");
                    weight.requestFocus();
                    return;
                }
                float wt = Float.parseFloat(str1);

                Intent myI;
                //Toast.makeText(getApplicationContext(), "no valid values", Toast.LENGTH_LONG);
                if(str2.equals("Oxycodone")){
                   myI=  new Intent(MainActivity.this,Oxycodone.class);
                    myI.putExtra("weight",wt);
                    startActivity(myI);
                }
            }
    });
}}
