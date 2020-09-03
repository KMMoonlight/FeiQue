package com.kmmoonlight.feique.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kmmoonlight.feique.databinding.FragmentDocLayoutBinding;
import com.kmmoonlight.feique.ui.base.BaseFragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DocFragment extends BaseFragment {

    private FragmentDocLayoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDocLayoutBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }
}
