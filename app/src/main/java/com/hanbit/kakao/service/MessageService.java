package com.hanbit.kakao.service;

import com.hanbit.kakao.domain.MemberBean;
import com.hanbit.kakao.domain.MessageBean;

import java.util.ArrayList;

/**
 * Created by hb2003 on 2017-01-07.
 */

public interface MessageService {
    public void write(MessageBean msg);
    public ArrayList<MemberBean> searchList(); //readAll
    public ArrayList<MemberBean> findByWriter(String id);//readGroup
    public MemberBean findBySeq(int seq);//readOn
    public int count(); //readCount
    public int countByWriter(String id);
    public void updateMessage(MessageBean msg); //updateMessage
    public void unregistMessage(int seq);//deleteMessage
}
