package com.bytedance.sdk.component.mo.qdl.mml.ud;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16526ud;

    qdl(int i10, int i11, long j10) {
        if (i11 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.qdl = i10;
        this.f16526ud = i11;
    }

    public static qdl lnr() {
        return new qdl(1, 100, 172800000L);
    }

    public static qdl mml() {
        return new qdl(1, 100, -1L);
    }

    public static qdl mzz() {
        return new qdl(3, 100, 172800000L);
    }

    public int qdl() {
        return this.qdl;
    }

    public int ud() {
        return this.f16526ud;
    }
}
