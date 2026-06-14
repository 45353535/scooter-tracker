package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class E4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f40670a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f40671b = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Nullable
    public final SQLiteDatabase a(@NotNull SQLiteOpenHelper sqliteOpenHelper) {
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(E4 e42, boolean z10, SQLiteOpenHelper sQLiteOpenHelper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e42.a(z10, sQLiteOpenHelper);
    }

    @Nullable
    public final SQLiteDatabase a(boolean z10, @NotNull SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase readableDatabase;
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f40671b) {
            try {
                if (z10) {
                    readableDatabase = sqliteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sqliteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readableDatabase;
    }
}
