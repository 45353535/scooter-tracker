package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f36253b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36254a;

    private f() {
    }

    public static f b() {
        return f36253b;
    }

    public Context a() {
        return this.f36254a;
    }

    public void a(Context context) {
        this.f36254a = context != null ? context.getApplicationContext() : null;
    }
}
