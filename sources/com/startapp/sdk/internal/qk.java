package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class qk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f65168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f65169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ti f65170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f65171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk f65172e;

    public qk(rk rkVar, AtomicBoolean atomicBoolean, WebView webView, ti tiVar, AtomicLong atomicLong) {
        this.f65172e = rkVar;
        this.f65168a = atomicBoolean;
        this.f65169b = webView;
        this.f65170c = tiVar;
        this.f65171d = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f65168a.compareAndSet(false, true)) {
            this.f65172e.a(this.f65169b);
            ti tiVar = this.f65170c;
            this.f65171d.get();
            vi.b();
            tiVar.a();
        }
    }
}
