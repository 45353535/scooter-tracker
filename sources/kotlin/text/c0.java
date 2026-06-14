package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static final byte a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        lf.r rVarB = b(str);
        if (rVarB != null) {
            return rVarB.g();
        }
        StringsKt__StringNumberConversionsKt.v(str);
        throw new lf.g();
    }

    public static final lf.r b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return c(str, 10);
    }

    public static final lf.r c(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        lf.t tVarF = f(str, i10);
        if (tVarF == null) {
            return null;
        }
        int iG = tVarF.g();
        if (Integer.compare(iG ^ Integer.MIN_VALUE, lf.t.c(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return lf.r.a(lf.r.c((byte) iG));
    }

    public static final int d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        lf.t tVarE = e(str);
        if (tVarE != null) {
            return tVarE.g();
        }
        StringsKt__StringNumberConversionsKt.v(str);
        throw new lf.g();
    }

    public static final lf.t e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f(str, 10);
    }

    public static final lf.t f(String str, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iC = lf.t.c(i10);
        int iA = 119304647;
        while (i11 < length) {
            int iA2 = CharsKt__CharJVMKt.a(str.charAt(i11), i10);
            if (iA2 < 0) {
                return null;
            }
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = b0.a(-1, iC);
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iC2 = lf.t.c(i12 * iC);
            int iC3 = lf.t.c(lf.t.c(iA2) + iC2);
            if (Integer.compare(iC3 ^ Integer.MIN_VALUE, iC2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = iC3;
        }
        return lf.t.a(i12);
    }

    public static final long g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        lf.v vVarH = h(str);
        if (vVarH != null) {
            return vVarH.g();
        }
        StringsKt__StringNumberConversionsKt.v(str);
        throw new lf.g();
    }

    public static final lf.v h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return i(str, 10);
    }

    public static final lf.v i(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jC = lf.v.c(i10);
        long j10 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iA = CharsKt__CharJVMKt.a(str.charAt(i11), i10);
            if (iA < 0) {
                return null;
            }
            if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = a0.a(-1L, jC);
                    if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jC2 = lf.v.c(j10 * jC);
            long jC3 = lf.v.c(lf.v.c(((long) lf.t.c(iA)) & 4294967295L) + jC2);
            if (Long.compare(jC3 ^ Long.MIN_VALUE, jC2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j10 = jC3;
        }
        return lf.v.a(j10);
    }

    public static final short j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        lf.y yVarK = k(str);
        if (yVarK != null) {
            return yVarK.g();
        }
        StringsKt__StringNumberConversionsKt.v(str);
        throw new lf.g();
    }

    public static final lf.y k(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, 10);
    }

    public static final lf.y l(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        lf.t tVarF = f(str, i10);
        if (tVarF == null) {
            return null;
        }
        int iG = tVarF.g();
        if (Integer.compare(iG ^ Integer.MIN_VALUE, lf.t.c(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return lf.y.a(lf.y.c((short) iG));
    }
}
