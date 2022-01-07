package com.android45.footballnews;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android45.footballnews.databinding.RankingsFragmentBinding;

public class Rankings extends Fragment {
    RankingsFragmentBinding binding;

    public static Rankings newInstance() {

        Bundle args = new Bundle();

        Rankings fragment = new Rankings();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.rankings_fragment, container, false);
        return binding.getRoot();
    }
}