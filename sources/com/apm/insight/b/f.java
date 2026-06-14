package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f7659a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f7660c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f7661b;

    private f(@NonNull Context context) {
        this.f7661b = new b(context);
        g gVar = new g();
        f7660c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f7659a == null) {
            synchronized (f.class) {
                try {
                    if (f7659a == null) {
                        f7659a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f7659a;
    }

    public static g b() {
        return f7660c;
    }

    public final void c() {
        this.f7661b.a();
    }

    public final void d() {
        this.f7661b.b();
    }

    public final b a() {
        return this.f7661b;
    }
}
