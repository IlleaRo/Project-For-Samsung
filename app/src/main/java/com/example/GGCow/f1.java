package com.example.GGCow;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class f1 extends Fragment {

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f1, container, false);
        TextView mText = view.findViewById(R.id.f1text);
        mText.setMovementMethod(new ScrollingMovementMethod());
        mText.setText("\tПриветствую!\n" +
                "Это история о одинокой корове по имени Коу. Тебе придется почувствовать себя жителем этого тяжелого мира. \n" +
                "Изначально Коу жила на тропическом острове. Она ела банановые листья и пила кокосовое молоко. Но однажды, приплыли русские на атомном ледоколе и разрушили остров, они схватили нашу героиню и отправили ее в ссылку в Сибирь в Новосибирск.\n" +
                "Коу приходится жить на ферме в Криводановке. Как всем известно, здесь нет ни банановых листьев, ни кокосового молока. Это расстраивает коровку, и она планирует побег. \n" +
                "Сможете ли вы помочь Коу сбежать?");
        Button button = (Button) view.findViewById(R.id.f1button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentActivity activity = getActivity();
                if (activity != null && activity instanceof MainActivity){
                    ((MainActivity) activity).Clack(v,2);
                }
            }
        });
        return view;
    }

}