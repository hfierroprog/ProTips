package com.example.momo.protips;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    public DatabaseAccess(Context context) {
        this.openHelper = new ListSQLiteHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<String> getTextos() {
        List<String> lista = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT texto FROM hackslife", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            lista.add(cursor.getString(0));
            cursor.moveToNext();
        }

        cursor.close();
        return lista;
    }

    public List<String> getLinks() {
        List<String> lista = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT Link FROM hackslife", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            lista.add(cursor.getString(0));
            cursor.moveToNext();
        }

        cursor.close();
        return lista;
    }
}