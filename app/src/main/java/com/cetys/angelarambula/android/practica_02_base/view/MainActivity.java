package com.cetys.angelarambula.android.practica_02_base.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.cetys.angelarambula.android.practica_01_base.R;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                dataListActivity();
                return true;
            case R.id.action_greet:
                greetActivity();
                return true;
            case R.id.action_listView:
                dataListActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void greetActivity() {
        Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
        startActivity(intent);
    }

    private void dataListActivity() {
        Intent intent = new Intent(MainActivity.this, DataListingActivity.class);
        startActivity(intent);
    }

}
