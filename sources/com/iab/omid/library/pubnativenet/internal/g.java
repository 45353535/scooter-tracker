package com.iab.omid.library.pubnativenet.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f35862b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35863a;

    private g() {
    }

    public static g b() {
        return f35862b;
    }

    public Context a() {
        return this.f35863a;
    }

    public void a(Context context) {
        this.f35863a = context != null ? context.getApplicationContext() : null;
    }
}
