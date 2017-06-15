package com.example.android.setnamefragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;

/**
 * Created by USER on 7/6/2017.
 */

public class FragmentOne extends Fragment {
    EditText editText;
    Button button;
    OnNameSetListener onNameSetListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable  ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_one, container, false);

        editText = (EditText) view.findViewById(R.id.input_name);
        button = (Button) view.findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                onNameSetListener.setName(name);
            }
        });

        return view;
    }

    public interface OnNameSetListener{
        void setName(String name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try{
            onNameSetListener = (OnNameSetListener) activity;
        }catch(Exception e){}
    }
}
