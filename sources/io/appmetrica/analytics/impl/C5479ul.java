package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5479ul implements F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5086f7 f78396a;

    public C5479ul(C5086f7 c5086f7) {
        this.f78396a = c5086f7;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.F6
    @Nullable
    public final SQLiteDatabase a() {
        try {
            return this.f78396a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
