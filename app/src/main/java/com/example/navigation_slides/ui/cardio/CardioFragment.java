package com.example.navigation_slides.ui.cardio;

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
import com.example.navigation_slides.databinding.FragmentCardioBinding;

public class CardioFragment extends Fragment {

    private CardioViewModel cardioViewModel;
    private FragmentCardioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cardioViewModel =
                new ViewModelProvider(this).get(CardioViewModel.class);

        binding = FragmentCardioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCardio;
        cardioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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