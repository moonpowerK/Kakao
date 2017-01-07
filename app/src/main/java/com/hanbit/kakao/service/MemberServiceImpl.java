package com.hanbit.kakao.service;

import android.content.Context;

import com.hanbit.kakao.dao.MemberDAO;
import com.hanbit.kakao.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2003 on 2017-01-07.
 */

public class MemberServiceImpl implements MemberService{
    MemberDAO dao;
    MemberBean session;

    public MemberServiceImpl(Context applicationContext) {
        dao = new MemberDAO(applicationContext);
    }

    @Override
    public void join(MemberBean param) {

    }

    @Override
    public ArrayList<MemberBean> list() {
        return null;
    }

    @Override
    public ArrayList<MemberBean> searchByName(String name) {
        return null;
    }

    @Override
    public MemberBean searchById(String id) {
        return null;
    }

    @Override
    public boolean login(MemberBean params) {
        boolean flag = false;
        session = dao.login(params);
        if(session.getId().equals("fail")){
            flag = false;
        }else{
            flag = true;
        }

        return flag;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void modify(MemberBean param) {

    }

    @Override
    public void unregist() {

    }
}
