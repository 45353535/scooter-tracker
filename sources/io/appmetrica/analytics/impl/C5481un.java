package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5481un implements TempCacheStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F6 f78399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f78401c = new SystemTimeProvider();

    public C5481un(@NotNull F6 f62, @NotNull String str) {
        this.f78399a = f62;
        this.f78400b = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(@NotNull String str, int i10) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseA;
        C5531wn c5531wn;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        Cursor cursor = null;
        try {
            sQLiteDatabaseA = this.f78399a.a();
        } catch (Throwable unused) {
            cursorQuery = null;
        }
        if (sQLiteDatabaseA != null) {
            try {
                cursorQuery = sQLiteDatabaseA.query(false, this.f78400b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(i10));
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                c5531wn = new C5531wn(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("scope")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("timestamp")), cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c5531wn = null;
                            }
                            if (c5531wn != null) {
                                arrayList.add(c5531wn);
                            }
                        } catch (Throwable unused3) {
                            sQLiteDatabase = sQLiteDatabaseA;
                            sQLiteDatabaseA = sQLiteDatabase;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursorQuery = null;
            }
            cursor = cursorQuery;
        }
        no.a(cursor);
        this.f78399a.a(sQLiteDatabaseA);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@NotNull String str, long j10, @NotNull byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.f78399a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j10));
                    contentValues.put("data", bArr);
                    long jInsertOrThrow = sQLiteDatabaseA.insertOrThrow(this.f78400b, null, contentValues);
                    this.f78399a.a(sQLiteDatabaseA);
                    return jInsertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                    this.f78399a.a(sQLiteDatabaseA);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f78399a.a(sQLiteDatabaseA);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j10) {
        a("id=?", new String[]{String.valueOf(j10)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j10) {
        a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f78401c.currentTimeMillis() - j10)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        return (TempCacheStorage.Entry) CollectionsKt.firstOrNull((List) get(str, 1));
    }

    public final void a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f78399a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.delete(this.f78400b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f78399a.a(sQLiteDatabaseA);
    }
}
