package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f22291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f22292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f22294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f22295f;

    public v(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        if (iArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (jArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        this.f22291b = jArr;
        this.f22292c = iArr;
        this.f22293d = i10;
        this.f22294e = jArr2;
        this.f22295f = iArr2;
        this.f22290a = jArr.length;
    }
}
