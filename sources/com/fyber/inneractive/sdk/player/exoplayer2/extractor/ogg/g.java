package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22337h = z.a("OggS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f22343f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22344g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(255);

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f22344g;
        nVar.f23135b = 0;
        nVar.f23136c = 0;
        this.f22338a = 0;
        this.f22339b = 0L;
        this.f22340c = 0;
        this.f22341d = 0;
        this.f22342e = 0;
        long j10 = bVar.f21740b;
        if ((j10 != -1 && j10 - (bVar.f21741c + ((long) bVar.f21743e)) < 27) || !bVar.a(nVar.f23134a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f22344g.k() != f22337h) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected OggS capture pattern at begin of page");
        }
        if (this.f22344g.j() != 0) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("unsupported bit stream revision");
        }
        this.f22338a = this.f22344g.j();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f22344g;
        byte[] bArr = nVar2.f23134a;
        int i10 = nVar2.f23135b;
        int i11 = i10 + 1;
        nVar2.f23135b = i11;
        long j11 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        nVar2.f23135b = i12;
        long j12 = j11 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        nVar2.f23135b = i13;
        long j13 = j12 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        nVar2.f23135b = i14;
        long j14 = j13 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        nVar2.f23135b = i15;
        long j15 = j14 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        nVar2.f23135b = i16;
        long j16 = j15 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        nVar2.f23135b = i17;
        long j17 = j16 | ((((long) bArr[i16]) & 255) << 48);
        nVar2.f23135b = i10 + 8;
        this.f22339b = j17 | ((255 & ((long) bArr[i17])) << 56);
        nVar2.e();
        this.f22344g.e();
        this.f22344g.e();
        int iJ = this.f22344g.j();
        this.f22340c = iJ;
        this.f22341d = iJ + 27;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f22344g;
        nVar3.f23135b = 0;
        nVar3.f23136c = 0;
        bVar.a(nVar3.f23134a, 0, iJ, false);
        for (int i18 = 0; i18 < this.f22340c; i18++) {
            this.f22343f[i18] = this.f22344g.j();
            this.f22342e += this.f22343f[i18];
        }
        return true;
    }
}
