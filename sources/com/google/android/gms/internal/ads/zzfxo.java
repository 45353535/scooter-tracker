package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzfxo extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxo(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, zzfxq zzfxqVar) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i10);
        zzfxl.zza();
    }
}
