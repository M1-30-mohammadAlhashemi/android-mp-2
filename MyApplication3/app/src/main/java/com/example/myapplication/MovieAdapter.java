package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//public class SampleRecycler extends RecyclerView.Adapter<SampleHolder>
public class MovieAdapter extends RecyclerView.Adapter {

    ArrayList<Movies>myArray;
    Context context;

    public MovieAdapter(ArrayList<Movies> myArray, Context context) {
        this.myArray = myArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list,parent,false);
        ViewHolder ve =new ViewHolder(v);
        return ve;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).rating.setText( myArray.get(position).getRating()+"");
        ((ViewHolder)holder).duration.setText( myArray.get(position).getDurtion()+"");
        ((ViewHolder)holder).name.setText( myArray.get(position).getName());
        ((ViewHolder)holder).img1.setImageResource( myArray.get(position).getImg());

    }

    @Override
    public int getItemCount() {

        return myArray.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img1;
        public TextView name;
        public TextView duration;
        public TextView rating;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img1=view.findViewById(R.id.imageView2);
            name = view.findViewById(R.id.textView);
            rating = view.findViewById(R.id.textView5);
            duration= view.findViewById(R.id.textView7);

        }
    }



}
