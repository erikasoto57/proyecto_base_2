package com.cetys.angelarambula.android.practica_02_base.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.cetys.angelarambula.android.practica_01_base.R;
import com.cetys.angelarambula.android.practica_02_base.model.Coach;

/**
 * Created by AngelArambula on 4/17/15.
 */
public class CoachesAdapter extends ArrayAdapter<Coach> {
    public CoachesAdapter(Context context) {
        super(context, R.layout.row_list, R.id.txtRowID);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View oView = super.getView(position, convertView, parent);

        TextView txtID = (TextView) oView.findViewById(R.id.txtRowID);
        TextView txtName = (TextView) oView.findViewById(R.id.txtRowName);
        TextView txtTeam = (TextView) oView.findViewById(R.id.txtRowTeam);

        Coach oCoachJr = getItem(position);

        txtID.setText(String.valueOf(oCoachJr.getnID()));
        txtName.setText(oCoachJr.getsName());
        txtTeam.setText(oCoachJr.getsTeam());

        return oView;
    }
}
