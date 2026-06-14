package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes11.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f64596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f64597b;

    public h2(i2 i2Var, Bitmap bitmap) {
        this.f64597b = i2Var;
        this.f64596a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k2 k2Var = this.f64597b.f64676a;
        k2Var.f64812d.a(this.f64596a, k2Var.f64813e);
    }
}
