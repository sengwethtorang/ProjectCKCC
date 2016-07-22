package com.example.wethtorang.ckcc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wethtorang.ckcc.ListsPoem.FourPeom;
import com.example.wethtorang.ckcc.ListsPoem.Main2Activity;
import com.example.wethtorang.ckcc.ListsPoem.Promkit;
import com.example.wethtorang.ckcc.ListsPoem.SevenPeom;

import java.util.List;

class LayoutAdapter extends RecyclerView.Adapter<LayoutAdapter.MyViewHolder>{
    private List<Layout> layoutAdapters;
    private Context context;
    
    public LayoutAdapter(List<Layout> layoutAdapterList, Context context){
        this.layoutAdapters = layoutAdapterList;
        this.context = context;
    }
    @Override
    public LayoutAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_row_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LayoutAdapter.MyViewHolder holder, final int position) {
        Layout layout = layoutAdapters.get(position);
        holder.title.setText(layout.getTitle());
        Glide.with(context).load("http://a.abcnews.com/images/Business/AP_Playboy_March_2016_MEM_160325_16x9_992.jpg").into(holder.image);
        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position == 2){
                    Intent intent = new Intent(context, SevenPeom.class);
                    context.startActivity(intent);
                }else if(position == 0){
                    Intent intent = new Intent(context, FourPeom.class);
                    context.startActivity(intent);
                }else if(position == 1){
                    Intent intent = new Intent(context, Promkit.class);
                    context.startActivity(intent);
                }else if(position == 3){
                    Intent intent = new Intent(context, Main2Activity.class);
                    context.startActivity(intent);
                }else if(position == 4){
                    Intent intent = new Intent(context, Main2Activity.class);
                    context.startActivity(intent);
                }else if(position == 5){
                    String message = "http://google.com";
                    Intent share = new Intent(Intent.ACTION_SEND);
                    share.setType("text/plain");
                    share.putExtra(Intent.EXTRA_TEXT, message);
                    context.startActivity(Intent.createChooser(share, "Share this application!"));
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return layoutAdapters.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView image;
        public LinearLayout linear;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            image = (ImageView) view.findViewById(R.id.image);
            linear = (LinearLayout) view.findViewById(R.id.layout);

        }
    }
}