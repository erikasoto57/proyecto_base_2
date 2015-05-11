package com.cetys.angelarambula.android.practica_02_base.view;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.cetys.angelarambula.android.practica_01_base.R;

public class Details extends ActionBarActivity
{
    TextView tvCoachId;
    TextView tvCoachName;
    TextView tvCoachTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        tvCoachId = (TextView)findViewById(R.id.tv_coachId);
        tvCoachName = (TextView)findViewById(R.id.tv_coachName);
        tvCoachTeam = (TextView)findViewById(R.id.tv_coachTeam);

        tvCoachId.setText(intent.getStringExtra(("COACH_ID")));
        tvCoachName.setText(intent.getStringExtra("COACH_NAME"));
        tvCoachTeam.setText(intent.getStringExtra("COACH_TEAM"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}