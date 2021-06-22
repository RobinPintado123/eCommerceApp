package com.example.robin.ecommerce2.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.robin.ecommerce2.Buyers.HomeActivity;
import com.example.robin.ecommerce2.Buyers.MainActivity;
import com.example.robin.ecommerce2.R;

public class AdminCategoryActivity extends AppCompatActivity {

    //if user clicks one of them
    private ImageView tShirts, sportsTShirts, femaleDresses, sweathers;
    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
    private ImageView headPhonesHandFree, Laptops, watches, mobilePhones;

    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);

        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);

            }
        });

        tShirts = (ImageView) findViewById(R.id.t_shirts);
        sportsTShirts = (ImageView) findViewById(R.id.sports_t_shirts);
        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        tShirts = (ImageView) findViewById(R.id.t_shirts);
        sweathers = (ImageView) findViewById(R.id.sweathers);
        glasses = (ImageView) findViewById(R.id.glasses);
        hatsCaps = (ImageView) findViewById(R.id.hats_caps);
        headPhonesHandFree = (ImageView) findViewById(R.id.headphones_handfree);
        Laptops = (ImageView) findViewById(R.id.laptop_pc);
        watches = (ImageView) findViewById(R.id.watches);
       mobilePhones = (ImageView) findViewById(R.id.mobilephones);
        walletsBagsPurses = (ImageView) findViewById(R.id.purses_bags_wallets);
        shoes = (ImageView) findViewById(R.id.shoes);


        tShirts.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });

        sportsTShirts.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "SportsTShirts");
                startActivity(intent);
            }
        });

        femaleDresses.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);
            }
        });

        sweathers.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Sweathers");
                startActivity(intent);
            }
        });

        glasses.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });

        hatsCaps.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Hats Caps");
                startActivity(intent);
            }
        });

        walletsBagsPurses.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Wallets Bags Purses");
                startActivity(intent);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Shoes");
                startActivity(intent);
            }
        });

        headPhonesHandFree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "HeadPhones HandFree");
                startActivity(intent);
            }
        });

        Laptops.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Laptops");
                startActivity(intent);
            }
        });

        watches.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });

        mobilePhones.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // category to add new product activity
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                //saves it firebase data base
                intent.putExtra("category", "Mobile Phones");
                startActivity(intent);
            }
        });

    }
}
