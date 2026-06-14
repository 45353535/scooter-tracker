package com.iab.omid.library.taurusx.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f36125b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36126a;

    private f() {
    }

    public static f b() {
        return f36125b;
    }

    public Context a() {
        return this.f36126a;
    }

    public void a(Context context) {
        this.f36126a = context != null ? context.getApplicationContext() : null;
    }
}
