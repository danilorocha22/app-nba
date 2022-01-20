package com.danilorocha.nba.ui.timefora;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.danilorocha.nba.R;
import com.danilorocha.nba.ui.timecasa.TimeCasa;

import java.util.List;

public class TimeForaAdapter extends RecyclerView.Adapter<TimeForaAdapter.MyViewHolder> {
    private List<TimeFora> lista;
    private View.OnClickListener onClickListener;

    public TimeForaAdapter(List<TimeFora> lista) {
        this.lista = lista;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtViewDados);
            itemView.setTag(this);
            itemView.setOnClickListener(onClickListener);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.simple_layout_recycler_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeForaAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(String.valueOf(lista.get(position)));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void setItemClick(View.OnClickListener itemClick) {
        this.onClickListener = itemClick;
    }
}
