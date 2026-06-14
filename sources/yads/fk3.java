package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class fk3 extends l13 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ek3 f110754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f110755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f110756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ik3 f110757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gk3 f110758r;

    @Override // yads.l13
    public final void a(long j10) {
        this.f112918g = j10;
        this.f110756p = j10 != 0;
        ik3 ik3Var = this.f110757q;
        this.f110755o = ik3Var != null ? ik3Var.f112047e : 0;
    }

    @Override // yads.l13
    public final long a(w92 w92Var) {
        int i10;
        byte[] bArr = w92Var.f117356a;
        byte b10 = bArr[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        ek3 ek3Var = this.f110754n;
        if (ek3Var != null) {
            if (!ek3Var.f110400d[(b10 >> 1) & (255 >>> (8 - ek3Var.f110401e))].f111624a) {
                i10 = ek3Var.f110397a.f112047e;
            } else {
                i10 = ek3Var.f110397a.f112048f;
            }
            long j10 = this.f110756p ? (this.f110755o + i10) / 4 : 0;
            int length = bArr.length;
            int i11 = w92Var.f117358c + 4;
            if (length < i11) {
                w92Var.a(Arrays.copyOf(bArr, i11));
            } else {
                w92Var.d(i11);
            }
            byte[] bArr2 = w92Var.f117356a;
            int i12 = w92Var.f117358c;
            bArr2[i12 - 4] = (byte) (j10 & 255);
            bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
            bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
            bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
            this.f110756p = true;
            this.f110755o = i10;
            return j10;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // yads.l13
    public final boolean a(w92 w92Var, long j10, j13 j13Var) throws ba2 {
        ek3 ek3Var;
        int i10;
        int i11;
        int i12;
        if (this.f110754n != null) {
            j13Var.f112218a.getClass();
            return false;
        }
        ik3 ik3Var = this.f110757q;
        int i13 = 1;
        if (ik3Var == null) {
            this.f110757q = jk3.a(w92Var);
        } else {
            gk3 gk3Var = this.f110758r;
            if (gk3Var == null) {
                this.f110758r = jk3.a(w92Var, true, true);
            } else {
                int i14 = w92Var.f117358c;
                byte[] bArr = new byte[i14];
                System.arraycopy(w92Var.f117356a, 0, bArr, 0, i14);
                int i15 = ik3Var.f112043a;
                int i16 = 5;
                jk3.a(5, w92Var, false);
                int iM = w92Var.m() + 1;
                zj3 zj3Var = new zj3(w92Var.f117356a);
                int i17 = 8;
                zj3Var.b(w92Var.f117357b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = i17;
                    int i20 = 16;
                    if (i18 < iM) {
                        int i21 = i13;
                        if (zj3Var.a(24) == 5653314) {
                            int iA = zj3Var.a(16);
                            int iA2 = zj3Var.a(24);
                            long[] jArr = new long[iA2];
                            long jFloor = 0;
                            if (!zj3Var.a()) {
                                boolean zA = zj3Var.a();
                                int i22 = 0;
                                while (i22 < iA2) {
                                    if (zA) {
                                        if (zj3Var.a()) {
                                            i12 = iM;
                                            jArr[i22] = zj3Var.a(i16) + 1;
                                        } else {
                                            i12 = iM;
                                            jArr[i22] = 0;
                                        }
                                        i11 = 5;
                                    } else {
                                        i11 = i16;
                                        i12 = iM;
                                        jArr[i22] = zj3Var.a(i11) + 1;
                                    }
                                    i22++;
                                    i16 = i11;
                                    iM = i12;
                                }
                                i10 = iM;
                            } else {
                                i10 = iM;
                                int iA3 = zj3Var.a(i16) + 1;
                                int i23 = 0;
                                while (i23 < iA2) {
                                    int i24 = 0;
                                    for (int i25 = iA2 - i23; i25 > 0; i25 >>>= 1) {
                                        i24++;
                                    }
                                    int iA4 = zj3Var.a(i24);
                                    int i26 = 0;
                                    while (i26 < iA4 && i23 < iA2) {
                                        jArr[i23] = iA3;
                                        i23++;
                                        i26++;
                                        ik3Var = ik3Var;
                                        gk3Var = gk3Var;
                                    }
                                    iA3++;
                                    ik3Var = ik3Var;
                                    gk3Var = gk3Var;
                                }
                            }
                            ik3 ik3Var2 = ik3Var;
                            gk3 gk3Var2 = gk3Var;
                            int iA5 = zj3Var.a(4);
                            if (iA5 > 2) {
                                throw new ba2(he2.a("lookup type greater than 2 not decodable: ", iA5), null, true, 1);
                            }
                            if (iA5 == i21 || iA5 == 2) {
                                zj3Var.b(32);
                                zj3Var.b(32);
                                int iA6 = zj3Var.a(4) + i21;
                                zj3Var.b(i21);
                                if (iA5 != i21) {
                                    jFloor = ((long) iA2) * ((long) iA);
                                } else if (iA != 0) {
                                    jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / ((double) iA)));
                                }
                                zj3Var.b((int) (((long) iA6) * jFloor));
                            }
                            i18++;
                            i17 = i19;
                            ik3Var = ik3Var2;
                            iM = i10;
                            gk3Var = gk3Var2;
                            i16 = 5;
                            i13 = 1;
                        } else {
                            throw new ba2("expected code book to start with [0x56, 0x43, 0x42] at " + ((zj3Var.f118723c * 8) + zj3Var.f118724d), null, true, 1);
                        }
                    } else {
                        ik3 ik3Var3 = ik3Var;
                        gk3 gk3Var3 = gk3Var;
                        ?? r92 = i13;
                        int i27 = 6;
                        int iA7 = zj3Var.a(6) + (r92 == true ? 1 : 0);
                        for (int i28 = 0; i28 < iA7; i28++) {
                            if (zj3Var.a(16) != 0) {
                                throw new ba2("placeholder of time domain transforms not zeroed out", null, r92, r92 == true ? 1 : 0);
                            }
                        }
                        int iA8 = zj3Var.a(6) + (r92 == true ? 1 : 0);
                        int i29 = 0;
                        ?? r93 = r92;
                        while (true) {
                            int i30 = 3;
                            if (i29 < iA8) {
                                int iA9 = zj3Var.a(i20);
                                if (iA9 == 0) {
                                    int i31 = i19;
                                    zj3Var.b(i31);
                                    zj3Var.b(16);
                                    zj3Var.b(16);
                                    zj3Var.b(6);
                                    zj3Var.b(i31);
                                    int iA10 = zj3Var.a(4) + r93;
                                    int i32 = 0;
                                    while (i32 < iA10) {
                                        zj3Var.b(i31);
                                        i32++;
                                        i31 = 8;
                                    }
                                } else if (iA9 == r93) {
                                    int iA11 = zj3Var.a(5);
                                    int[] iArr = new int[iA11];
                                    int i33 = -1;
                                    for (int i34 = 0; i34 < iA11; i34++) {
                                        int iA12 = zj3Var.a(4);
                                        iArr[i34] = iA12;
                                        if (iA12 > i33) {
                                            i33 = iA12;
                                        }
                                    }
                                    int i35 = i33 + 1;
                                    int[] iArr2 = new int[i35];
                                    int i36 = 0;
                                    while (i36 < i35) {
                                        iArr2[i36] = zj3Var.a(i30) + 1;
                                        int iA13 = zj3Var.a(2);
                                        int i37 = i19;
                                        if (iA13 > 0) {
                                            zj3Var.b(i37);
                                        }
                                        int i38 = 0;
                                        for (int i39 = 1; i38 < (i39 << iA13); i39 = 1) {
                                            zj3Var.b(i37);
                                            i38++;
                                            i37 = 8;
                                        }
                                        i36++;
                                        i19 = 8;
                                        i30 = 3;
                                    }
                                    zj3Var.b(2);
                                    int iA14 = zj3Var.a(4);
                                    int i40 = 0;
                                    int i41 = 0;
                                    for (int i42 = 0; i42 < iA11; i42++) {
                                        i40 += iArr2[iArr[i42]];
                                        while (i41 < i40) {
                                            zj3Var.b(iA14);
                                            i41++;
                                        }
                                    }
                                } else {
                                    throw new ba2(he2.a("floor type greater than 1 not decodable: ", iA9), null, true, 1);
                                }
                                i29++;
                                i19 = 8;
                                i27 = 6;
                                r93 = 1;
                                i20 = 16;
                            } else {
                                int i43 = 1;
                                int iA15 = zj3Var.a(i27) + 1;
                                int i44 = 0;
                                while (i44 < iA15) {
                                    if (zj3Var.a(16) <= 2) {
                                        zj3Var.b(24);
                                        zj3Var.b(24);
                                        zj3Var.b(24);
                                        int iA16 = zj3Var.a(i27) + 1;
                                        int i45 = 8;
                                        zj3Var.b(8);
                                        int[] iArr3 = new int[iA16];
                                        for (int i46 = 0; i46 < iA16; i46++) {
                                            iArr3[i46] = ((zj3Var.a() ? zj3Var.a(5) : 0) * 8) + zj3Var.a(3);
                                        }
                                        int i47 = 0;
                                        while (i47 < iA16) {
                                            int i48 = 0;
                                            while (i48 < i45) {
                                                if ((iArr3[i47] & (1 << i48)) != 0) {
                                                    zj3Var.b(i45);
                                                }
                                                i48++;
                                                i45 = 8;
                                            }
                                            i47++;
                                            i45 = 8;
                                        }
                                        i44++;
                                        i27 = 6;
                                        i43 = 1;
                                    } else {
                                        throw new ba2("residueType greater than 2 is not decodable", null, true, 1);
                                    }
                                }
                                int iA17 = zj3Var.a(i27) + i43;
                                for (int i49 = 0; i49 < iA17; i49++) {
                                    int iA18 = zj3Var.a(16);
                                    if (iA18 != 0) {
                                        uf1.b("VorbisUtil", "mapping type other than 0 not supported: " + iA18);
                                    } else {
                                        int iA19 = zj3Var.a() ? zj3Var.a(4) + 1 : 1;
                                        if (zj3Var.a()) {
                                            int iA20 = zj3Var.a(8) + 1;
                                            for (int i50 = 0; i50 < iA20; i50++) {
                                                int i51 = i15 - 1;
                                                int i52 = 0;
                                                for (int i53 = i51; i53 > 0; i53 >>>= 1) {
                                                    i52++;
                                                }
                                                zj3Var.b(i52);
                                                int i54 = 0;
                                                while (i51 > 0) {
                                                    i54++;
                                                    i51 >>>= 1;
                                                }
                                                zj3Var.b(i54);
                                            }
                                        }
                                        if (zj3Var.a(2) != 0) {
                                            throw new ba2("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                        }
                                        if (iA19 > 1) {
                                            for (int i55 = 0; i55 < i15; i55++) {
                                                zj3Var.b(4);
                                            }
                                        }
                                        for (int i56 = 0; i56 < iA19; i56++) {
                                            zj3Var.b(8);
                                            zj3Var.b(8);
                                            zj3Var.b(8);
                                        }
                                    }
                                }
                                int iA21 = zj3Var.a(6);
                                int i57 = iA21 + 1;
                                hk3[] hk3VarArr = new hk3[i57];
                                for (int i58 = 0; i58 < i57; i58++) {
                                    boolean zA2 = zj3Var.a();
                                    zj3Var.a(16);
                                    zj3Var.a(16);
                                    zj3Var.a(8);
                                    hk3VarArr[i58] = new hk3(zA2);
                                }
                                if (zj3Var.a()) {
                                    int i59 = 0;
                                    while (iA21 > 0) {
                                        i59++;
                                        iA21 >>>= 1;
                                    }
                                    ek3Var = new ek3(ik3Var3, gk3Var3, bArr, hk3VarArr, i59);
                                } else {
                                    throw new ba2("framing bit after modes not set as expected", null, true, 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        ek3Var = null;
        this.f110754n = ek3Var;
        if (ek3Var == null) {
            return true;
        }
        ik3 ik3Var4 = ek3Var.f110397a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ik3Var4.f112049g);
        arrayList.add(ek3Var.f110399c);
        fr1 fr1VarA = jk3.a(y31.b(ek3Var.f110398b.f111245a));
        xv0 xv0Var = new xv0();
        xv0Var.f117982k = "audio/vorbis";
        xv0Var.f117977f = ik3Var4.f112046d;
        xv0Var.f117978g = ik3Var4.f112045c;
        xv0Var.f117995x = ik3Var4.f112043a;
        xv0Var.f117996y = ik3Var4.f112044b;
        xv0Var.f117984m = arrayList;
        xv0Var.f117980i = fr1VarA;
        j13Var.f112218a = new yv0(xv0Var);
        return true;
    }

    @Override // yads.l13
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f110754n = null;
            this.f110757q = null;
            this.f110758r = null;
        }
        this.f110755o = 0;
        this.f110756p = false;
    }
}
