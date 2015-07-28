package com.example.iamuser773.button;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.net.URL;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button facebook = (Button) findViewById(R.id.bt_fb);
        final Button google = (Button) findViewById(R.id.bt_gg);
        final ImageButton sanook = (ImageButton) findViewById(R.id.bt_sn);

        facebook.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("LongClick", "start");
                Intent i = new Intent(Intent.ACTION_VIEW);
                String google = "https://www.facebook.com";
                i.setData(Uri.parse(google));
                startActivity(i);
                return true;
            }
        });


        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("click", "start");
                Intent i = new Intent(Intent.ACTION_VIEW);
                String google = "https://www.google.com";
                i.setData(Uri.parse(google));
                startActivity(i);
            }
        });

        sanook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("click", "start");
                Intent i = new Intent(Intent.ACTION_VIEW);
                String sanook = "http://www.sanook.com/";
                i.setData(Uri.parse(sanook));
                startActivity(i);
            }
        });


    }


}
