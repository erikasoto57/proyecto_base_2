package com.cetys.angelarambula.android.practica_02_base.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.cetys.angelarambula.android.practica_01_base.R;
import com.cetys.angelarambula.android.practica_02_base.controller.CoachesAdapter;
import com.cetys.angelarambula.android.practica_02_base.model.Coach;
import com.cetys.angelarambula.android.practica_02_base.utils.ParserUtils;

import org.json.JSONException;

import java.util.ArrayList;


public class DataListingActivity extends Activity {

    ListView lstView = null;
    CoachesAdapter adapter = null;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_listing);

        progressDialog = new ProgressDialog(DataListingActivity.this);

        lstView = (ListView) findViewById(R.id.lstList);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                Coach coach = (Coach) parent.getItemAtPosition(position);
                Intent intent = new Intent(getApplicationContext(), Details.class);
                intent.putExtra("COACH_ID", Integer.valueOf(coach.getnID()).toString());
                intent.putExtra("COACH_NAME", coach.getsName());
                intent.putExtra("COACH_TEAM", coach.getsTeam());
                startActivity(intent);
            }
        });
        adapter = new CoachesAdapter(this);

        lstView.setAdapter(adapter);
        new PullTask().execute();
    }

    public void llenarDatos(ArrayList<Coach> coachesList) {
        for (Coach coach : coachesList) {
            adapter.add(coach);
        }
        adapter.notifyDataSetChanged();
    }


    private class PullTask extends AsyncTask<Void, Integer, ArrayList<Coach>>
    {
        ParserUtils parser;
        @Override
        protected void onPreExecute() {
            parser = new ParserUtils();
            progressDialog.setMessage(getString(R.string.loading));
            progressDialog.show();
        }

        @Override
        protected ArrayList<Coach> doInBackground(Void... params) {
            ArrayList<Coach> coaches = new ArrayList<Coach>();
            try {
                coaches = parser.getCoaches();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return coaches;
        }

        @Override
        protected void onPostExecute(ArrayList<Coach> result) {
            llenarDatos(result);
            progressDialog.dismiss();
        }
    }

}
