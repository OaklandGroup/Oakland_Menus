package com.oaklandmenus.sophomoreproject.oakland_menus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Calculation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txtbox = (TextView) findViewById(R.id.txtbox1);
        TextView txtbox2 = (TextView) findViewById(R.id.txtbox2);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent intent = getIntent();
        String[] myStrings = intent.getStringArrayExtra("FoodName");
        int[] foodcal = intent.getIntArrayExtra("CaloriesPerUnit");
        double[] foodprice = intent.getDoubleArrayExtra("PricePerUnit");
        int sum=0;
        double sum1=0;
        String astring = Double.toString(sum1);
        for(int i=0; i<foodcal.length; i++){
            sum=sum+foodcal[i];
            txtbox.setText(sum);

        }

        for(int i=0; i<foodprice.length;i++)
            sum1= sum1+foodprice[i];
        txtbox2.setText(astring);





    }

}
*/
