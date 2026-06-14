package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f7644b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f7645a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7646c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f7647d;

    c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f7646c) {
                    return;
                }
                c.this.f7645a.d();
                long unused = c.f7644b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f7647d, 500L);
                } else {
                    m.a().a(c.this.f7647d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f7644b);
            }
        };
        this.f7647d = runnable;
        this.f7645a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f7644b <= 15000;
    }

    public final void b() {
        this.f7646c = true;
    }

    public final void a() {
        if (this.f7646c) {
            return;
        }
        m.a().a(this.f7647d, 5000L);
    }
}
