package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class pk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f65120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f65121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ti f65122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk f65123d;

    public pk(rk rkVar, AtomicBoolean atomicBoolean, WebView webView, ti tiVar) {
        this.f65123d = rkVar;
        this.f65120a = atomicBoolean;
        this.f65121b = webView;
        this.f65122c = tiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f65120a.compareAndSet(false, true)) {
            this.f65123d.a(this.f65121b);
            this.f65122c.a("Unknown error");
        }
    }
}
