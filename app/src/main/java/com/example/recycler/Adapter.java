package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    //variable for ViewHolder  (WILL HAVE TO IMPORT "List" Class)
    private List<ModelClass> userList;


    //constructor : Adapter      (JUST GENERATE)
    public Adapter(List<ModelClass> userList) {
        this.userList = userList;
    }




    //inflate the design of layout resource file ("item_design.xml")
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //simple just follow through from previous code
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_design,parent, false);


        //view is our variable which was declared above line
        return new ViewHolder(view);
    }







    //bind data from main activity.java (MAY BE FROM RESOURCE)     to recycler view
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {


        //declare variables, give different names from model class
        //just follow through
        int resources = userList.get(position).getImageView1();
        String name = userList.get(position).getTextView();
        String msg = userList.get(position).getTextView2();
        String time = userList.get(position).getTextView3();
        String line = userList.get(position).getTextView4();



        //send data to holder
        //method for setData is at the bottom
        holder.setData(resources,name,msg,time,line);

    }







    @Override
    public int getItemCount() {

        //to inform how many items are there
        return userList.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder{



        //assign model layout xml id into holder
        //choose any name
        private ImageView imageView;
        private TextView textview;
        private TextView textview2;
        private TextView textview3;
        private TextView divider;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            //assign xml id
            imageView = itemView.findViewById(R.id.imageview1);
            textview = itemView.findViewById(R.id.textview);
            textview2 = itemView.findViewById(R.id.textview2);
            textview3 = itemView.findViewById(R.id.textview3);
            divider = itemView.findViewById(R.id.divider);
        }




        //after creating method of setData
        public void setData(int resources, String name, String msg, String time, String line) {

            //set data to above variables
            //declared in onBindViewHolder
            imageView.setImageResource(resources);
            textview.setText(name);
            textview2.setText(time);
            textview3.setText(msg);
            divider.setText(line);




        }
    }
}
