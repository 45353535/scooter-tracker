package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends com.fyber.inneractive.sdk.player.exoplayer2.x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f22907g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22912f;

    public x(long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f22908b = j10;
        this.f22909c = j11;
        this.f22910d = j12;
        this.f22911e = j13;
        this.f22912f = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int b() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.w a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.w wVar, long j10) {
        if (i10 < 0 || i10 >= 1) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = this.f22911e;
        boolean z10 = this.f22912f;
        if (z10) {
            j11 += j10;
            if (j11 > this.f22909c) {
                j11 = -9223372036854775807L;
            }
        }
        long j12 = this.f22909c;
        long j13 = this.f22910d;
        wVar.f23244a = null;
        wVar.f23245b = z10;
        wVar.f23248e = j11;
        wVar.f23249f = j12;
        wVar.f23246c = 0;
        wVar.f23247d = 0;
        wVar.f23250g = j13;
        return wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.v a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.v vVar, boolean z10) {
        if (i10 >= 0 && i10 < 1) {
            Object obj = z10 ? f22907g : null;
            long j10 = this.f22908b;
            long j11 = -this.f22910d;
            vVar.f23170a = obj;
            vVar.f23171b = obj;
            vVar.f23172c = 0;
            vVar.f23173d = j10;
            vVar.f23174e = j11;
            return vVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a(Object obj) {
        return f22907g.equals(obj) ? 0 : -1;
    }
}
