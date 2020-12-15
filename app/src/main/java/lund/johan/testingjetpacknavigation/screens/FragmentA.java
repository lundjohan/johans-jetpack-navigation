package lund.johan.testingjetpacknavigation.screens;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;

import lund.johan.testingjetpacknavigation.R;
import lund.johan.testingjetpacknavigation.logger.BackStackLogger;

public class FragmentA extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a,container,false);
        Button btn = v.findViewById(R.id.from_a_to_b);
        final Fragment that = this;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentADirections.ActionADestinationToBDestination action =
                        FragmentADirections.actionADestinationToBDestination().setStringArg("String from A to B");
                NavHostFragment.findNavController(that).navigate(action);
            }
        });
        new BackStackLogger(this.getClass().getName(),getParentFragmentManager()).log();
        return v;
    }
}
