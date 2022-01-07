package com.geektech.a2dz8rickandmorty;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.a2dz8rickandmorty.databinding.ItemLocationBinding;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {


    private ArrayList<ModelLocation> list;
    private IOnClick listener;

    public LocationAdapter(ArrayList<ModelLocation> list, IOnClick onClick) {
        this.list = list;
        listener = onClick;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LocationViewHolder viewHolder = new LocationViewHolder(ItemLocationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(list.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class LocationViewHolder extends RecyclerView.ViewHolder {
        private ItemLocationBinding binding;

        public LocationViewHolder(@NonNull ItemLocationBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(ModelLocation modelLocation) {
            binding.location.setText(modelLocation.getLoc());
            binding.location2.setText(modelLocation.getLoc2());
        }
    }
}
