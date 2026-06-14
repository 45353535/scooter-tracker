package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f35040b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35041a;

    private g() {
    }

    public static g b() {
        return f35040b;
    }

    public Context a() {
        return this.f35041a;
    }

    public void a(Context context) {
        this.f35041a = context != null ? context.getApplicationContext() : null;
    }
}
