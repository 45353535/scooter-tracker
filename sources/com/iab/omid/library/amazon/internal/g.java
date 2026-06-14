package com.iab.omid.library.amazon.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f34135b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34136a;

    private g() {
    }

    public static g b() {
        return f34135b;
    }

    public Context a() {
        return this.f34136a;
    }

    public void a(Context context) {
        this.f34136a = context != null ? context.getApplicationContext() : null;
    }
}
