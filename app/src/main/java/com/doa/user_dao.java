package com.doa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.model.user;
import com.database.DatabaseHelperA;

public class user_dao {
    private DatabaseHelperA dbhelper;
    private Context context;
    public user_dao(Context context){
        this.context = context;
        dbhelper = DatabaseHelperA.getInstance(context,SQLiteDatabase.OPEN_READWRITE);
    }
    public user getUser(String username){
        user user1 = new user();
        SQLiteDatabase db = dbhelper.getWritableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect = {"username", "fname","lname","role","utaid","phone","vehicleno","parkingpermit","password"};
        String sqlTables = "user";

        qb.setTables(sqlTables);
        qb.appendWhere("username = \""+ username +"\"");
        Cursor c = qb.query(db, sqlSelect, null, null,
                null, null, null);

        if(c.getCount() > 0){
            c.moveToFirst();
            user1.setUsername(c.getString(c.getColumnIndex("username")));
            user1.setFname(c.getString(c.getColumnIndex("fname")));
            user1.setFname(c.getString(c.getColumnIndex("lname")));
            user1.setRole(c.getString(c.getColumnIndex("role")));
            user1.setUtaid(c.getInt(c.getColumnIndex("utaid")));
            user1.setPhone(c.getInt(c.getColumnIndex("phone")));
            user1.setVehicle(c.getString(c.getColumnIndex("vehicleno")));
            user1.setParking(c.getInt(c.getColumnIndex("parkingpermit")));
            user1.setPassword(c.getString(c.getColumnIndex("password")));
        }else{
            return null;
        }


//        ContentValues value = new ContentValues();
//        value.put("username","hellouser");
//        value.put("password","root");
//
//        db.insert("user",null,value);
////

////        String query = "SELECT * FROM user";
////
////        Cursor c = db.rawQuery(query,null);
////        if(c != null){
////            c.moveToFirst();
////        }

//        int tmp = c.getColumnIndex("username");
//        String un = c.getString(tmp);


        return user1;
    }
}
