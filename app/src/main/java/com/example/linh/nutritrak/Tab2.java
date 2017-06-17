package com.example.linh.nutritrak;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Duong D.T. Nguyen on 6/17/2017.
 */

public class Tab2 extends Fragment {

    private TextView tviewfat,tviewcho,tviewsod,tviewpot,tviewcar,tviewpro;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab2, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle b){
        this.tviewfat = (TextView) view.findViewById(R.id.tab2fatdata);
        this.tviewcho = (TextView) view.findViewById(R.id.tab2chodata);
        this.tviewsod = (TextView) view.findViewById(R.id.tab2soddata);
        this.tviewpot = (TextView) view.findViewById(R.id.tab2potdata);
        this.tviewcar = (TextView) view.findViewById(R.id.tab2cardata);
        this.tviewpro = (TextView) view.findViewById(R.id.tab2prodata);

    }
    public void showResult(NutritionFact nf){

        tviewfat.setText(nf.getFat());
        tviewcho.setText(nf.getCho());
        tviewsod.setText(nf.getSod());
        tviewpot.setText(nf.getPot());
        tviewcar.setText(nf.getCar());
        tviewpro.setText(nf.getPro());
    }

}
