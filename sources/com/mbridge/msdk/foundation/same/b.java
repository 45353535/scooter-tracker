package com.mbridge.msdk.foundation.same;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f48615b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f48616a = null;

    private b() {
    }

    public static b b() {
        if (f48615b == null) {
            synchronized (b.class) {
                try {
                    if (f48615b == null) {
                        f48615b = new b();
                    }
                } finally {
                }
            }
        }
        return f48615b;
    }

    public Boolean a() {
        return this.f48616a;
    }
}
