package com.mbridge.msdk.foundation.download.database;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public interface IDatabaseOpenHelper {
    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
