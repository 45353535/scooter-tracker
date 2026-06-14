package hb;

import oa.i0;

/* JADX INFO: loaded from: classes12.dex */
final class a extends oa.i implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f73064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f73065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f73066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f73067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f73068l;

    public a(long j10, long j11, i0.a aVar, boolean z10) {
        this(j10, j11, aVar.f96574f, aVar.f96571c, z10);
    }

    public a d(long j10) {
        return new a(j10, this.f73064h, this.f73065i, this.f73066j, this.f73067k);
    }

    @Override // hb.g
    public int getAverageBitrate() {
        return this.f73065i;
    }

    @Override // hb.g
    public long getDataEndPosition() {
        return this.f73068l;
    }

    @Override // hb.g
    public long getTimeUs(long j10) {
        return b(j10);
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f73064h = j11;
        this.f73065i = i10;
        this.f73066j = i11;
        this.f73067k = z10;
        this.f73068l = j12 == -1 ? -1L : j12;
    }
}
