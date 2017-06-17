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

public class Tab3 extends Fragment {
    private TextView tview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab3, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle b){
        this.tview = (TextView) view.findViewById(R.id.tab3text);


    }
    public void setText(String s){
        tview.setText(s);
    }
}
