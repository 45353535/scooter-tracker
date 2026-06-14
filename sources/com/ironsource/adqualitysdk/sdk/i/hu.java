package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes10.dex */
public final class hu {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static hu f2427;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final hq f2429 = new hq();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final hz f2428 = new hz();

    private hu() {
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized hu m6637() {
        try {
            if (f2427 == null) {
                f2427 = new hu();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2427;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m6638() {
        f2427 = null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hz m6639() {
        return this.f2428;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hq m6640() {
        return this.f2429;
    }
}
