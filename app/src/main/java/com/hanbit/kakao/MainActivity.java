package com.hanbit.kakao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hanbit.kakao.presentation.member.LoginActivity;
import com.hanbit.kakao.presentation.member.RegistMemberActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnJoin, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnJoin = (Button) findViewById(R.id.btnJoin);

        btnJoin.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.btnJoin :
                Toast.makeText(MainActivity.this, "Do Join", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, RegistMemberActivity.class));

                break;
            case R.id.btnLogin :
                Toast.makeText(MainActivity.this, "Do Login", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
        }
    }
}