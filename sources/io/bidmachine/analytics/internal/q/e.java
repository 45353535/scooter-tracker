package io.bidmachine.analytics.internal.q;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import io.bidmachine.analytics.internal.r.a;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import lf.m;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f79853c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SimpleDateFormat f79854d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f79855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f79856b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String str) {
            SQLiteDatabase sQLiteDatabaseCreate = SQLiteDatabase.create(null);
            sQLiteDatabaseCreate.execSQL("PRAGMA foreign_keys=ON");
            sQLiteDatabaseCreate.execSQL("CREATE TABLE prec (\n  id INTEGER PRIMARY KEY AUTOINCREMENT,\n  pt TEXT NOT NULL CHECK (pt IN ('C','NC','ARS','NRS')),\n  pd TEXT NOT NULL CHECK (julianday(pd) IS NOT NULL),\n  ac INTEGER NOT NULL CHECK (ac IN (0,1))\n)");
            return new e(sQLiteDatabaseCreate, str, null);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.EnumC0965a.values().length];
            try {
                iArr[a.EnumC0965a.INAPP_CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0965a.INAPP_NON_CONSUMABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0965a.SUBS_AUTO_RENEWABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0965a.SUBS_NON_AUTO_RENEWABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f79854d = simpleDateFormat;
    }

    public /* synthetic */ e(SQLiteDatabase sQLiteDatabase, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteDatabase, str);
    }

    private final Object b(String str) {
        try {
            Result.Companion companion = Result.f93230c;
            Object objA = a(str);
            if (Result.i(objA)) {
                Throwable thG = Result.g(objA);
                if (thG == null) {
                    thG = new Exception("Error while execute " + str);
                }
                return Result.b(kotlin.d.a(thG));
            }
            if (Result.i(objA)) {
                objA = null;
            }
            Integer num = (Integer) objA;
            if (num == null) {
                return Result.b(kotlin.d.a(new Exception("Empty result for " + str)));
            }
            int iIntValue = num.intValue();
            boolean z10 = true;
            if (iIntValue != 1) {
                z10 = false;
            }
            return Result.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public final Object a() {
        try {
            Result.Companion companion = Result.f93230c;
            return Result.b(Integer.valueOf(this.f79855a.delete("prec", null, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public final Object c() {
        try {
            Result.Companion companion = Result.f93230c;
            return b(this.f79856b);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    private e(SQLiteDatabase sQLiteDatabase, String str) {
        this.f79855a = sQLiteDatabase;
        this.f79856b = str;
    }

    public final Object a(Iterable iterable) {
        try {
            Result.Companion companion = Result.f93230c;
            this.f79855a.beginTransaction();
            SQLiteStatement sQLiteStatementCompileStatement = this.f79855a.compileStatement("INSERT INTO prec (pt, pd, ac) VALUES (?, ?, ?)");
            try {
                try {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        io.bidmachine.analytics.internal.r.a aVar = (io.bidmachine.analytics.internal.r.a) it.next();
                        sQLiteStatementCompileStatement.clearBindings();
                        sQLiteStatementCompileStatement.bindString(1, a(aVar.b()));
                        sQLiteStatementCompileStatement.bindString(2, f79854d.format(aVar.a()));
                        sQLiteStatementCompileStatement.bindLong(3, aVar.c() ? 1L : 0L);
                        sQLiteStatementCompileStatement.executeInsert();
                    }
                    this.f79855a.setTransactionSuccessful();
                    this.f79855a.endTransaction();
                    Unit unit = Unit.f93236a;
                    uf.c.a(sQLiteStatementCompileStatement, null);
                    return Result.b(unit);
                } catch (Throwable th2) {
                    this.f79855a.endTransaction();
                    throw th2;
                }
            } finally {
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th3));
        }
    }

    public final Object b() {
        try {
            Result.Companion companion = Result.f93230c;
            this.f79855a.close();
            return Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    private final Object a(String str) {
        try {
            Result.Companion companion = Result.f93230c;
            Cursor cursorRawQuery = this.f79855a.rawQuery(str, new String[0]);
            try {
                a(cursorRawQuery);
                int i10 = cursorRawQuery.getInt(0);
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalArgumentException(("Column 'p' must be 0 or 1, but was " + i10).toString());
                }
                Object objB = Result.b(Integer.valueOf(i10));
                uf.c.a(cursorRawQuery, null);
                return objB;
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    private final void a(Cursor cursor) {
        if (cursor.getColumnCount() == 1) {
            if (StringsKt.N(cursor.getColumnName(0), "p", false)) {
                if (cursor.moveToFirst()) {
                    if (!cursor.isLast()) {
                        throw new IllegalArgumentException("Query must return exactly one row, but returned more");
                    }
                    return;
                }
                throw new IllegalArgumentException("Query returned no rows");
            }
            throw new IllegalArgumentException(("Single column must be named 'p', got '" + cursor.getColumnName(0) + '\'').toString());
        }
        throw new IllegalArgumentException(("Query must return exactly one column, got " + cursor.getColumnCount()).toString());
    }

    private final String a(a.EnumC0965a enumC0965a) {
        int i10 = b.$EnumSwitchMapping$0[enumC0965a.ordinal()];
        if (i10 == 1) {
            return "C";
        }
        if (i10 == 2) {
            return "NC";
        }
        if (i10 == 3) {
            return "ARS";
        }
        if (i10 == 4) {
            return "NRS";
        }
        throw new m();
    }
}
