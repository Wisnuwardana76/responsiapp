package com.example.responsiapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DaftarAdapter extends RecyclerView.Adapter<DaftarAdapter.DaftarViewHolder>{
    private final LayoutInflater mInflater;
    private List<DaftarAdapter> Daftarlist;
    private LayoutInflater layoutInflater;
    private Context context;
    final DaftarAdapter,AdapterView.OnItemClickListener Listener;

    public DaftarAdapter(List<DaftarAdapter> Daftarlist, Context context, AdapterView.OnItemClickListener listener) {
    this.mInflater = LayoutInflater.from(context);
    this.Daftarlist = Daftarlist;
    this.context = context;
    this.Listener = listener;
    }
    public DaftarAdapter.DaftarViewHolder onCreateViewHolder(ViewGroup parent, int viewTyper) {
        View view = mInflater.inflate(R.layout.item_daftarnama, null);
        return new DaftarAdapter.DaftarViewHolder(view);
    }

}