package com.example.diyhubb.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.diyhubb.R;
import com.example.diyhubb.models.ProductsModel;
import com.google.firebase.firestore.FirebaseFirestore;

public class StandardProductActivity extends AppCompatActivity {

    ImageView productImg;
    TextView addToCart, buyNow;
    TextView productBookFrom, descriptionProduct, priceProduct,soldProduct, productRating, stockProduct;
    Toolbar toolbar;
    ProductsModel productsModel = null;
    private FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_product);

        firestore = FirebaseFirestore.getInstance();

        final Object object = getIntent().getSerializableExtra("detailed");

        if(object instanceof ProductsModel){
            productsModel = (ProductsModel) object;
        }

        productImg = findViewById(R.id.imageProduct);
        productBookFrom = findViewById(R.id.bookFromProduct);
        descriptionProduct = findViewById(R.id.descriptionProduct);
        priceProduct = findViewById(R.id.priceProduct);
        soldProduct = findViewById(R.id.productSold);
        productRating = findViewById(R.id.ratingNum);
        buyNow = findViewById(R.id.buyNowBtn);
        stockProduct = findViewById(R.id.stockProduct);

        //Display Products
        if(productsModel != null){
            Glide.with(getApplicationContext()).load(productsModel.getImg_url()).into(productImg);
            productBookFrom.setText(productsModel.getBookfrom());
            descriptionProduct.setText(productsModel.getDescription());
            productRating.setText(productsModel.getRating());
            priceProduct.setText(String.valueOf(productsModel.getPrice()));
            soldProduct.setText(String.valueOf(productsModel.getProductsold()));
            stockProduct.setText(String.valueOf(productsModel.getStock()));
        }
    }
}