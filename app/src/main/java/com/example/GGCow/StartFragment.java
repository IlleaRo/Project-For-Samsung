package com.example.GGCow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class StartFragment extends Fragment {

    public String text;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        TextView textOnS = view.findViewById(R.id.textOnNewScreen);

        Button button = (Button) view.findViewById(R.id.contButton);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentActivity activity = getActivity();
                if (activity != null && activity instanceof MainActivity){
                    ((MainActivity) activity).StartGame(v);
                }
            }
        });
        return view;
    }
}
