package com.example.sajja.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNo;
    Button btnCall,btnCamera,btnContact,btnBrowser,btnCallLog,btnGallery,btnDial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNo = findViewById(R.id.edtNo);
        btnCall = findViewById(R.id.button1);
        btnCamera = findViewById(R.id.button2);
        btnContact = findViewById(R.id.button3);
        btnBrowser = findViewById(R.id.button4);
        btnCallLog = findViewById(R.id.button5);
        btnGallery = findViewById(R.id.button6);
        btnDial = findViewById(R.id.button7);

//set click listener to camera button
        btnCamera.setOnClickListener(new View.OnClickListener() {

            //perform camera open action
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivity(i);
            }
        });

//set click listener to Gallery button
        btnGallery.setOnClickListener(new View.OnClickListener() {

            //perform Gallery open action
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://media/external/images/media/"));
                startActivity(i);
            }
        });

//set click listener to CallLog button
        btnCallLog.setOnClickListener(new View.OnClickListener() {

            //perform CallLog open action
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://call_log/calls/1"));
                startActivity(i);
            }

        });

//set click listener to Browser button
        btnBrowser.setOnClickListener(new View.OnClickListener() {

            //perform Browser open action
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.google.com/"));
                startActivity(Intent.createChooser(i, "Title"));
            }
        });

//set click listener to Contact button
        btnContact.setOnClickListener(new View.OnClickListener() {

            //perform Contact open action
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://contacts/people/"));
                startActivity(i);
            }
        });

//set click listener to Call button
        btnCall.setOnClickListener(new View.OnClickListener() {

            //perform Call open action
            @Override
            public void onClick(View v) {

// AndroidManifest.xml -> Permissions -> Add ->
// Uses Permission -> android.permission.CALL_PHONE -> Save
                Intent i = new Intent();
                i.setAction(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:" + edtNo.getText()));
                startActivity(i);
            }
        });

//set click listener to Dial button
        btnDial.setOnClickListener(new View.OnClickListener() {

            //perform Dial open action
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + edtNo.getText()));
                startActivity(i);

                Intent I = new Intent(Intent.ACTION_DIAL, Uri
                        .parse("tel:" + edtNo.getText()));
                startActivity(i);

                startActivity(new Intent(Intent.ACTION_DIAL, Uri
                        .parse("tel:" + edtNo.getText())));

            }
        });

    }
    }