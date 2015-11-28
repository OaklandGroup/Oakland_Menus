package com.oaklandmenus.sophomoreproject.oakland_menus;

import java.text.DecimalFormat;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class RatingActivity extends Activity implements OnRatingBarChangeListener {

    RatingBar R_Bar ;


    int count;
    float curRate;


    Boolean val = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        R_Bar = (RatingBar) findViewById(R.id.ratingBar);

        R_Bar.setOnRatingBarChangeListener(this);

        SharedPreferences sharePref = PreferenceManager.getDefaultSharedPreferences(RatingActivity.this);
        curRate = sharePref.getFloat("Get_Rating", 0.0f);



        if(val) {
            R_Bar.setRating(curRate);

        }
        else {
            R_Bar.setRating(curRate);
        }



    }




    @Override
    public void onRatingChanged (RatingBar ratingBar,float rating,
                                 boolean fromUser){
        // TODO Auto-generated method stub


        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        curRate = Float.valueOf(decimalFormat.format((curRate
                *count + rating)
                / ++count));




        // Showing a toast of current rating
        Toast.makeText(RatingActivity.this,
                "New Rating: " + curRate, Toast.LENGTH_SHORT)
                .show();

        // Set the current rating to setRatingBar
        R_Bar.setRating(curRate);

        // Show the current count value

        curRate = R_Bar.getRating();
        SharedPreferences sharePref = PreferenceManager.getDefaultSharedPreferences(RatingActivity.this);
        SharedPreferences.Editor edit = sharePref.edit();
        edit.putFloat("Get_Rating", curRate);




        edit.commit();
        val = false;



    }
}
