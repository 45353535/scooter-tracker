package io.bidmachine.analytics.internal.A;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.D5;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uf.c;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0943a f79474a = new C0943a(null);

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.A.a$a, reason: collision with other inner class name */
    public static final class C0943a {
        public /* synthetic */ C0943a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0943a() {
        }
    }

    public a(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* JADX WARN: Finally extract failed */
    private final Object a(SQLiteDatabase sQLiteDatabase) {
        try {
            Result.Companion companion = Result.f93230c;
            Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ?", new String[]{D5.Q}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        Result.Companion companion2 = Result.f93230c;
                        String string = cursorQuery.getString(0);
                        if (!Intrinsics.areEqual(string, "android_metadata") && !Intrinsics.areEqual(string, "sqlite_master")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string);
                        }
                        Result.b(Unit.f93236a);
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.f93230c;
                        Result.b(d.a(th2));
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        c.a(cursorQuery, th3);
                        throw th4;
                    }
                }
            }
            Unit unit = Unit.f93236a;
            c.a(cursorQuery, null);
            return Result.b(unit);
        } catch (Throwable th5) {
            Result.Companion companion4 = Result.f93230c;
            return Result.b(d.a(th5));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE monitor_record (id TEXT,name TEXT,timestamp INTEGER,session_id TEXT,data BLOB,error BLOB,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE reader_record (id TEXT,name TEXT,timestamp INTEGER,data_hash TEXT,rule TEXT,error BLOB,is_dirty INTEGER,is_reserved INTEGER DEFAULT 0)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        a(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS monitor_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reader_record");
        onCreate(sQLiteDatabase);
    }
}
