package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f64676a;

    public i2(k2 k2Var) {
        this.f64676a = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmapB;
        k2 k2Var = this.f64676a;
        if (k2Var.f64810b) {
            bitmapB = l2.a(k2Var.f64809a, k2Var.f64811c);
        } else {
            bitmapB = l2.b(k2Var.f64811c);
        }
        new Handler(Looper.getMainLooper()).post(new h2(this, bitmapB));
    }
}
