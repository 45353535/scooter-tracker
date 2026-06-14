package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51798a;

    public b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        this.f51798a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f51817i, this.f51798a));
        } catch (Exception e10) {
            if (a.f51797a) {
                Log.e("TrackManager", "create table error", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f51818j, this.f51798a));
            sQLiteDatabase.execSQL(String.format(i.f51817i, this.f51798a));
        } catch (Exception e10) {
            if (a.f51797a) {
                Log.e("TrackManager", "downgrade table error", e10);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f51818j, this.f51798a));
            sQLiteDatabase.execSQL(String.format(i.f51817i, this.f51798a));
        } catch (Exception e10) {
            if (a.f51797a) {
                Log.e("TrackManager", "upgrade table error", e10);
            }
        }
    }
}
