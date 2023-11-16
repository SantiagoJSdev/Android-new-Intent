package com.redesip.get_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sale, negativeSale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sale = (Button) findViewById(R.id.enviar);
        negativeSale = (Button) findViewById(R.id.negativeSale);



        sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setClassName("com.redesip.leer_intent2", "com.redesip.leer_intent2.Transaction");
                    intent.putExtra("TransactionType", "SALE");
                    startActivity(intent);
                    finish();
                } catch (ActivityNotFoundException e) {
                    Log.d("enviar", "error intent");

                }

            }
        });

        negativeSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setClassName("com.redesip.leer_intent2", "com.redesip.leer_intent2.Transaction");
                    intent.putExtra("TransactionType", "NEGATIVE_SALE");
                    startActivity(intent);
                    finish();
                } catch (ActivityNotFoundException e) {
                    Log.d("enviar", "error intent");

                }

            }
        });
    }
}