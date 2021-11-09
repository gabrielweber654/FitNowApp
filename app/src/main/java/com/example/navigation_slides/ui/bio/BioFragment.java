package com.example.navigation_slides.ui.bio;

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
import com.example.navigation_slides.databinding.FragmentBioBinding;

public class BioFragment extends Fragment {

    private BioViewModel bioViewModel;
    private FragmentBioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bioViewModel =
                new ViewModelProvider(this).get(BioViewModel.class);

        binding = FragmentBioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBio;
        bioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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