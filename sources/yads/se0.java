package yads;

import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class se0 implements x63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115771b;

    public se0() {
        this(y31.g());
    }

    public final z63 a(int i10, w63 w63Var) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new va2(new zt1(w63Var.f117325a));
            }
            if (i10 == 21) {
                return new va2(new i11());
            }
            if (i10 == 27) {
                if (a(4)) {
                    return null;
                }
                return new va2(new wy0(new av2(a(w63Var)), a(1), a(8)));
            }
            if (i10 == 36) {
                return new va2(new yy0(new av2(a(w63Var))));
            }
            if (i10 == 89) {
                return new va2(new lk0(w63Var.f117326b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new va2(new j0(w63Var.f117325a));
                }
                if (i10 == 257) {
                    return new ku2(new ha2("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new ku2(new ha2("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i10) {
                                case 130:
                                    if (!a(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new va2(new g0(w63Var.f117325a));
            }
            return new va2(new sj0(w63Var.f117325a));
        }
        return new va2(new qy0(new u83(a(w63Var))));
    }

    public se0(nk2 nk2Var) {
        this.f115770a = 0;
        this.f115771b = nk2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final List a(w63 w63Var) {
        String str;
        int i10;
        List listSingletonList;
        if (a(32)) {
            return this.f115771b;
        }
        w92 w92Var = new w92(w63Var.f117327c);
        ArrayList arrayList = this.f115771b;
        while (w92Var.f117358c - w92Var.f117357b > 0) {
            int iM = w92Var.m();
            int iM2 = w92Var.f117357b + w92Var.m();
            if (iM == 134) {
                arrayList = new ArrayList();
                int iM3 = w92Var.m() & 31;
                for (int i11 = 0; i11 < iM3; i11++) {
                    String strA = w92Var.a(3, st.f115925c);
                    int iM4 = w92Var.m();
                    boolean z10 = (iM4 & 128) != 0;
                    if (z10) {
                        i10 = iM4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bM = (byte) w92Var.m();
                    w92Var.e(w92Var.f117357b + 1);
                    if (z10) {
                        listSingletonList = Collections.singletonList((bM & SignedBytes.MAX_POWER_OF_TWO) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    xv0 xv0Var = new xv0();
                    xv0Var.f117982k = str;
                    xv0Var.f117974c = strA;
                    xv0Var.C = i10;
                    xv0Var.f117984m = listSingletonList;
                    arrayList.add(new yv0(xv0Var));
                }
            }
            w92Var.e(iM2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean a(int i10) {
        return (i10 & this.f115770a) != 0;
    }
}
