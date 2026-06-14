package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5207k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f77580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5258m f77581b;

    public RunnableC5207k(C5258m c5258m, Activity activity) {
        this.f77581b = c5258m;
        this.f77580a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77581b.a(this.f77580a);
    }
}
