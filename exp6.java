---------activity_mai.xml---------
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_gravity="center"
    android:gravity="center"
    tools:context=".MainActivity">
    <Button
        android:id="@+id/button"
        android:textColor="@color/teal_700"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="Send SMS" />
</LinearLayout>

-----------------MainActivity.java----------------
package com.example.exp6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button sendsms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendsms = findViewById(R.id.button);
        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Intent it = new Intent(Intent.ACTION_VIEW,
                        Uri.fromParts("sms","8985654740",null));
                it.putExtra("Message","Hello..!, How are you ?");
                startActivity(it);
            }
        });
    }
}
