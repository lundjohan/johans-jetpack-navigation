package lund.johan.testingjetpacknavigation.screens;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import lund.johan.testingjetpacknavigation.R;
import lund.johan.testingjetpacknavigation.logger.BackStackLogger;

public class FragmentB extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b,container,false);
        Button btn = v.findViewById(R.id.from_b_to_c);
        final Fragment that = this;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(that).navigate(R.id.action_b_destination_to_c_destination);
            }
        });
       TextView textView =  v.findViewById(R.id.textView);
       //this is done exactly like said in manual: https://developer.android.com/guide/navigation/navigation-pass-data
       String strFromFragmentA = FragmentBArgs.fromBundle(getArguments()).getStringArg();
       textView.setText(strFromFragmentA);


        new BackStackLogger(this.getClass().getName(),getParentFragmentManager()).log();
        return v;
    }
}