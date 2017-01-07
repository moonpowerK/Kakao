package com.hanbit.kakao.service;

import com.hanbit.kakao.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2003 on 2017-01-07.
 * area는 무조건 public으로 한다
 * web은 LIst<?>로 하지만 모바일에서는 ArrayList<?>로해야 에러가 안난다.
 */

public interface MemberService {
    public void join(MemberBean param);         //createMember
    public ArrayList<MemberBean> list();         //readAll
    public ArrayList<MemberBean> searchByName(String name); //readGroup
    public MemberBean searchById(String id);   //readOn
    public boolean login(MemberBean params);
    public int count();        //readCount
    public void modify(MemberBean param);       //updateMember 재정의
    public void unregist();     //deleteMember 탈퇴
}
