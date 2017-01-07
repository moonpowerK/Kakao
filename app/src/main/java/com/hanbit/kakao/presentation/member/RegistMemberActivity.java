package com.hanbit.kakao.presentation.member;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hanbit.kakao.R;
import com.hanbit.kakao.service.MemberService;
import com.hanbit.kakao.service.MemberServiceImpl;

public class RegistMemberActivity extends AppCompatActivity {

    MemberService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_member);

        service = new MemberServiceImpl(this.getApplicationContext());
    }
}
