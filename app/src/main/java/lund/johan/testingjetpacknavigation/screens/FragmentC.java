package lund.johan.testingjetpacknavigation.screens;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import lund.johan.testingjetpacknavigation.R;

public class FragmentC extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_c,container,false);
        Button btn = v.findViewById(R.id.from_c_to_a);
        final Fragment that = this;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(that).navigate(R.id.action_c_destination_to_a_destination);
            }
        });
        return v;
    }
}