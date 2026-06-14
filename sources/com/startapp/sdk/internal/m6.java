package com.startapp.sdk.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m6 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SQLiteDatabase f64909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64910b;

    public m6(Context context) {
        super(context, "StartApp-d6864f2502af7851", (SQLiteDatabase.CursorFactory) null, 1);
        this.f64910b = new Object();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = this.f64909a;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (this.f64910b) {
            try {
                writableDatabase = this.f64909a;
                if (writableDatabase == null) {
                    writableDatabase = getWritableDatabase();
                    this.f64909a = writableDatabase;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
