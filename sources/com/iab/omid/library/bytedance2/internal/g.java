package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f34656b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34657a;

    private g() {
    }

    public static g b() {
        return f34656b;
    }

    public Context a() {
        return this.f34657a;
    }

    public void a(Context context) {
        this.f34657a = context != null ? context.getApplicationContext() : null;
    }
}
