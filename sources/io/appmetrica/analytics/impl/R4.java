package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class R4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q4 f76333a = new Q4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P4 f76334b = new P4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.f76333a.runScript(sQLiteDatabase);
        this.f76334b.runScript(sQLiteDatabase);
    }
}
