package com.dua.dailyduaapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DuaAdapter extends RecyclerView.Adapter<DuaAdapter.ViewHolder> {

    private List<Dua> duaList;
    private Context context;

    // Constructor to initialize the list and context
    public DuaAdapter(Context context, List<Dua> duaList) {
        this.context = context;
        this.duaList = duaList;
    }

    // IMPORTANT: This method fixes the 'setFilteredList' error in MainActivity
    public void setFilteredList(List<Dua> filteredList) {
        this.duaList = filteredList;
        notifyDataSetChanged(); // This refreshes the list on your screen
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the card_item.xml layout
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Dua currentDua = duaList.get(position);

        // Setting the text for name and purpose
        holder.nameTv.setText(currentDua.getName());
        holder.purposeTv.setText(currentDua.getPurpose());

        // Handling the click: Opens 'dua_detail_activity' when a card is clicked
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, dua_detail_activity.class);

                // Passing data to the detail screen
                intent.putExtra("name", currentDua.getName());
                intent.putExtra("arabic", currentDua.getArabic());
                intent.putExtra("translation", currentDua.getTranslation());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return duaList.size();
    }

    // ViewHolder class to link Java with XML IDs
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv, purposeTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.tvName);
            purposeTv = itemView.findViewById(R.id.tvPurpose);
        }
    }
}