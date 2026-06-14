package com.iab.omid.library.corpmailru.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f34911a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34912b;

    private d() {
    }

    public static d a() {
        return f34911a;
    }

    public Context b() {
        return this.f34912b;
    }

    public void a(Context context) {
        this.f34912b = context != null ? context.getApplicationContext() : null;
    }
}
