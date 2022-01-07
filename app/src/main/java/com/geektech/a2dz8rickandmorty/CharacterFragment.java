package com.geektech.a2dz8rickandmorty;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.a2dz8rickandmorty.databinding.FragmentCharacterBinding;

public class CharacterFragment extends Fragment {

   private FragmentCharacterBinding binding;
   private CharacterFragmentArgs args;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(LayoutInflater.from(requireActivity()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        args = CharacterFragmentArgs.fromBundle(getArguments());

            String getArg = args.getName();
            binding.text.setText(getArg);


    }
}