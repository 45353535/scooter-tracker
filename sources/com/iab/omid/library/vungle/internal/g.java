package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f36388b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36389a;

    private g() {
    }

    public static g b() {
        return f36388b;
    }

    public Context a() {
        return this.f36389a;
    }

    public void a(Context context) {
        this.f36389a = context != null ? context.getApplicationContext() : null;
    }
}
