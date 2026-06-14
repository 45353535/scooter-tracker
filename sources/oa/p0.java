package oa;

import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f96640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f96641b;

    public p0(long j10) {
        this(j10, 0L);
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f96640a;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        return new m0.a(new n0(j10, this.f96641b));
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return true;
    }

    public p0(long j10, long j11) {
        this.f96640a = j10;
        this.f96641b = j11;
    }
}
