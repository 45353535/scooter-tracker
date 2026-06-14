package com.mbridge.msdk.util;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static boolean a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen()) {
                    if (!sQLiteDatabase.isReadOnly()) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
