package com.hanbit.kakao.dao;

import android.content.Context;

import com.hanbit.kakao.domain.MessageBean;

import java.util.ArrayList;

/**
 * Created by hb2003 on 2017-01-07.
 */

public class MessageDAO {
    public MessageDAO(Context applicationContext) {

    }
    /*public void createMessage(){}
    public void readAlll(){}
    public void readGroup(){}
    public void readOn(){}
    public void readCount(){}
    public void updateMessage(){}
    public void deleteMessage(){}*/

    public void insert(MessageBean msg){

    }
    public ArrayList<MessageBean> searchList(){
        ArrayList<MessageBean> list = new ArrayList<MessageBean>();

        return list;
    }
    public ArrayList<MessageBean> findByWriter(String id){
        ArrayList<MessageBean> writerList = new ArrayList<MessageBean>();

        return writerList;
    }
    public MessageBean findBySeq(int seq){
        MessageBean no = new MessageBean();

        return no;
    }
    public int count(){
        int count  = 0 ;

        return count;
    }
    public int countByWriter(String id){
        int idcount = 0;

        return idcount;
    }
    public void update(MessageBean msg){

    }
    public void delete(int seq){

    }
}
