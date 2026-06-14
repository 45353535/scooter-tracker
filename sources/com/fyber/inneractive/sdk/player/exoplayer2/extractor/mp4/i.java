package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22165a = z.a("vide");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22166b = z.a("soun");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22167c = z.a("text");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22168d = z.a("sbtl");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22169e = z.a("subt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22170f = z.a("clcp");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22171g = z.a("cenc");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22172h = z.a(Constants.REFERRER_API_META);

    /* JADX WARN: Removed duplicated region for block: B:365:0x06b1 A[PHI: r25 r27 r33
  0x06b1: PHI (r25v7 int) = (r25v5 int), (r25v5 int), (r25v9 int) binds: [B:370:0x06cb, B:372:0x06d8, B:364:0x06aa] A[DONT_GENERATE, DONT_INLINE]
  0x06b1: PHI (r27v4 boolean) = (r27v2 boolean), (r27v2 boolean), (r27v6 boolean) binds: [B:370:0x06cb, B:372:0x06d8, B:364:0x06aa] A[DONT_GENERATE, DONT_INLINE]
  0x06b1: PHI (r33v3 byte[]) = (r33v1 byte[]), (r33v1 byte[]), (r33v5 byte[]) binds: [B:370:0x06cb, B:372:0x06d8, B:364:0x06aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a r51, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b r52, long r53, com.fyber.inneractive.sdk.player.exoplayer2.drm.d r55, boolean r56) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 2028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b, long, com.fyber.inneractive.sdk.player.exoplayer2.drm.d, boolean):com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s");
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, f fVar, int i12) {
        int i13 = nVar.f23135b;
        while (true) {
            if (i13 - i10 >= i11) {
                return 0;
            }
            nVar.e(i13);
            int iB = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB > 0, "childAtomSize should be positive");
            if (nVar.b() == c.W) {
                int i14 = i13 + 8;
                Pair pairCreate = null;
                boolean z10 = false;
                Integer numValueOf = null;
                t tVar = null;
                while (i14 - i13 < iB) {
                    nVar.e(i14);
                    int iB2 = nVar.b();
                    int iB3 = nVar.b();
                    if (iB3 == c.f22096c0) {
                        numValueOf = Integer.valueOf(nVar.b());
                    } else if (iB3 == c.X) {
                        nVar.e(nVar.f23135b + 4);
                        z10 = nVar.b() == f22171g;
                    } else if (iB3 == c.Y) {
                        int i15 = i14 + 8;
                        while (true) {
                            if (i15 - i14 >= iB2) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i15);
                            int iB4 = nVar.b();
                            if (nVar.b() == c.Z) {
                                nVar.e(nVar.f23135b + 6);
                                nVar.j();
                                int iJ = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new t(iJ, bArr);
                                break;
                            }
                            i15 += iB4;
                        }
                    }
                    i14 += iB2;
                }
                if (z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(numValueOf != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, tVar);
                }
                if (pairCreate != null) {
                    fVar.f22153a[i12] = (t) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            i13 += iB;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair a(int r3, com.fyber.inneractive.sdk.player.exoplayer2.util.n r4) {
        /*
            int r3 = r3 + 12
            r4.e(r3)
            int r3 = r4.f23135b
            int r3 = r3 + 1
            r4.e(r3)
            a(r4)
            int r3 = r4.f23135b
            int r3 = r3 + 2
            r4.e(r3)
            int r3 = r4.j()
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L25
            int r0 = r4.f23135b
            int r0 = r0 + 2
            r4.e(r0)
        L25:
            r0 = r3 & 64
            if (r0 == 0) goto L33
            int r0 = r4.o()
            int r1 = r4.f23135b
            int r1 = r1 + r0
            r4.e(r1)
        L33:
            r0 = 32
            r3 = r3 & r0
            if (r3 == 0) goto L3f
            int r3 = r4.f23135b
            int r3 = r3 + 2
            r4.e(r3)
        L3f:
            int r3 = r4.f23135b
            int r3 = r3 + 1
            r4.e(r3)
            a(r4)
            int r3 = r4.j()
            if (r3 == r0) goto L93
            r0 = 33
            if (r3 == r0) goto L90
            r0 = 35
            if (r3 == r0) goto L8d
            r0 = 64
            if (r3 == r0) goto L8a
            r0 = 107(0x6b, float:1.5E-43)
            r1 = 0
            if (r3 == r0) goto L83
            r0 = 165(0xa5, float:2.31E-43)
            if (r3 == r0) goto L80
            r0 = 166(0xa6, float:2.33E-43)
            if (r3 == r0) goto L7d
            switch(r3) {
                case 102: goto L8a;
                case 103: goto L8a;
                case 104: goto L8a;
                default: goto L6b;
            }
        L6b:
            switch(r3) {
                case 169: goto L76;
                case 170: goto L6f;
                case 171: goto L6f;
                case 172: goto L76;
                default: goto L6e;
            }
        L6e:
            goto L95
        L6f:
            java.lang.String r3 = "audio/vnd.dts.hd"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L76:
            java.lang.String r3 = "audio/vnd.dts"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L7d:
            java.lang.String r1 = "audio/eac3"
            goto L95
        L80:
            java.lang.String r1 = "audio/ac3"
            goto L95
        L83:
            java.lang.String r3 = "audio/mpeg"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L8a:
            java.lang.String r1 = "audio/mp4a-latm"
            goto L95
        L8d:
            java.lang.String r1 = "video/hevc"
            goto L95
        L90:
            java.lang.String r1 = "video/avc"
            goto L95
        L93:
            java.lang.String r1 = "video/mp4v-es"
        L95:
            int r3 = r4.f23135b
            int r3 = r3 + 12
            r4.e(r3)
            int r3 = r4.f23135b
            int r3 = r3 + 1
            r4.e(r3)
            int r3 = a(r4)
            byte[] r0 = new byte[r3]
            r2 = 0
            r4.a(r0, r2, r3)
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.n):android.util.Pair");
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        int i10 = iJ & 127;
        while ((iJ & 128) == 128) {
            iJ = nVar.j();
            i10 = (i10 << 7) | (iJ & 127);
        }
        return i10;
    }
}
