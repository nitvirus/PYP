package com.example.nit.palampuryellowpages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button docButton = (Button)findViewById(R.id.docButton);
        Button hotButton =  (Button)findViewById(R.id.hotButton);
        Button pButton =  (Button)findViewById(R.id.pButton);

        docButton.setOnClickListener(
                new Button.OnClickListener() { //interface
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), doctors.class);
                        startActivity(intent);

                    }
                }
        );
        hotButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), hotels.class);
                        startActivity(intent);
                    }

                }
        );

        pButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), police.class);
                        startActivity(intent);
                    }

                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
