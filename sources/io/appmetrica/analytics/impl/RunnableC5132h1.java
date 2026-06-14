package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5132h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f77283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f77284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f77285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77286d;

    public RunnableC5132h1(C5409s1 c5409s1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f77286d = c5409s1;
        this.f77283a = context;
        this.f77284b = startupParamsCallback;
        this.f77285c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5533x0 c5533x0 = this.f77286d.f78196a;
        Context applicationContext = this.f77283a.getApplicationContext();
        c5533x0.getClass();
        C5508w0 c5508w0A = C5508w0.a(applicationContext);
        c5508w0A.f().a(this.f77284b, this.f77285c);
    }
}
