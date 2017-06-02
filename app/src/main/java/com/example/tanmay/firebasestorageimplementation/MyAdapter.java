package com.example.tanmay.firebasestorageimplementation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by tanmay on 2/6/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private Context context;
    private List<Upload> uploads;

    public MyAdapter(Context context, List<Upload> uploads){
        this.uploads=uploads;
        this.context=context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_image,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        Upload upload=uploads.get(position);

        holder.textViewName.setText(upload.getName());
        Glide.with(context).load(upload.getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return uploads.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;
        public ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);

            textViewName=(TextView)itemView.findViewById(R.id.textViewName);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
