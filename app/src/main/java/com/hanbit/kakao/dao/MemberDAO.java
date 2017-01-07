package com.hanbit.kakao.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.hanbit.kakao.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2003 on 2017-01-07.
 * 리턴 되는 파라미터가 인터페이스와 같아야 한다.
 */

public class MemberDAO extends SQLiteOpenHelper {
    public MemberDAO(Context applicationContext) {
        //super(context, name, factory, version);
        super(applicationContext, "hanbit.db", null,1);
        this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Member(\n" +
                "\tid TEXT PRIMARY KEY,\n" +
                "    pw TEXT ,\n" +
                "    name TEXT,\n" +
                "    email TEXT,\n" +
                "    phone TEXT,\n" +
                "    photo TEXT,\n" +
                "    addr TEXT\n" +
                ");");
        db.execSQL("CREATE TABLE IF NOT EXISTS Message(\n" +
                "\t_id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    sender TEXT ,\n" +
                "    receiver TEXT,\n" +
                "    content TEXT,\n" +
                "    writeTime TEXT,\n" +
                "    id TEXT,\n" +
                "    FOREIGN KEY (id) REFERENCES Member(id)\n" +
                ");");
        /*db.execSQL("INSERT INTO Member VALUES('hong','1','홍길동','hong@test.com','010-5370-8227','default.jpg','서울');\n");
        db.execSQL("INSERT INTO Member VALUES('kong','1','공유','hong@test.com','010-2134-1234','default.jpg','서울');\n");
        db.execSQL("INSERT INTO Member VALUES('lee','1','저승이','hong@test.com','010-5370-8227','default.jpg','서울');\n");
        db.execSQL("INSERT INTO Member VALUES('navi','1','육성재','hong@test.com','010-5370-8227','default.jpg','서울');\n");
        db.execSQL("INSERT INTO Member VALUES('sunny','1','써니','hong@test.com','010-5370-8227','default.jpg','서울');\n");
        db.execSQL("INSERT INTO Member VALUES('jee','1','은탁','hong@test.com','010-5370-8227','default.jpg','서울');\n");*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /*public void createMember(){}
    public void readAlll(){}/*
    public void readGroup(){}
    public void readOn(){}
    public void readCount(){}
    public void updateMember(){}
    public void deleteMember(){}*/

    public void insert(MemberBean param){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "";
        db.execSQL(sql);
        db.close();
    }
    public ArrayList<MemberBean> selectAll(){
        ArrayList<MemberBean> list = new ArrayList<MemberBean>();
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "";
        Cursor cursor = db.rawQuery(sql, null);
        return list;
    }
    public ArrayList<MemberBean> searchByName(String name){
        ArrayList<MemberBean> listName = new ArrayList<MemberBean>();
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "";
        Cursor cursor = db.rawQuery(sql, null);
        return listName;
    }
    public MemberBean searchById(String id){
        MemberBean listId = new MemberBean();
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "";
        Cursor cursor = db.rawQuery(sql, null);
        return listId;
    }
    public MemberBean login(MemberBean params){
        MemberBean member = new MemberBean();
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT id, pw, name, email, phone, photo, addr FROM Member WHERE id='"+params.getId()+"' and pw = '"+params.getPw()+"';";
        Log.d("login SQL : ", sql);
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToNext()){
            member.setId(cursor.getString(0));
            member.setPw(cursor.getString(1));
            member.setName(cursor.getString(2));
            member.setEmail(cursor.getString(3));
            member.setPhone(cursor.getString(4));
            member.setPhoto(cursor.getString(5));
            member.setAddr(cursor.getString(6));
        }else{
            member.setId("fail");
        }
        Log.d("login result : ", member.getId());
        return member;
    }
    public int count(){
        int count = 0;
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "";
        Cursor cursor = db.rawQuery(sql, null);
        return count;
    }
    public void update(MemberBean param){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "";
        db.execSQL(sql);
        db.close();
    }
    public void delete(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "";
        db.execSQL(sql);
        db.close();
    }
}
