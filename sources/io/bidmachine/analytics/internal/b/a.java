package io.bidmachine.analytics.internal.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.bidmachine.analytics.internal.a.AbstractC5632a;
import io.bidmachine.analytics.internal.a.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0944a f79475b = new C0944a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f79476a;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.B.a$a, reason: collision with other inner class name */
    public static final class C0944a {
        public /* synthetic */ C0944a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0944a() {
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f79477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentValues f79478b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            super(1);
            this.f79477a = sQLiteDatabase;
            this.f79478b = contentValues;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f79477a;
            ContentValues contentValues = this.f79478b;
            String[] strArrA = null;
            String strA = list != null ? AbstractC5632a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((io.bidmachine.analytics.internal.C.a) it.next()).c());
                }
                strArrA = AbstractC5632a.a(arrayList);
            }
            sQLiteDatabase.update("monitor_record", contentValues, strA, strArrA);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.f93236a;
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f79479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SQLiteDatabase sQLiteDatabase) {
            super(1);
            this.f79479a = sQLiteDatabase;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f79479a;
            String[] strArrA = null;
            String strA = list != null ? AbstractC5632a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((io.bidmachine.analytics.internal.C.a) it.next()).c());
                }
                strArrA = AbstractC5632a.a(arrayList);
            }
            sQLiteDatabase.delete("monitor_record", strA, strArrA);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.f93236a;
        }
    }

    public a(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f79476a = sQLiteOpenHelper;
    }

    public final Object a(io.bidmachine.analytics.internal.C.a aVar) {
        Object objB;
        synchronized (this.f79476a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79476a.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", aVar.c());
                    contentValues.put("name", aVar.d());
                    contentValues.put("timestamp", Long.valueOf(aVar.f()));
                    contentValues.put("session_id", aVar.e());
                    contentValues.put("data", e.b(aVar.a(), aVar.c()));
                    contentValues.put("error", e.b(aVar.b(), aVar.c()));
                    writableDatabase.insert("monitor_record", null, contentValues);
                    Unit unit = Unit.f93236a;
                    uf.c.a(writableDatabase, null);
                    objB = Result.b(unit);
                } finally {
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
        }
        return objB;
    }

    public final Object b(List list) {
        return a(false, list);
    }

    public final Object c(List list) {
        return a(true, list);
    }

    public final Object a(String str, String str2) {
        return a(str, str2, (Integer) null);
    }

    public final Object a(String str, String str2, Integer num) {
        return a("name = ? AND session_id = ? AND is_reserved = 0", new String[]{str, str2}, num != null ? num.toString() : null);
    }

    /* JADX WARN: Finally extract failed */
    private final Object a(String str, String[] strArr, String str2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f79476a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase readableDatabase = this.f79476a.getReadableDatabase();
                try {
                    Cursor cursorQuery = readableDatabase.query("monitor_record", new String[]{"id", "name", "timestamp", "session_id", "data", "error"}, str, strArr, null, null, "timestamp DESC", str2);
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                Result.Companion companion2 = Result.f93230c;
                                String string = cursorQuery.getString(0);
                                String string2 = cursorQuery.getString(1);
                                long j10 = cursorQuery.getLong(2);
                                Result.b(Boolean.valueOf(arrayList.add(new io.bidmachine.analytics.internal.C.a(string, string2, cursorQuery.getString(3), j10, e.a(cursorQuery.getBlob(4), string), e.a(cursorQuery.getBlob(5), string)))));
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.f93230c;
                                Result.b(d.a(th2));
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                uf.c.a(cursorQuery, th3);
                                throw th4;
                            }
                        }
                    }
                    Unit unit = Unit.f93236a;
                    uf.c.a(cursorQuery, null);
                    uf.c.a(readableDatabase, null);
                    Result.b(unit);
                } finally {
                }
            } catch (Throwable th5) {
                Result.Companion companion4 = Result.f93230c;
                Result.b(d.a(th5));
            }
        }
        return Result.b(arrayList);
    }

    public final Object a() {
        return a(false, (List) null);
    }

    private final Object a(boolean z10, List list) {
        Object objB;
        synchronized (this.f79476a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79476a.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_reserved", Boolean.valueOf(z10));
                    AbstractC5632a.a(list, writableDatabase, 0, new b(writableDatabase, contentValues), 2, null);
                    Unit unit = Unit.f93236a;
                    uf.c.a(writableDatabase, null);
                    objB = Result.b(unit);
                } finally {
                }
            } finally {
            }
        }
        return objB;
    }

    public final Object a(List list) {
        Object objB;
        synchronized (this.f79476a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79476a.getWritableDatabase();
                try {
                    AbstractC5632a.a(list, writableDatabase, 0, new c(writableDatabase), 2, null);
                    Unit unit = Unit.f93236a;
                    uf.c.a(writableDatabase, null);
                    objB = Result.b(unit);
                } finally {
                }
            } finally {
            }
        }
        return objB;
    }

    public final Object a(String str, List list) {
        Object objB;
        synchronized (this.f79476a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79476a.getWritableDatabase();
                try {
                    writableDatabase.delete("monitor_record", "session_id != ? OR " + AbstractC5632a.a(list, "name NOT IN"), AbstractC5632a.a(CollectionsKt.plus((Collection) CollectionsKt.listOf(str), (Iterable) list)));
                    Unit unit = Unit.f93236a;
                    uf.c.a(writableDatabase, null);
                    objB = Result.b(unit);
                } finally {
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
        }
        return objB;
    }
}
