package com.example.momo.protips;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class ListSQLiteHelper extends SQLiteAssetHelper{

    public static final String DATABASE_NAME = "bdhacklife.db";
    private static final int DATABASE_VERSION = 1;

    public ListSQLiteHelper(Context context) {
        super(context, DATABASE_NAME, context.getExternalFilesDir(null).getAbsolutePath(), null, DATABASE_VERSION);
    }


}
