package ib;

import androidx.media3.common.MimeTypes;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.a;
import n9.v;
import oa.e0;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
abstract class j {
    public static r9.a a(n9.v vVar, String str) {
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            v.a aVarD = vVar.d(i10);
            if (aVarD instanceof r9.a) {
                r9.a aVar = (r9.a) aVarD;
                if (aVar.f99227a.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    private static cb.e b(int i10, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385) {
            d0Var.X(8);
            String strC = d0Var.C(iQ - 16);
            return new cb.e("und", strC, strC);
        }
        q9.u.h("MetadataUtil", "Failed to parse comment attribute: " + r9.c.a(i10));
        return null;
    }

    private static cb.a c(d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() != 1684108385) {
            q9.u.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iO = b.o(d0Var.q());
        String str = iO == 13 ? "image/jpeg" : iO == 14 ? MimeTypes.IMAGE_PNG : null;
        if (str == null) {
            q9.u.h("MetadataUtil", "Unrecognized cover art flags: " + iO);
            return null;
        }
        d0Var.X(4);
        int i10 = iQ - 16;
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        return new cb.a(str, null, 3, bArr);
    }

    public static v.a d(d0 d0Var) {
        int iF = d0Var.f() + d0Var.q();
        int iQ = d0Var.q();
        int i10 = (iQ >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iQ;
                if (i11 == 6516084) {
                    return b(iQ, d0Var);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return k(iQ, "TIT2", d0Var);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return k(iQ, "TCOM", d0Var);
                }
                if (i11 == 6578553) {
                    return k(iQ, "TDRC", d0Var);
                }
                if (i11 == 4280916) {
                    return k(iQ, "TPE1", d0Var);
                }
                if (i11 == 7630703) {
                    return k(iQ, "TSSE", d0Var);
                }
                if (i11 == 6384738) {
                    return k(iQ, "TALB", d0Var);
                }
                if (i11 == 7108978) {
                    return k(iQ, "USLT", d0Var);
                }
                if (i11 == 6776174) {
                    return k(iQ, "TCON", d0Var);
                }
                if (i11 == 6779504) {
                    return k(iQ, "TIT1", d0Var);
                }
            } else {
                if (iQ == 1735291493) {
                    return j(d0Var);
                }
                if (iQ == 1684632427) {
                    return e(iQ, "TPOS", d0Var);
                }
                if (iQ == 1953655662) {
                    return e(iQ, "TRCK", d0Var);
                }
                if (iQ == 1953329263) {
                    return g(iQ, "TBPM", d0Var, true, false);
                }
                if (iQ == 1668311404) {
                    return g(iQ, "TCMP", d0Var, true, true);
                }
                if (iQ == 1668249202) {
                    return c(d0Var);
                }
                if (iQ == 1631670868) {
                    return k(iQ, "TPE2", d0Var);
                }
                if (iQ == 1936682605) {
                    return k(iQ, "TSOT", d0Var);
                }
                if (iQ == 1936679276) {
                    return k(iQ, "TSOA", d0Var);
                }
                if (iQ == 1936679282) {
                    return k(iQ, "TSOP", d0Var);
                }
                if (iQ == 1936679265) {
                    return k(iQ, "TSO2", d0Var);
                }
                if (iQ == 1936679791) {
                    return k(iQ, "TSOC", d0Var);
                }
                if (iQ == 1920233063) {
                    return g(iQ, "ITUNESADVISORY", d0Var, false, false);
                }
                if (iQ == 1885823344) {
                    return g(iQ, "ITUNESGAPLESS", d0Var, false, true);
                }
                if (iQ == 1936683886) {
                    return k(iQ, "TVSHOWSORT", d0Var);
                }
                if (iQ == 1953919848) {
                    return k(iQ, "TVSHOW", d0Var);
                }
                if (iQ == 757935405) {
                    return h(d0Var, iF);
                }
            }
            q9.u.b("MetadataUtil", "Skipped unknown metadata entry: " + r9.c.a(iQ));
            d0Var.W(iF);
            return null;
        } finally {
            d0Var.W(iF);
        }
    }

    private static cb.n e(int i10, String str, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385 && iQ >= 22) {
            d0Var.X(10);
            int iP = d0Var.P();
            if (iP > 0) {
                String str2 = "" + iP;
                int iP2 = d0Var.P();
                if (iP2 > 0) {
                    str2 = str2 + "/" + iP2;
                }
                return new cb.n(str, null, ImmutableList.of(str2));
            }
        }
        q9.u.h("MetadataUtil", "Failed to parse index/count attribute: " + r9.c.a(i10));
        return null;
    }

    private static int f(d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385) {
            d0Var.X(8);
            int i10 = iQ - 16;
            if (i10 == 1) {
                return d0Var.H();
            }
            if (i10 == 2) {
                return d0Var.P();
            }
            if (i10 == 3) {
                return d0Var.K();
            }
            if (i10 == 4 && (d0Var.j() & 128) == 0) {
                return d0Var.L();
            }
        }
        q9.u.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static cb.i g(int i10, String str, d0 d0Var, boolean z10, boolean z11) {
        int iF = f(d0Var);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new cb.n(str, null, ImmutableList.of(Integer.toString(iF))) : new cb.e("und", str, Integer.toString(iF));
        }
        q9.u.h("MetadataUtil", "Failed to parse uint8 attribute: " + r9.c.a(i10));
        return null;
    }

    private static cb.i h(d0 d0Var, int i10) {
        String strC = null;
        String strC2 = null;
        int i11 = -1;
        int i12 = -1;
        while (d0Var.f() < i10) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            d0Var.X(4);
            if (iQ2 == 1835360622) {
                strC = d0Var.C(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strC2 = d0Var.C(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i11 = iF;
                    i12 = iQ;
                }
                d0Var.X(iQ - 12);
            }
        }
        if (strC == null || strC2 == null || i11 == -1) {
            return null;
        }
        d0Var.W(i11);
        d0Var.X(16);
        return new cb.k(strC, strC2, d0Var.C(i12 - 16));
    }

    public static r9.a i(d0 d0Var, int i10, String str) {
        while (true) {
            int iF = d0Var.f();
            if (iF >= i10) {
                return null;
            }
            int iQ = d0Var.q();
            if (d0Var.q() == 1684108385) {
                int iQ2 = d0Var.q();
                int iQ3 = d0Var.q();
                int i11 = iQ - 16;
                byte[] bArr = new byte[i11];
                d0Var.l(bArr, 0, i11);
                return new r9.a(str, bArr, iQ3, iQ2);
            }
            d0Var.W(iF + iQ);
        }
    }

    private static cb.n j(d0 d0Var) {
        String strA = cb.j.a(f(d0Var) - 1);
        if (strA != null) {
            return new cb.n("TCON", null, ImmutableList.of(strA));
        }
        q9.u.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static cb.n k(int i10, String str, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385) {
            d0Var.X(8);
            return new cb.n(str, null, ImmutableList.of(d0Var.C(iQ - 16)));
        }
        q9.u.h("MetadataUtil", "Failed to parse text attribute: " + r9.c.a(i10));
        return null;
    }

    public static void l(int i10, e0 e0Var, a.b bVar) {
        if (i10 == 1 && e0Var.a()) {
            bVar.Z(e0Var.f96528a).a0(e0Var.f96529b);
        }
    }

    public static void m(int i10, n9.v vVar, a.b bVar, n9.v vVar2, n9.v... vVarArr) {
        if (vVar2 == null) {
            vVar2 = new n9.v(new v.a[0]);
        }
        if (vVar != null) {
            for (int i11 = 0; i11 < vVar.e(); i11++) {
                v.a aVarD = vVar.d(i11);
                if (aVarD instanceof r9.a) {
                    r9.a aVar = (r9.a) aVarD;
                    if (!aVar.f99227a.equals("com.android.capture.fps")) {
                        vVar2 = vVar2.a(aVar);
                    } else if (i10 == 2) {
                        vVar2 = vVar2.a(aVar);
                    }
                }
            }
        }
        for (n9.v vVar3 : vVarArr) {
            vVar2 = vVar2.b(vVar3);
        }
        if (vVar2.e() > 0) {
            bVar.n0(vVar2);
        }
    }
}
