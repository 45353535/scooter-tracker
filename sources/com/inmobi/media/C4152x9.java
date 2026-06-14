package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4152x9 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3824k5 f39917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4152x9(C3824k5 databaseConfig) {
        super(databaseConfig.f38856a, "com.im_11.1.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.f39917a = databaseConfig;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, Nj nj) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + nj.f37458a + " " + nj.f37459b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.f39917a.getClass();
        return "com.im_11.1.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.f39917a.f38858c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.f39917a.f38857b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (Nj) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
