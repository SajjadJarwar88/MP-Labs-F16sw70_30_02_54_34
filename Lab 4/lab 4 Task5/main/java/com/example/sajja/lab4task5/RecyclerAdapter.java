package com.example.sajja.lab4task5;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.PrivateKey;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>
{
   private List<String> list;
   public RecyclerAdapter(List<String> list)
   {
      this.list=list;
   }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        TextView textView=(TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.textviewlayout,viewGroup,false);
        MyViewHolder myViewHolder= new MyViewHolder(textView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i)
    {
        viewHolder.VersionName.setText(list.get(i));

    }

    @Override
    public int getItemCount()
    {

        return list.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView VersionName;
        public MyViewHolder(View itemView)
        {
            super(itemView);
            VersionName= (TextView) itemView;
        }
    }
}
