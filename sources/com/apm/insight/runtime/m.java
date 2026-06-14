package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile p f8116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f8117b;

    public static p a() {
        if (f8116a == null) {
            b();
        }
        return f8116a;
    }

    private static HandlerThread b() {
        if (f8116a == null) {
            synchronized (m.class) {
                try {
                    if (f8116a == null) {
                        p pVar = new p("default_npth_thread");
                        f8116a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return f8116a.c();
    }
}
