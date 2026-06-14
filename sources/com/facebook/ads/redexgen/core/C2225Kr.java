package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2225Kr<T> {
    public final T A00;
    public final Throwable A01;
    public final boolean A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Kr != com.facebook.ads.cache.api.CacheResponse<T> */
    public C2225Kr(boolean z10, T result) {
        this.A02 = z10;
        this.A00 = result;
        this.A01 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Kr != com.facebook.ads.cache.api.CacheResponse<T> */
    public C2225Kr(boolean z10, T result, Throwable th2) {
        this.A02 = z10;
        this.A00 = result;
        this.A01 = th2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Kr != com.facebook.ads.cache.api.CacheResponse<T> */
    public final T A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Kr != com.facebook.ads.cache.api.CacheResponse<T> */
    public final boolean A01() {
        return this.A02;
    }
}
