package com.example.navigation_slides.ui.crossfit;

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
import com.example.navigation_slides.databinding.FragmentCrossfitBinding;
import com.google.android.material.snackbar.Snackbar;

public class CrossfitFragment extends Fragment {

    private CrossfitViewModel crossfitViewModel;
    private FragmentCrossfitBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        crossfitViewModel =
                new ViewModelProvider(this).get(CrossfitViewModel.class);

        binding = FragmentCrossfitBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCrossfit;
        crossfitViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
       /* binding.crossfitBar.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Workout added!", Snackbar.LENGTH_LONG)
                        .setAction("Add workout", null).show();
            }
        });*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}