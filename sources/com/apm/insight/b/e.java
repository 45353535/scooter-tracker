package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f7656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f7657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f7658c = false;

    public boolean a() {
        return false;
    }

    @CallSuper
    public void b(String str) {
        this.f7658c = false;
    }

    @CallSuper
    public void a(String str) {
        this.f7658c = true;
    }
}
