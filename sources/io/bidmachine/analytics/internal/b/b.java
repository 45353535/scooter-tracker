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
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f79480b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f79481a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.B.b$b, reason: collision with other inner class name */
    static final class C0945b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f79482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentValues f79483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0945b(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            super(1);
            this.f79482a = sQLiteDatabase;
            this.f79483b = contentValues;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f79482a;
            ContentValues contentValues = this.f79483b;
            String[] strArrA = null;
            String strA = list != null ? AbstractC5632a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((io.bidmachine.analytics.internal.C.c) it.next()).c());
                }
                strArrA = AbstractC5632a.a(arrayList);
            }
            sQLiteDatabase.update("reader_record", contentValues, strA, strArrA);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.f93236a;
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f79484a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SQLiteDatabase sQLiteDatabase) {
            super(1);
            this.f79484a = sQLiteDatabase;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = this.f79484a;
            String[] strArrA = null;
            String strA = list != null ? AbstractC5632a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((io.bidmachine.analytics.internal.C.c) it.next()).c());
                }
                strArrA = AbstractC5632a.a(arrayList);
            }
            sQLiteDatabase.delete("reader_record", strA, strArrA);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.f93236a;
        }
    }

    public b(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f79481a = sQLiteOpenHelper;
    }

    public final Object a(io.bidmachine.analytics.internal.C.c cVar) {
        Object objB;
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79481a.getWritableDatabase();
                try {
                    writableDatabase.insert("reader_record", null, b(cVar));
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

    public final Object b() {
        return a(false, (List) null);
    }

    public final Object c(io.bidmachine.analytics.internal.C.c cVar) {
        Object objB;
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79481a.getWritableDatabase();
                try {
                    writableDatabase.update("reader_record", b(cVar), "id = ?", new String[]{cVar.c()});
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

    public final Object d(List list) {
        return a(false, list);
    }

    public final Object e(List list) {
        return a(true, list);
    }

    public final Object b(List list) {
        Object objB;
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79481a.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", AbstractC5632a.a(list, "name NOT IN"), AbstractC5632a.a(list));
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

    public final Object a(String str, String str2) {
        Object objA = a(this, "name = ? AND rule = ? AND " + a(), new String[]{str, e.c(str2)}, null, 4, null);
        if (Result.i(objA)) {
            Throwable thG = Result.g(objA);
            if (thG == null) {
                thG = new Exception();
            }
            return Result.b(d.a(thG));
        }
        if (Result.i(objA)) {
            objA = null;
        }
        List list = (List) objA;
        return Result.b(list != null ? (io.bidmachine.analytics.internal.C.c) CollectionsKt.firstOrNull(list) : null);
    }

    public final Object c(List list) {
        Object objB;
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(e.c((String) it.next()));
                }
                SQLiteDatabase writableDatabase = this.f79481a.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", AbstractC5632a.a(arrayList, "rule NOT IN"), AbstractC5632a.a(arrayList));
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

    private final ContentValues b(io.bidmachine.analytics.internal.C.c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cVar.c());
        contentValues.put("name", cVar.d());
        contentValues.put("timestamp", Long.valueOf(cVar.f()));
        contentValues.put("data_hash", cVar.a());
        contentValues.put("rule", e.c(cVar.e()));
        contentValues.put("error", e.b(cVar.b(), cVar.c()));
        contentValues.put("is_dirty", Boolean.valueOf(cVar.g()));
        return contentValues;
    }

    public final Object a(String str) {
        return a(this, "name = ? AND is_reserved = 0 AND is_dirty = 1", new String[]{str}, null, 4, null);
    }

    static /* synthetic */ Object a(b bVar, String str, String[] strArr, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return bVar.a(str, strArr, str2);
    }

    /* JADX WARN: Finally extract failed */
    private final Object a(String str, String[] strArr, String str2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase readableDatabase = this.f79481a.getReadableDatabase();
                try {
                    Cursor cursorQuery = readableDatabase.query("reader_record", new String[]{"id", "name", "timestamp", "data_hash", "rule", "error", "is_dirty"}, str, strArr, null, null, "timestamp DESC", str2);
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                Result.Companion companion2 = Result.f93230c;
                                String string = cursorQuery.getString(0);
                                Result.b(Boolean.valueOf(arrayList.add(new io.bidmachine.analytics.internal.C.c(string, cursorQuery.getString(1), cursorQuery.getLong(2), cursorQuery.getString(3), e.a(cursorQuery.getString(4)), e.a(cursorQuery.getBlob(5), string), cursorQuery.getInt(6) == 1))));
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

    private final Object a(boolean z10, List list) {
        Object objB;
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79481a.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_reserved", Boolean.valueOf(z10));
                    AbstractC5632a.a(list, writableDatabase, 0, new C0945b(writableDatabase, contentValues), 2, null);
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
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                SQLiteDatabase writableDatabase = this.f79481a.getWritableDatabase();
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
        synchronized (this.f79481a) {
            try {
                Result.Companion companion = Result.f93230c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(e.c((String) it.next()));
                }
                SQLiteDatabase writableDatabase = this.f79481a.getWritableDatabase();
                try {
                    writableDatabase.delete("reader_record", "name = ? AND " + a() + " AND " + AbstractC5632a.a(arrayList, "rule IN"), AbstractC5632a.a(CollectionsKt.plus((Collection) CollectionsKt.listOf(str), (Iterable) arrayList)));
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

    private final String a() {
        return "(LENGTH(error) = 0 OR error IS NULL)";
    }
}
