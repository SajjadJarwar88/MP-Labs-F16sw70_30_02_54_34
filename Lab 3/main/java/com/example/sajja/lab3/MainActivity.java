package com.example.sajja.lab3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    EditText edtnm,edtmail,edtpwd,edtdte;
    RadioButton rdb1,rdb2;
    Button signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnm= findViewById(R.id.editText1);
        edtmail=findViewById(R.id.editText2);
        edtpwd= findViewById(R.id.editText3);
        edtdte= findViewById(R.id.editText4);
        rdb1= findViewById(R.id.radioButton1);
        rdb2= findViewById(R.id.radioButton2);
        signupbtn=findViewById(R.id.button);


        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edtnm.getText().toString();
                String email=edtmail.getText().toString();
                String password=edtpwd.getText().toString();
                String date=edtdte.getText().toString();


                Intent it=new Intent(MainActivity.this,LoginActivity.class);

                it.putExtra("Name",name);
                it.putExtra("Email",email);
                it.putExtra("Password",password);
                it.putExtra("D-O-B",date);

                startActivity(it);
            }
        });
    }
}

