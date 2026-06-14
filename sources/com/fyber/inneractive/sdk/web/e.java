package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.e f23948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d f23949d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f23952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f23953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f23954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f23955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f23956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f23957l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f23947b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23950e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23951f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f23946a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.util.b());

    public e(i1 i1Var, String str, boolean z10, String str2, String str3, String str4) {
        this.f23957l = i1Var;
        this.f23952g = str;
        this.f23953h = z10;
        this.f23954i = str2;
        this.f23955j = str3;
        this.f23956k = str4;
    }

    public final Handler a() {
        if (this.f23947b == null) {
            synchronized (this.f23950e) {
                this.f23947b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f23947b;
    }
}
