package com.ex01.hassan.ex01;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment{

    private static EditText e_top,e_bottom;
    private static Button b_send;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
          void CreateMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander=(TopSectionListener)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

/*    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = context instanceof Activity ? (Activity) context : null;

        try{
            activityCommander=(TopSectionListener)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.top_section,container,false);

        e_top=(EditText) view.findViewById(R.id.e_top);
        e_bottom=(EditText) view.findViewById(R.id.e_bottom);
        b_send=(Button)view.findViewById(R.id.b_send);

        b_send.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                buttonClicked(v);
            }
        });

        return view;
    }
    public void buttonClicked(View view){
        activityCommander.CreateMeme(e_top.getText().toString(),e_bottom.getText().toString());
    }

}
