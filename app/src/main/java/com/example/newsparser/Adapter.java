package com.example.newsparser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.NewsViewHolder> {

    Context mContext;
    List<Item> mData;

    public Adapter(Context mContext, List<Item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.card_item, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        holder.backgroundImage.setImageResource(mData.get(position).getBackground());
        holder.profilePhoto.setImageResource(mData.get(position).getProfilePhoto());
        holder.title.setText(mData.get(position).getItemTitle());
        holder.nbFollowers.setText("1000");
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{

        ImageView profilePhoto;
        ImageView backgroundImage;

        TextView title;
        TextView nbFollowers;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePhoto = itemView.findViewById(R.id.profile_img);
            backgroundImage = itemView.findViewById(R.id.card_background);

            title = itemView.findViewById(R.id.card_title);
            nbFollowers = itemView.findViewById(R.id.card_nb_follower);

        }

    }
}
