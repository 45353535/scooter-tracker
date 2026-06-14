package com.iab.omid.library.bigosg.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f34528a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34529b;

    private d() {
    }

    public static d a() {
        return f34528a;
    }

    public Context b() {
        return this.f34529b;
    }

    public void a(Context context) {
        this.f34529b = context != null ? context.getApplicationContext() : null;
    }
}
