package com.example.nit.palampuryellowpages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.LayoutDirection;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_main);
        RelativeLayout nitLayout = new RelativeLayout(this);
        nitLayout.setBackgroundColor(Color.LTGRAY);

//        LinearLayout nitLayout = new LinearLayout(this);
//        nitLayout.setBackgroundColor(Color.LTGRAY);

        //button 1
        Button docButton = new Button(this);
        docButton.setText("Doctors");
        docButton.setBackgroundColor(Color.WHITE);
        docButton.setWidth(1000);
        docButton.setId(1);
        docButton.setOnClickListener(
                new Button.OnClickListener() { //interface
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Doctors.class);
                        startActivity(intent);

                    }
                }
        );
        //button2
        Button pButton = new Button(this);
        pButton.setText("Police station");
        pButton.setBackgroundColor(Color.WHITE);
        pButton.setId(2);

        //button 3 --hotels
        Button hotButton = new Button(this);
        hotButton.setText("Hotels");
        hotButton.setBackgroundColor(Color.WHITE);
        hotButton.setId(3);

        //username
//        EditText userName = new EditText(this);
//        userName.setId(2);

        RelativeLayout.LayoutParams docButtonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams pButtonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams hotButtonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

//        RelativeLayout.LayoutParams userNameDetails = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
        // give rules to position
//        userNameDetails.addRule(RelativeLayout.ABOVE, docButton.getId());
//        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        userNameDetails.setMargins(0, 0, 0, 50);

        docButtonDetails.addRule(RelativeLayout.TEXT_ALIGNMENT_CENTER);
//        docButtonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
//        docButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        docButtonDetails.addRule(RelativeLayout.ALIGN_TOP);
        docButtonDetails.addRule(RelativeLayout.ALIGN_PARENT_TOP);
    //    docButtonDetails.addRule(ViewGroup.MarginLayoutParams.MATCH_PARENT);
        //docButtonDetails.addRule(RelativeLayout.LayoutParams.MATCH_PARENT);

        pButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        pButtonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        pButtonDetails.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        hotButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        hotButtonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        hotButtonDetails.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        Resources r = getResources();
        //takes in Dp and converts to pixels
        int pix = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());

      //  userName.setWidth(pix);

        nitLayout.addView(docButton, docButtonDetails); //adding to layout
        nitLayout.addView(pButton, pButtonDetails);
        nitLayout.addView(hotButton, hotButtonDetails);
        //nitLayout.addView(userName, userNameDetails);

        setContentView(nitLayout);
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
