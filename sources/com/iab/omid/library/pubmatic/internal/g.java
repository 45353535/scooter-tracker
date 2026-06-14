package com.iab.omid.library.pubmatic.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f35727b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35728a;

    private g() {
    }

    public static g b() {
        return f35727b;
    }

    public Context a() {
        return this.f35728a;
    }

    public void a(Context context) {
        this.f35728a = context != null ? context.getApplicationContext() : null;
    }
}
