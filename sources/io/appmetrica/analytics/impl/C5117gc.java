package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5117gc implements F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5257ln f77253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5089fa f77254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5086f7 f77255e;

    public C5117gc(Context context, String str, @NonNull C5257ln c5257ln) {
        this(context, str, new C5089fa(str), c5257ln);
    }

    @Override // io.appmetrica.analytics.impl.F6
    @Nullable
    @WorkerThread
    public final synchronized SQLiteDatabase a() {
        C5086f7 c5086f7;
        try {
            this.f77254d.a();
            c5086f7 = new C5086f7(this.f77251a, this.f77252b, this.f77253c, PublicLogger.getAnonymousInstance());
            this.f77255e = c5086f7;
        } catch (Throwable unused) {
            return null;
        }
        return c5086f7.getWritableDatabase();
    }

    @VisibleForTesting
    public C5117gc(@NonNull Context context, @NonNull String str, @NonNull C5089fa c5089fa, @NonNull C5257ln c5257ln) {
        this.f77251a = context;
        this.f77252b = str;
        this.f77254d = c5089fa;
        this.f77253c = c5257ln;
    }

    @Override // io.appmetrica.analytics.impl.F6
    @WorkerThread
    public final synchronized void a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        no.a((Closeable) this.f77255e);
        this.f77254d.b();
        this.f77255e = null;
    }
}
