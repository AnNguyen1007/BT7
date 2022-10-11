package com.example.th_app_tong_hop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private ImageButton imgBtSearch;
    ListView listView;
    ArrayList<Music> arrayList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        arrayList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listsong);
        arrayList.add(new Music("CHÚNG TA CỦA HIỆN TẠI","Sơn Tùng Mtp","Balad",R.drawable.ctcht));
        arrayList.add(new Music("CÓ EM","Madihu","Pop",R.drawable.coe));
        arrayList.add(new Music("EM LÀ","Mono","Rnb",R.drawable.emla));
        arrayList.add(new Music("FLEX'IN TRÊN CIRCLE K","lOW G","Rap",R.drawable.flexin));
        arrayList.add(new Music("HAY TRAO CHO ANH","Sơn Tùng Mtp","Latin",R.drawable.htca));
        arrayList.add(new Music("THÍCH QUÁ RÙI NÀ","TRUNG TRẦN","Rap melody",R.drawable.tqrn));
        adapter = new Adapter(Home.this, R.layout.item,arrayList);
        listView.setAdapter(adapter);

        imgBtSearch = findViewById(R.id.imgBtSearch);
        imgBtSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });

    }
}