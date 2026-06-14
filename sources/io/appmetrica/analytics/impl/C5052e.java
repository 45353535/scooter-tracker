package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5052e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f77036g = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f77037h = "WatchDog-" + Gd.f75819a.incrementAndGet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f77038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f77039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f77040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5027d f77041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f77042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f77043f;

    public C5052e(Kb kb2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f77038a = copyOnWriteArrayList;
        this.f77039b = new AtomicInteger();
        this.f77040c = new Handler(Looper.getMainLooper());
        this.f77042e = new AtomicBoolean();
        this.f77043f = new Runnable() { // from class: io.appmetrica.analytics.impl.gq
            @Override // java.lang.Runnable
            public final void run() {
                this.f77282b.a();
            }
        };
        copyOnWriteArrayList.add(kb2);
    }

    public final /* synthetic */ void a() {
        this.f77042e.set(true);
    }

    public final synchronized void b() {
        C5027d c5027d = this.f77041d;
        if (c5027d != null) {
            c5027d.f76993a.set(false);
            this.f77041d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i10) {
        AtomicInteger atomicInteger = this.f77039b;
        int i11 = 5;
        if (i10 >= 5) {
            i11 = i10;
        }
        atomicInteger.set(i11);
        if (this.f77041d == null) {
            C5027d c5027d = new C5027d(this);
            this.f77041d = c5027d;
            try {
                c5027d.setName(f77037h);
            } catch (SecurityException unused) {
            }
            this.f77041d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i10));
        }
    }
}
