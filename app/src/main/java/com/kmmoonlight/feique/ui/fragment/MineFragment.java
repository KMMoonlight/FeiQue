package com.kmmoonlight.feique.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kmmoonlight.feique.databinding.FragmentMineLayoutBinding;
import com.kmmoonlight.feique.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MineFragment extends BaseFragment {

    private FragmentMineLayoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentMineLayoutBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

}
