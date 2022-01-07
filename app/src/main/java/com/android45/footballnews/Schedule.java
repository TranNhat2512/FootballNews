package com.android45.footballnews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.android45.footballnews.databinding.ScheduleFragmentBinding;

public class Schedule extends Fragment {
    ScheduleFragmentBinding binding;

    public static Schedule newInstance() {

        Bundle args = new Bundle();

        Schedule fragment = new Schedule();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.schedule_fragment, container, false);
        return binding.getRoot();
    }
}