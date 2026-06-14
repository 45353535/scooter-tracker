package ve;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import ve.g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {
    private static final void a(h0 h0Var, String str, int i10, int i11, int i12, boolean z10) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i11 == -1) {
            int iF = f(i10, i12, str);
            int iE = e(iF, i12, str);
            if (iE > iF) {
                if (z10) {
                    strSubstring3 = f.k(str, iF, iE, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iF, iE);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                }
                h0Var.c(strSubstring3, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        int iF2 = f(i10, i11, str);
        int iE2 = e(iF2, i11, str);
        if (iE2 > iF2) {
            if (z10) {
                strSubstring = f.k(str, iF2, iE2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iF2, iE2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            int iF3 = f(i11 + 1, i12, str);
            int iE3 = e(iF3, i12, str);
            if (z10) {
                strSubstring2 = f.k(str, iF3, iE3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iF3, iE3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            }
            h0Var.e(strSubstring, strSubstring2);
        }
    }

    private static final void b(h0 h0Var, String str, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int iP0 = StringsKt.p0(str);
        int i14 = 0;
        if (i10 <= iP0) {
            int i15 = -1;
            int i16 = i10;
            int i17 = i16;
            while (i14 != i11) {
                char cCharAt = str.charAt(i17);
                if (cCharAt == '&') {
                    a(h0Var, str, i16, i15, i17, z10);
                    i14++;
                    i15 = -1;
                    i16 = i17 + 1;
                } else if (cCharAt == '=' && i15 == -1) {
                    i15 = i17;
                }
                if (i17 != iP0) {
                    i17++;
                } else {
                    i13 = i16;
                    i12 = i15;
                }
            }
            return;
        }
        i12 = -1;
        i13 = i10;
        if (i14 == i11) {
            return;
        }
        a(h0Var, str, i13, i12, str.length(), z10);
    }

    public static final g0 c(String query, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (i10 > StringsKt.p0(query)) {
            return g0.f106672b.a();
        }
        g0.a aVar = g0.f106672b;
        h0 h0VarB = k0.b(0, 1, null);
        b(h0VarB, query, i10, i11, z10);
        return h0VarB.build();
    }

    public static /* synthetic */ g0 d(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return c(str, i10, i11, z10);
    }

    private static final int e(int i10, int i11, CharSequence charSequence) {
        while (i11 > i10 && CharsKt.b(charSequence.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    private static final int f(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11 && CharsKt.b(charSequence.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
