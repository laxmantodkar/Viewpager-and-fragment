package com.example.viewpager.tablayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    private ViewPager2 viewPager2;

    private View view;
    private ListView listView;


    List<Information> list=new ArrayList();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_chat, container, false);

       listView=view.findViewById(R.id.listView);


        viewPager2 = getActivity().findViewById(R.id.viewPager);


       list.add(new Information("Laxman Tokdar",R.drawable.img,"Hi Im Laxman Todkar"));
        list.add(new Information("Akshata Todkar",R.drawable.img_1,"Hi Im Akshata Todkar"));
        list.add(new Information("Lata Todkar",R.drawable.img_2,"Hi Im Lata Todkar"));
        list.add(new Information("Akshay Mali",R.drawable.img_3,"Hi Im Akshay Mali"));
        list.add(new Information("Manish Mali",R.drawable.img_4,"Hi Im Manish Mali"));
        list.add(new Information("Mahesh Patil",R.drawable.img,"Hi Im Mahesh Patil"));
        list.add(new Information("Omkar Mali",R.drawable.img,"Hi Im Omkar Mali"));
        list.add(new Information("Rahul Patil",R.drawable.img_1,"Hi Im Rahul Patil"));
        list.add(new Information("Mahesh Mali",R.drawable.img_2,"Hi Im Mahesh Mali"));

       ListViewAdaptor listViewAdaptor=new ListViewAdaptor(getContext(),list);
        listView.setAdapter(listViewAdaptor);


        listView.setOnItemClickListener((adapterView, view1, i, l) -> {

            ChatBoxAdaptor chatBoxAdaptor=new ChatBoxAdaptor(getParentFragmentManager(),getLifecycle());
            viewPager2.setAdapter(chatBoxAdaptor);

        });
       return  view;
    }
}