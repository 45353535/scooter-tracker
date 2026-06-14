package com.taurusx.tax.y.z.w;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taurusx.tax.y.z.w.z;

/* JADX INFO: loaded from: classes11.dex */
public class w extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f67721z = 1;

    public w(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static String w() {
        return "taurusx_ad.db";
    }

    private String z() {
        return "CREATE TABLE " + z.C0835z.z() + " (_id INTEGER PRIMARY KEY,time TEXT, " + z.C0835z.f67724y + " TEXT, event TEXT)";
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
