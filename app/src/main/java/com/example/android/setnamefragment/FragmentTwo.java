package com.example.android.setnamefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by USER on 7/6/2017.
 */

public class FragmentTwo extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable  ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_two, container, false);
        textView = (TextView) view.findViewById(R.id.output_name);

        return view;
    }

    public void updateName(String name){
        textView.setText(name);

    }

}
