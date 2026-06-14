package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22312a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f22315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22323l;

    public b(long j10, long j11, l lVar, int i10, long j12) {
        if (j10 < 0 || j11 <= j10) {
            throw new IllegalArgumentException();
        }
        this.f22315d = lVar;
        this.f22313b = j10;
        this.f22314c = j11;
        if (i10 != j11 - j10) {
            this.f22316e = 0;
        } else {
            this.f22317f = j12;
            this.f22316e = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r23) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b):long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        if (this.f22317f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        int i10 = this.f22316e;
        if (i10 != 3 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        long j11 = j10 == 0 ? 0L : (((long) this.f22315d.f22358i) * j10) / 1000000;
        this.f22319h = j11;
        this.f22316e = 2;
        this.f22320i = this.f22313b;
        this.f22321j = this.f22314c;
        this.f22322k = 0L;
        this.f22323l = this.f22317f;
        return j11;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, long j10) throws InterruptedException, EOFException {
        int i10;
        long jMin = Math.min(j10 + 3, this.f22314c);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j11 = bVar.f21741c;
            int i12 = 0;
            if (((long) i11) + j11 > jMin && (i11 = (int) (jMin - j11)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i11, false);
            while (true) {
                i10 = i11 - 3;
                if (i12 < i10) {
                    if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        bVar.a(i12);
                        return true;
                    }
                    i12++;
                }
            }
            bVar.a(i10);
        }
    }
}
