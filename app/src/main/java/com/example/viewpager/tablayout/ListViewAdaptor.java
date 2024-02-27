package com.example.viewpager.tablayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.viewpager.R;

import java.util.List;

public class ListViewAdaptor extends BaseAdapter {


   List<Information> list;
    LayoutInflater inflater;

    Context context;

    public ListViewAdaptor(Context context, List<Information> list){


      this.list=list;
        this.inflater=LayoutInflater.from(context);
        this.context=context;
    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i)
    {

        ;
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        view=inflater.inflate(R.layout.listview,null);
       TextView name=view.findViewById(R.id.name);
       ImageView img=view.findViewById(R.id.img);
       TextView about=view.findViewById(R.id.about);

        name.setText(list.get(i).getName());
        img.setImageResource(list.get(i).getImg());
        about.setText(list.get(i).getAbout());

        return view;
    }
}
