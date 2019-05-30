package com.example.gstinvoice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cardView1,cardView2,cardView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1=findViewById(R.id.cardView3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CompanyDetails.class);
                startActivity(intent);

            }
        });

        cardView2=findViewById(R.id.cardView2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CustomerDetails.class);
                startActivity(intent);


            }
        });

        cardView3=findViewById(R.id.cardView1);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OrderDetails.class);
                startActivity(intent);

            }
        });



    }
}
