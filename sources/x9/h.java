package x9;

import y9.i;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oa.h f108162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f108163b;

    public h(oa.h hVar, long j10) {
        this.f108162a = hVar;
        this.f108163b = j10;
    }

    @Override // x9.f
    public long getAvailableSegmentCount(long j10, long j11) {
        return this.f108162a.f96546a;
    }

    @Override // x9.f
    public long getDurationUs(long j10, long j11) {
        return this.f108162a.f96549d[(int) j10];
    }

    @Override // x9.f
    public long getFirstAvailableSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // x9.f
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // x9.f
    public long getNextSegmentAvailableTimeUs(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // x9.f
    public long getSegmentCount(long j10) {
        return this.f108162a.f96546a;
    }

    @Override // x9.f
    public long getSegmentNum(long j10, long j11) {
        return this.f108162a.a(j10 + this.f108163b);
    }

    @Override // x9.f
    public i getSegmentUrl(long j10) {
        return new i(null, this.f108162a.f96548c[(int) j10], r1.f96547b[r7]);
    }

    @Override // x9.f
    public long getTimeUs(long j10) {
        return this.f108162a.f96550e[(int) j10] - this.f108163b;
    }

    @Override // x9.f
    public boolean isExplicit() {
        return true;
    }
}
