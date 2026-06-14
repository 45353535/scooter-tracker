package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes11.dex */
public final class c9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9 f64354d;

    public c9(d9 d9Var, int i10, String str, String str2) {
        this.f64354d = d9Var;
        this.f64351a = i10;
        this.f64352b = str;
        this.f64353c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f64353c;
        Bitmap bitmapB = str != null ? l2.b(str) : null;
        ((m8) this.f64354d.f64410b.a()).f64912a.post(new b9(this, bitmapB));
    }
}
