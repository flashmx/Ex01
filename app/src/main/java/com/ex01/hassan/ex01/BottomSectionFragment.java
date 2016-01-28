package com.ex01.hassan.ex01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment{
    private static TextView t_top, t_bottom;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.bottom_section,container,false);
        t_top=(TextView)view.findViewById(R.id.t_top);
        t_bottom=(TextView)view.findViewById(R.id.t_bottom);

        return view;
    }

    public void setMemeText(String top,String bottom){
        t_top.setText(top);
        t_bottom.setText(bottom);
    }
}
