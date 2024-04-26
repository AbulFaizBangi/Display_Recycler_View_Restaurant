package com.example.ad_list19_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> names = new ArrayList<>();
//        names.add("The Shawshank Redemption (1994)");
//        names.add("The Godfather (1972)");
//        names.add("The Dark Knight (2008)");
//        names.add("The Lord of the Rings: The Return of the King (2003)");
//        names.add("Schindler's List (1993)");
//        names.add("Pulp Fiction (1994)");
//        names.add("12 Angry Men (1957)");
//        names.add("The Lord of the Rings: The Fellowship of the Ring (2001)");
//        names.add("The Good, the Bad and the Ugly (1966)");
//        names.add("Forrest Gump (1994)");
//        names.add("Parasite (2019)");
//        names.add("Spirited Away (2001)");
//        names.add("Inception (2010)");

        names.add("Malaka Spice - Pan-Asian");
        names.add("Paasha - North-West Frontier & Continental");
        names.add("Little Italy - Italian");
        names.add("Feast at Sheraton Grand - Multi-cuisine Buffet");
        names.add("La Magia - Vegetarian Italian");
        names.add("ABC - Casual Dining");
        names.add("Olive Garden - Italian");
        names.add("The Irish House - Pub & Kitchen");
        names.add("Marzorin - European");
        names.add("Punekars - Maharashtrian");
        names.add("German Bakery - Bakery & Cafe");
        names.add("Vaughan's -  Desserts & Beverages");
        names.add("George -  Multi-cuisine");



        ArrayList<Integer> images = new ArrayList<>();
//        images.add(R.drawable.shawshank);
//        images.add(R.drawable.godfather);
//        images.add(R.drawable.darkknight);
//        images.add(R.drawable.lor);
//        images.add(R.drawable.schinlerlist);
//        images.add(R.drawable.pulpfiction);
//        images.add(R.drawable.angrymen);
//        images.add(R.drawable.lor2);
//        images.add(R.drawable.goodbadugly);
//        images.add(R.drawable.forrestgump);
//        images.add(R.drawable.parasite);
//        images.add(R.drawable.spiritedaway);
//        images.add(R.drawable.inception);

        images.add(R.drawable.malakaspice);
        images.add(R.drawable.paasha);
        images.add(R.drawable.littleitaly);
        images.add(R.drawable.feastsheratongrand);
        images.add(R.drawable.lamagia);
        images.add(R.drawable.abc);
        images.add(R.drawable.olivegarden);
        images.add(R.drawable.irishhouse);
        images.add(R.drawable.marzorin);
        images.add(R.drawable.punekars);
        images.add(R.drawable.germanbakery);
        images.add(R.drawable.vaughans);
        images.add(R.drawable.george);



        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, names, images);
        adapter.setClickListener((MyRecyclerViewAdapter.ItemClickListener) this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}