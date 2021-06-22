package com.example.robin.ecommerce2.Sellers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.robin.ecommerce2.R;

public class SellerRegistrationActivity extends AppCompatActivity {

    private Button sellerLoginBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_registration);

        sellerLoginBegin = findViewById(R.id.seller_already_have_account_btn);

        sellerLoginBegin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(SellerRegistrationActivity.this, SellerLoginActivity.class);
                startActivity(intent);
            }

        });
    }
}
