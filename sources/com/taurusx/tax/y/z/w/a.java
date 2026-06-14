package com.taurusx.tax.y.z.w;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taurusx.tax.y.z.w.s;

/* JADX INFO: loaded from: classes11.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f67709z = 1;

    public a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static String w() {
        return "taurusx_log.db";
    }

    private String z() {
        return "CREATE TABLE IF NOT EXISTS " + s.z.z() + " (_id INTEGER PRIMARY KEY," + s.z.f67720z + " TEXT, time TEXT, " + s.z.f67719y + " TEXT)";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
