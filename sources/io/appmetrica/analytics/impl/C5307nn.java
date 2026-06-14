package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5307nn implements InterfaceC5282mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f77869a;

    public C5307nn(@NonNull String str, @NonNull HashMap<String, List<String>> map) {
        this.f77869a = map;
    }

    @VisibleForTesting(otherwise = 5)
    public final HashMap<String, List<String>> a() {
        return this.f77869a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5282mn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry entry : this.f77869a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor cursorQuery = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        no.a(cursorQuery);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= list.equals(listAsList);
                    no.a(cursorQuery);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th2) {
                    no.a((Cursor) null);
                    throw th2;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
