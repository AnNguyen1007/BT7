package com.example.th_app_tong_hop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {
    private ImageButton imgBtSearch;
    private RecyclerView rcvSong;
    private Adapter songAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigationView = findViewById(R.id.bottomNav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.signin:
                        Toast.makeText(getApplicationContext(), "SignIn",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Home.this, MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(), "Profile",Toast.LENGTH_SHORT).show();
                        Intent i1 = new Intent(Home.this, Profile.class);
                        startActivity(i1);
                        break;
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Home",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(Home.this, Home.class);
                        startActivity(i2);
                        break;

                }
                return true;
            }




        });

        rcvSong = findViewById(R.id.listsong);
        songAdapter = new Adapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvSong.setLayoutManager(linearLayoutManager);
        songAdapter.setData(getlistSong());
        rcvSong.setAdapter(songAdapter);


        imgBtSearch = findViewById(R.id.imgBtSearch);
        imgBtSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });
    }

    private List<Music> getlistSong() {
        List<Music> list = new ArrayList<>();
        list.add((new Music("CHUNG TA CUA HIEN TAI", "Son Tung Mtp", "Balad", R.drawable.ctcht)));
        list.add((new Music("CO EM", "Madihu", "Pop", R.drawable.coe)));
        list.add((new Music("EM LA", "Son Tung Mtp", "Rnb", R.drawable.emla)));
        list.add((new Music("FLEX'IN TREN CIRCLE KI", "low Gp", "Rap", R.drawable.flexin)));
        list.add((new Music("HAY TRAO CHO ANH", "Son Tung Mtp", "Latin", R.drawable.htca)));
        list.add((new Music("THICH QUA RUI NA", "Trung Tran", "Rap Melody", R.drawable.tqrn)));

        list.add((new Music("TAY TO", "Rapital", "Rap Melody", R.drawable.tayto)));
        list.add((new Music("QUERRY", "QNT", "Rap Melody", R.drawable.qrr)));
        list.add((new Music("THAI BINH MO HOI ROI", "Son Tung Mtp", "Pop", R.drawable.tbmhr)));
        list.add((new Music("NGTA NOISE", "Vsoul", "Rap Melody", R.drawable.ngtanoise)));
        list.add((new Music("VE BEN ANH", "JACK", "RnB", R.drawable.vba)));
        return list;


    }


    public void OnNoteClick(int position) {
        Intent intent = new Intent(Home.this, Detail.class);
        startActivity(intent);
    }
}
    /*ListView listView;
    ArrayList<Music> arrayList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        arrayList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listsong);
        arrayList.add(new Music("CHUNG TA CUA HIEN TAI","Son Tung Mtp","Balad",R.drawable.ctcht));
        arrayList.add(new Music("CO EM","Madihu","Pop",R.drawable.coe));
        arrayList.add(new Music("EM LA","Mono","Rnb",R.drawable.emla));
        arrayList.add(new Music("FLEX'IN TREN CIRCLE K","low G","low G",R.drawable.flexin));
        arrayList.add(new Music("HAY TRAO CHO ANH","Son Tung Mtp","Latin",R.drawable.htca));
        arrayList.add(new Music("THICH QUA RUI NA","Trung Tran","Rap Melody",R.drawable.tqrn));
        adapter = new Adapter(Home.this, R.layout.item,arrayList);
        listView.setAdapter(adapter);

        imgBtSearch = findViewById(R.id.imgBtSearch);
        imgBtSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });*/

