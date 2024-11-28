package com.example.productsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list de produit en itilisant listview
        ListView listView = findViewById(R.id.recyclerView);
        // cree un tableau des produits
        String[] produits = {"produit1", "produit2", "produit3"};

        //utilier addapter pour lier les produits a la vue
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, produits);
        listView.setAdapter(adapter);


        // cree une evnmt lorsaue user clique sur produit
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectPrudct = produits[i];

                //Lorsqu'un produit est sélectionné, utiliser un Intent Explicite
                Intent intent = new Intent(MainActivity.this, ProductDetailActivity.class);
                intent.putExtra("productName", selectPrudct);
                startActivity(intent);
            }
        });



    }
}