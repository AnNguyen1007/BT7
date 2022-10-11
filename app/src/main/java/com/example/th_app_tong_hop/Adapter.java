package com.example.th_app_tong_hop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Music> arraylist;

    public Adapter(Context context, int layout, List<Music> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }
    public int getCount() {
        return arraylist.size();
    }


    public Object getItem(int i) {
        return null;
    }


    public long getItemId(int i) {
        return 0;
    }


    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view  = inflater.inflate(layout,null);
        Music music = arraylist.get(i);

        TextView textView1 = view.findViewById(R.id.song_name);
        TextView textView2 = view.findViewById(R.id.song_tacgia);
        TextView textView3 = view.findViewById(R.id.song_infor);
        ImageView imageView = view.findViewById(R.id.imgAvatar);

        textView1.setText(music.getTenbai());
        textView2.setText(music.getInfor());
        textView3.setText(music.getTacgia());
        imageView.setImageResource(music.getImg());
        return view;
    }
}
