package com.oaklandmenus.sophomoreproject.oakland_menus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public void buttonOnClick(View view)
    {

        switch (view.getId())
        {

            case R.id.restaurants:
                startActivity(new Intent(this, RestaurantMenuActivity.class));

                break;

            case R.id.Coffee:
                startActivity(new Intent(this, CoffeeMenuActivity.class));

                break;

            case R.id.Rating:
                startActivity(new Intent(this, RatingActivity.class));

                break;

        }
    }

    /*public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.restaurants:
                startActivity(new Intent(MainActivity.this, RestaurantMenuActivity.class));
                return true;
            case R.id.Coffee:
                startActivity(new Intent(this, CoffeeMenuActivity.class));
                return true;
            //case R.id.Map:
                //startActivity(new Intent(this, Maps.class));
           // case R.id.ratings:
                //startActivity(new Intent(this, RatingActivity.class));
                //return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
}
