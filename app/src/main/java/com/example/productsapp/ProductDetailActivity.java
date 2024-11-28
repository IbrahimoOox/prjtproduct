package com.example.productsapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailsproduct);

        TextView productDetailTextView = findViewById(R.id.productDetailTextView);
        String productName = getIntent().getStringExtra("productName");
        productDetailTextView.setText("Détails du produit : " + productName);
    }
}
