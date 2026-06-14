package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f21348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f21349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f21351d = new m1(this);

    public n1(t0 t0Var, Thread thread, int i10) {
        this.f21349b = new WeakReference(t0Var);
        this.f21348a = new WeakReference(thread);
        this.f21350c = i10;
    }
}
