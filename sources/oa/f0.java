package oa;

import java.util.Collections;
import java.util.List;
import r9.f;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f96535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f96536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f96537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f96538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f96539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f96540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f96541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f96542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f96543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.k f96544o;

    private f0(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f10, int i20, String str, f.k kVar) {
        this.f96530a = list;
        this.f96531b = i10;
        this.f96532c = i11;
        this.f96533d = i12;
        this.f96534e = i13;
        this.f96535f = i14;
        this.f96536g = i15;
        this.f96537h = i16;
        this.f96538i = i17;
        this.f96539j = i18;
        this.f96540k = i19;
        this.f96541l = f10;
        this.f96542m = i20;
        this.f96543n = str;
        this.f96544o = kVar;
    }

    public static f0 a(q9.d0 d0Var) {
        return b(d0Var, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static f0 b(q9.d0 d0Var, boolean z10, f.k kVar) throws n9.x {
        boolean z11;
        int i10;
        f.g gVarT;
        int i11;
        try {
            if (z10) {
                d0Var.X(4);
            } else {
                d0Var.X(21);
            }
            int iH = d0Var.H() & 3;
            int iH2 = d0Var.H();
            int iF = d0Var.f();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= iH2) {
                    break;
                }
                d0Var.X(1);
                int iP = d0Var.P();
                for (int i15 = 0; i15 < iP; i15++) {
                    int iP2 = d0Var.P();
                    i14 += iP2 + 4;
                    d0Var.X(iP2);
                }
                i13++;
            }
            d0Var.W(iF);
            byte[] bArr = new byte[i14];
            f.k kVar2 = kVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f10 = 1.0f;
            String strF = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < iH2) {
                int iH3 = d0Var.H() & 63;
                int iP3 = d0Var.P();
                int i28 = i12;
                f.k kVarY = kVar2;
                while (i28 < iP3) {
                    int iP4 = d0Var.P();
                    boolean z12 = z11;
                    byte[] bArr2 = r9.f.f99242a;
                    int i29 = iH;
                    System.arraycopy(bArr2, i12, bArr, i27, bArr2.length);
                    int length = i27 + bArr2.length;
                    System.arraycopy(d0Var.e(), d0Var.f(), bArr, length, iP4);
                    if (iH3 == 32 && i28 == 0) {
                        kVarY = r9.f.y(bArr, length, length + iP4);
                        i10 = iH2;
                    } else {
                        if (iH3 == 33 && i28 == 0) {
                            f.h hVarU = r9.f.u(bArr, length, length + iP4, kVarY);
                            i16 = hVarU.f99276b + 1;
                            i17 = hVarU.f99282h;
                            int i30 = hVarU.f99283i;
                            i19 = hVarU.f99279e + 8;
                            i20 = hVarU.f99280f + 8;
                            int i31 = hVarU.f99286l;
                            i10 = iH2;
                            int i32 = hVarU.f99287m;
                            int i33 = hVarU.f99288n;
                            float f11 = hVarU.f99284j;
                            int i34 = hVarU.f99285k;
                            f.c cVar = hVarU.f99277c;
                            if (cVar != null) {
                                i11 = i34;
                                strF = q9.i.f(cVar.f99251a, cVar.f99252b, cVar.f99253c, cVar.f99254d, cVar.f99255e, cVar.f99256f);
                            } else {
                                i11 = i34;
                            }
                            f10 = f11;
                            i25 = i11;
                            i22 = i32;
                            i23 = i33;
                            i21 = i31;
                            i18 = i30;
                        } else {
                            i10 = iH2;
                            if (iH3 == 39 && i28 == 0 && (gVarT = r9.f.t(bArr, length, length + iP4)) != null && kVarY != null) {
                                i12 = 0;
                                i24 = gVarT.f99269d == ((f.a) kVarY.f99295b.get(0)).f99247b ? 4 : 5;
                            }
                        }
                        i12 = 0;
                    }
                    i27 = length + iP4;
                    d0Var.X(iP4);
                    i28++;
                    z11 = z12;
                    iH = i29;
                    iH2 = i10;
                }
                i26++;
                kVar2 = kVarY;
            }
            return new f0(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iH + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f10, i25, strF, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw n9.x.a(sb2.toString(), e10);
        }
    }

    public static f0 c(q9.d0 d0Var, f.k kVar) {
        return b(d0Var, true, kVar);
    }
}
