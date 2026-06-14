package com.iab.omid.library.appodeal.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f34400b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34401a;

    private g() {
    }

    public static g b() {
        return f34400b;
    }

    public Context a() {
        return this.f34401a;
    }

    public void a(Context context) {
        this.f34401a = context != null ? context.getApplicationContext() : null;
    }
}
