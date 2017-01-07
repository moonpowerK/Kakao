package com.hanbit.kakao.presentation.member;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hanbit.kakao.R;
import com.hanbit.kakao.domain.MemberBean;
import com.hanbit.kakao.service.MemberService;
import com.hanbit.kakao.service.MemberServiceImpl;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    Button btList, btDelete, btUpdate, btMessage, btMap, btCall;
    TextView tvAddr, tvTel, tvName, tvPass, tvID;
    MemberService service;
    MemberBean member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        service = new MemberServiceImpl(this.getApplicationContext());
        //member = service.detail("hi");

        btList = (Button) findViewById(R.id.btList);
        btDelete = (Button) findViewById(R.id.btDelete);
        btUpdate = (Button) findViewById(R.id.btUpdate);
        btMessage = (Button) findViewById(R.id.btMessage);
        btMap = (Button) findViewById(R.id.btMap);
        btCall = (Button) findViewById(R.id.btCall);
        tvAddr = (TextView) findViewById(R.id.tvAddr);
        tvTel = (TextView) findViewById(R.id.tvTel);
        tvName = (TextView) findViewById(R.id.tvName);
        tvPass = (TextView) findViewById(R.id.tvPass);
        tvID = (TextView) findViewById(R.id.tvID);

        tvID.setText(member.getId());
       // tvPass.setText(member.getPass());
        tvAddr.setText(member.getAddr());
        tvName.setText(member.getName());
        tvTel.setText(member.getPhone());

        btList.setOnClickListener(this);
        btDelete.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
        btMessage.setOnClickListener(this);
        btMap.setOnClickListener(this);
        btCall.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String addr = tvAddr.getText().toString();
        String tel = tvTel.getText().toString();
        String name = tvName.getText().toString();
        String pass = tvPass.getText().toString();
        String id = tvID.getText().toString();

        switch (v.getId()){
            case R.id.btList :
                this.startActivity(new Intent(DetailActivity.this,ListActivity.class));
                break;
            case R.id.btDelete :
                //service.delete(tvID.getText().toString());
                startActivity(new Intent(DetailActivity.this, ListActivity.class));
                break;
            case R.id.btUpdate :
                //startActivity(new Intent(DetailActivity.this, UpdateActivity.class));
                break;
            case R.id.btMessage :
                break;
            case R.id.btMap :
                break;
            case R.id.btCall :
                break;
        }

    }
}
