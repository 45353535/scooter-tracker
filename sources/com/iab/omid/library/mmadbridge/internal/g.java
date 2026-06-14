package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f35451b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35452a;

    private g() {
    }

    public static g b() {
        return f35451b;
    }

    public Context a() {
        return this.f35452a;
    }

    public void a(Context context) {
        this.f35452a = context != null ? context.getApplicationContext() : null;
    }
}
