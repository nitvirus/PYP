package com.example.nit.palampuryellowpages;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telecom.InCallService;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;

public class doctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);
    //    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        ImageView doc1 = (ImageView) findViewById(R.id.imageButton8);

        doc1.setOnClickListener(
                new Button.OnClickListener() { //interface
                    public void onClick(View view) {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:123456789"));
         //               if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            // TODO: Consider calling
                            //    ActivityCompat#requestPermissions
                            // here to request the missing permissions, and then overriding
//                               public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                                                                      int[] grantResults);
                           // ActivityCompat.requestPermissions( this, new String[] {  Manifest.permission.CALL_PHONE  },
                        //            InCallService.MY_PERMISSION_ACCESS_CALL);
                            // to handle the case where the user grants the permission. See the documentation
                            // for ActivityCompat#requestPermissions for more details.
                           // return;
                    //    }
                        startActivity(callIntent);
                    }
                }
        );

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
