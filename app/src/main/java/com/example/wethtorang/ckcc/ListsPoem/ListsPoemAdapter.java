package com.example.wethtorang.ckcc.ListsPoem;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.wethtorang.ckcc.R;

import java.util.List;

/**
 * Created by WETHTORANG on 7/19/2016.
 */
public class ListsPoemAdapter extends RecyclerView.Adapter<ListsPoemAdapter.MyViewHolder> {
    private List<Peom> poemLists;
    private Context context;
    public ListsPoemAdapter(List<Peom> list,Context context){
        this.context = context;
        this.poemLists = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_row_list_poem,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListsPoemAdapter.MyViewHolder holder, int position) {
        Peom poems = poemLists.get(position);
        holder.title.setText(poems.getTitle());
        holder.number.setText(poems.getNumber());
    }

    @Override
    public int getItemCount() {
        return poemLists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,number ;
        public Button btn;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            number = (TextView) view.findViewById(R.id.content);
            btn=(Button) view.findViewById(R.id.play);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                    alertDialog.setTitle("សូមអរភ័យទោស !");
                    alertDialog.setMessage("ពួកយើងកំពុងបង្កើត");
                    alertDialog.show();
                }
            });
        }
    }
}
