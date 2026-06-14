package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f51883b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f51884a;

    private l() {
    }

    public static l a() {
        if (f51883b == null) {
            synchronized (l.class) {
                try {
                    if (f51883b == null) {
                        f51883b = new l();
                    }
                } finally {
                }
            }
        }
        return f51883b;
    }

    public u b() {
        if (this.f51884a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f51884a = uVarA;
            uVarA.b();
        }
        return this.f51884a;
    }
}
