package com.example.navigation_slides.ui.goals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigation_slides.R;
import com.example.navigation_slides.databinding.FragmentGoalsBinding;

public class GoalsFragment extends Fragment {

    private GoalsViewModel goalsViewModel;
    private FragmentGoalsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        goalsViewModel =
                new ViewModelProvider(this).get(GoalsViewModel.class);

        binding = FragmentGoalsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGoals;
        goalsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}