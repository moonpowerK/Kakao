package com.hanbit.kakao.presentation.member;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.kakao.R;
import com.hanbit.kakao.domain.MemberBean;
import com.hanbit.kakao.service.MemberService;
import com.hanbit.kakao.service.MemberServiceImpl;

import java.util.List;

public class ListActivity extends AppCompatActivity implements View.OnClickListener{

    Button btGoDetail, btGosearch;
    MemberService service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btGoDetail = (Button) findViewById(R.id.btGoDetail);
        btGosearch = (Button) findViewById(R.id.btGosearch);

        btGoDetail.setOnClickListener(this);
        btGosearch.setOnClickListener(this);

        service = new MemberServiceImpl(this.getApplicationContext());
        List<MemberBean> list = service.list();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btGoDetail :
                startActivity(new Intent(ListActivity.this, DetailActivity.class));
                break;
            case R.id.btGosearch :
                startActivity(new Intent(ListActivity.this, SearchMemberActivity.class));
                break;

        }
    }
}
