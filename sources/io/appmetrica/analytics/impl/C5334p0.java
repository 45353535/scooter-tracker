package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5334p0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f77939j = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f77941b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f77944e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q1 f77946g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IAppMetricaService f77943d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f77945f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RunnableC5284n0 f77947h = new RunnableC5284n0(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ServiceConnectionC5309o0 f77948i = new ServiceConnectionC5309o0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f77942c = false;

    public C5334p0(Context context, ICommonExecutor iCommonExecutor, Q1 q12) {
        this.f77940a = context.getApplicationContext();
        this.f77941b = iCommonExecutor;
        this.f77946g = q12;
    }

    public final synchronized boolean a() {
        return this.f77943d != null;
    }

    public final void b() {
        synchronized (this.f77945f) {
            this.f77941b.remove(this.f77947h);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f77941b;
        synchronized (this.f77945f) {
            try {
                iCommonExecutor.remove(this.f77947h);
                if (!this.f77942c) {
                    iCommonExecutor.executeDelayed(this.f77947h, f77939j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Long l10) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f77944e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l10.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
