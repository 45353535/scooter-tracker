package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Zk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f76761d = "SESSION_SLEEP_START";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f76762e = "SESSION_LAST_EVENT_OFFSET";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f76763f = "SESSION_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f76764g = "SESSION_COUNTER_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f76765h = "SESSION_INIT_TIME";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f76766i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final C4991bf f76768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5270mb f76769c;

    public Zk(@NonNull C4991bf c4991bf, @NonNull String str) {
        this.f76768b = c4991bf;
        this.f76767a = str;
        C5270mb c5270mb = new C5270mb();
        try {
            String strH = c4991bf.h(str);
            if (!TextUtils.isEmpty(strH)) {
                c5270mb = new C5270mb(strH);
            }
        } catch (Throwable unused) {
        }
        this.f76769c = c5270mb;
    }

    public final Zk a(long j10) {
        a(f76765h, Long.valueOf(j10));
        return this;
    }

    public final Zk b(long j10) {
        a(f76762e, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long c() {
        return this.f76769c.a(f76765h);
    }

    public final Zk d(long j10) {
        a(f76763f, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long e() {
        return this.f76769c.a(f76764g);
    }

    @Nullable
    public final Long f() {
        return this.f76769c.a(f76763f);
    }

    @Nullable
    public final Long g() {
        return this.f76769c.a(f76761d);
    }

    public final boolean h() {
        return this.f76769c.length() > 0;
    }

    @Nullable
    public final Boolean i() {
        C5270mb c5270mb = this.f76769c;
        c5270mb.getClass();
        try {
            return Boolean.valueOf(c5270mb.getBoolean(f76766i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Zk a(boolean z10) {
        a(f76766i, Boolean.valueOf(z10));
        return this;
    }

    public final void b() {
        this.f76768b.e(this.f76767a, this.f76769c.toString());
        this.f76768b.b();
    }

    public final Zk c(long j10) {
        a(f76764g, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long d() {
        return this.f76769c.a(f76762e);
    }

    public final Zk e(long j10) {
        a(f76761d, Long.valueOf(j10));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f76769c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f76769c = new C5270mb();
        b();
    }
}
