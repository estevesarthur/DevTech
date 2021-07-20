package com.example.devtech;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DevTechAdapter devTechAdapter;
    private List<MenuDevTech> menuDevTechListView = new ArrayList<>();

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        devTechAdapter = new DevTechAdapter(this, menuDevTechListView);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(devTechAdapter);
        DevTechPrepare();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void DevTechPrepare() {
        MenuDevTech data = new MenuDevTech(R.mipmap.logo_vetor, R.mipmap.quemsomospluri, "Quem é a DevTech?", R.mipmap.logo_mobile_phone, "Nosso Portfólio", R.mipmap.faleconosco1, "Agende um horário!");
    menuDevTechListView.add(data);

        Collections.sort(menuDevTechListView, new Comparator<MenuDevTech>() {
            @Override
            public int compare(MenuDevTech o1, MenuDevTech o2) {

                return o1.quemSomos.compareTo(o2.contato); }
        });
    }
}