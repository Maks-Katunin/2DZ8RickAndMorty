package com.geektech.a2dz8rickandmorty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.geektech.a2dz8rickandmorty.databinding.FragmentLocationBinding;

import java.util.ArrayList;

public class LocationFragment extends Fragment implements IOnClick {

    private FragmentLocationBinding binding;
    private ArrayList<ModelLocation> locations;
    private LocationAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLocationBinding.inflate(LayoutInflater.from(requireActivity()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapter = new LocationAdapter(locations, this:: onClick);
        binding.recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        locations = new ArrayList<>();
        locations.add(new ModelLocation("earth", "moon"));
        locations.add(new ModelLocation("earth", "thfgdf"));
        locations.add(new ModelLocation("earth", "hfhh"));
        locations.add(new ModelLocation("earth", "nhkii"));
        locations.add(new ModelLocation("earth", "ertyuikjh"));
        locations.add(new ModelLocation("earth", "vbnkiuh"));
        locations.add(new ModelLocation("earth", "wszxcvbn"));
        locations.add(new ModelLocation("earth", "eruj"));
        locations.add(new ModelLocation("earth", "ghiuytred"));
        locations.add(new ModelLocation("earth", "ert789olk"));
        locations.add(new ModelLocation("earth", "vbjytfd"));
        locations.add(new ModelLocation("earth", "fgjmcv"));
        locations.add(new ModelLocation("earth", "xcvmhcvbn"));
        locations.add(new ModelLocation("earth", "fghkmnbvcvb"));
        locations.add(new ModelLocation("earth", "ghjuiuygv"));
        locations.add(new ModelLocation("earth", "qax"));
        locations.add(new ModelLocation("earth", "zhjkp["));
        locations.add(new ModelLocation("earth", "jgvbnm"));
        locations.add(new ModelLocation("earth", "bnhmghm"));
        locations.add(new ModelLocation("earth", "fgjhb"));
        locations.add(new ModelLocation("earth", "xdshyuk"));
        locations.add(new ModelLocation("earth", "zxcjj"));
    }

    @Override
    public void onClick(ModelLocation location) {
        NavHostFragment.findNavController(this).navigate
                (LocationFragmentDirections.actionLocationFragmentToSignInScreenFragment(location));
    }
}