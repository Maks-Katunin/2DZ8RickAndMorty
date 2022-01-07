package com.geektech.a2dz8rickandmorty;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.a2dz8rickandmorty.databinding.FragmentSignInScreenBinding;

public class SignInScreenFragment extends Fragment {

    private SignInScreenFragmentArgs args;
    private FragmentSignInScreenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSignInScreenBinding.inflate(LayoutInflater.from(requireActivity()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        args = SignInScreenFragmentArgs.fromBundle(getArguments());


        binding.deadOrAlive.setText(args.getLocation().getLoc());
        binding.name.setText(args.getLocation().getLoc2());
    }
}