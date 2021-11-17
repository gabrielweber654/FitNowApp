package com.example.navigation_slides.ui.bodybuilding;

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
import com.example.navigation_slides.databinding.FragmentBodybuildingBinding;

public class BodybuildingFragment extends Fragment {

    private BodybuildingViewModel bodybuildingViewModel;
    private FragmentBodybuildingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bodybuildingViewModel =
                new ViewModelProvider(this).get(BodybuildingViewModel.class);

        binding = FragmentBodybuildingBinding.inflate(inflater, container, false);



        View root = binding.getRoot();

        final TextView textView = binding.textBodybuilding;
        bodybuildingViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}


        /*    <com.google.android.material.floatingactionbutton.FloatingActionButton
android:id="@+id/fab"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="bottom|end"
android:layout_marginEnd="@dimen/fab_margin"
android:layout_marginRight="@dimen/fab_margin"
android:layout_marginBottom="16dp"
app:srcCompat="@drawable/add"
tools:ignore="SpeakableTextPresentCheck" />*/

