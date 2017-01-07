package com.hanbit.kakao.presentation.member;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hanbit.kakao.R;
import com.hanbit.kakao.domain.MemberBean;
import com.hanbit.kakao.service.MemberService;
import com.hanbit.kakao.service.MemberServiceImpl;

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener{
    EditText etLoingId, etLoinPass;
    Button btLogin;
    MemberService service;
    MemberBean member;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLoingId = (EditText) findViewById(R.id.etLoingId);
        etLoinPass = (EditText) findViewById(R.id.etLoinPass);
        btLogin = (Button) findViewById(R.id.btLogin);

        etLoingId.setOnClickListener(this);
        etLoinPass.setOnClickListener(this);
        btLogin.setOnClickListener(this);

        service = new MemberServiceImpl(this.getApplicationContext());
        member = new MemberBean();

    }

    @Override
    public void onClick(View v) {
        String id = etLoingId.getText().toString();
        String pass= etLoinPass.getText().toString();

        Log.d("넘어온 ID : " , id);
        Log.d("넘어온 PASS : " , pass);

        member.setId(id);
        member.setPw(pass);

        switch (v.getId()){
            case R.id.btLogin :
                boolean flag = service.login(member);
                if(flag){
                   // startActivity(new Intent(LoginActivity.this, ListActivity.class));
                    Toast.makeText(LoginActivity.this, "로그인 성공 ", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(LoginActivity.this, "로그인 실패 ", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
