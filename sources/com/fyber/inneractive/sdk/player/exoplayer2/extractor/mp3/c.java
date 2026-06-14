package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f22068m = z.a("Xing");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f22069n = z.a(LogConstants.EVENT_INFO);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f22070o = z.a("VBRI");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22071a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f22075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f22076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f22078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f22079i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22082l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f22072b = new n(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f22073c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f22074d = new m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22080j = -9223372036854775807L;

    public c(long j10) {
        this.f22071a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return a(bVar, true);
    }

    public final a b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.f22072b.f23134a, 0, 4, false);
        this.f22072b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f22072b.b(), this.f22073c);
        return new a(this.f22073c.f22308f, bVar.f21741c, bVar.f21740b);
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws Throwable {
        int i10;
        int i11;
        int iA;
        int i12 = z10 ? 16384 : 131072;
        bVar.f21743e = 0;
        if (bVar.f21741c == 0) {
            int i13 = 0;
            while (true) {
                bVar.a(this.f22072b.f23134a, 0, 10, false);
                this.f22072b.e(0);
                if (this.f22072b.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f22779b) {
                    break;
                }
                n nVar = this.f22072b;
                nVar.e(nVar.f23135b + 3);
                int i14 = this.f22072b.i();
                int i15 = i14 + 10;
                if (this.f22078h == null) {
                    byte[] bArr = new byte[i15];
                    System.arraycopy(this.f22072b.f23134a, 0, bArr, 0, 10);
                    bVar.a(bArr, 10, i14, false);
                    com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n(null).a(i15, bArr);
                    this.f22078h = bVarA;
                    if (bVarA != null) {
                        this.f22074d.a(bVarA);
                    }
                } else {
                    bVar.a(i14, false);
                }
                i13 += i15;
            }
            bVar.f21743e = 0;
            bVar.a(i13, false);
            i10 = (int) (bVar.f21741c + ((long) bVar.f21743e));
            if (!z10) {
                bVar.a(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i16 = i11;
        int i17 = i16;
        while (true) {
            if (!bVar.a(this.f22072b.f23134a, 0, 4, i11 > 0)) {
                break;
            }
            this.f22072b.e(0);
            int iB = this.f22072b.b();
            if ((i16 == 0 || ((-128000) & iB) == (((long) i16) & (-128000))) && (iA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB, this.f22073c);
                    i16 = iB;
                }
                bVar.a(iA - 4, false);
            } else {
                int i18 = i17 + 1;
                if (i17 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Searched too many bytes.");
                }
                if (z10) {
                    bVar.f21743e = 0;
                    bVar.a(i10 + i18, false);
                } else {
                    bVar.a(1);
                }
                i16 = 0;
                i17 = i18;
                i11 = 0;
            }
        }
        if (z10) {
            bVar.a(i10 + i17);
        } else {
            bVar.f21743e = 0;
        }
        this.f22077g = i16;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f22075e = jVar;
        this.f22076f = jVar.a(0, 1);
        this.f22075e.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f22077g = 0;
        this.f22080j = -9223372036854775807L;
        this.f22081k = 0L;
        this.f22082l = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r42, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }
}
