package com.GadsMobileEdu22.Schoolbox365.admin.ui.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.GadsMobileEdu22.Schoolbox365.admin.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentSearchBinding.inflate(inflater);
        return mBinding.getRoot();
    }
}