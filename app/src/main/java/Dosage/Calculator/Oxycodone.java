package Dosage.Calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.app.Activity;
/**
 * Created by roder on 11/28/2016.
 */

public class Oxycodone extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent myI =getIntent();
        double weight = myI.getIntExtra("wt",0);
        double vD = weight * 2.8; //volume of distribution
        double ttcLower =  ((5/(70*vD))*.5) *1000;
        double ttcUpper =  ((15/(70*vD))*.5) *1000;

    }
}
