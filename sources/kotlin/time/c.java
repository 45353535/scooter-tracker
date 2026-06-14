package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return b.j((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return b.j((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(kotlin.ranges.g.p(j10, -4611686018427387903L, 4611686018427387903L)) : l(n(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return b.j(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(o(j10)) : l(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        boolean z11;
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.a aVar = b.f93560c;
        long jC = aVar.c();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && StringsKt.b1(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        String str2 = "null cannot be cast to non-null type java.lang.String";
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            cg.b bVar = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i13);
                        if (c11 > cCharAt4 || cCharAt4 >= c10) {
                            i11 = length;
                            if (!StringsKt.f0("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = ':';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    cg.b bVarD = e.d(cCharAt5, z14);
                    if (bVar != null && bVar.compareTo(bVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iU0 = StringsKt.u0(strSubstring, '.', 0, false, 6, null);
                    if (bVarD != cg.b.f6839f || iU0 <= 0) {
                        jC = b.G(jC, t(q(strSubstring), bVarD));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iU0);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jG = b.G(jC, t(q(strSubstring2), bVarD));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iU0);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jC = b.G(jG, r(Double.parseDouble(strSubstring3), bVarD));
                    }
                    bVar = bVarD;
                    length = i11;
                    c11 = '0';
                    c10 = ':';
                } else {
                    if (z14 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            int iMax = Math.max(length - length2, 8);
            char c12 = '0';
            if (StringsKt.Q(str, length2, "Infinity", 0, iMax, true)) {
                jC = aVar.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && StringsKt.E1(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z11 = true;
                } else {
                    z11 = z15;
                    i10 = length;
                }
                boolean z16 = false;
                cg.b bVar2 = null;
                while (length2 < i10) {
                    if (z16 && z11) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    Intrinsics.checkNotNull(str, str2);
                    String strSubstring4 = str.substring(length2, i15);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    Intrinsics.checkNotNull(str, str2);
                    String strSubstring5 = str.substring(length4, i16);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    cg.b bVarE = e.e(strSubstring5);
                    if (bVar2 != null && bVar2.compareTo(bVarE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iU02 = StringsKt.u0(strSubstring4, '.', 0, false, 6, null);
                    if (iU02 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, str2);
                        String strSubstring6 = strSubstring4.substring(0, iU02);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        String str3 = str2;
                        long jG2 = b.G(jC, t(Long.parseLong(strSubstring6), bVarE));
                        Intrinsics.checkNotNull(strSubstring4, str3);
                        String strSubstring7 = strSubstring4.substring(iU02);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        boolean z17 = z11;
                        jC = b.G(jG2, r(Double.parseDouble(strSubstring7), bVarE));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                        z11 = z17;
                        bVar2 = bVarE;
                        str2 = str3;
                    } else {
                        jC = b.G(jC, t(Long.parseLong(strSubstring4), bVarE));
                        z11 = z11;
                        bVar2 = bVarE;
                    }
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? b.M(jC) : jC;
    }

    private static final long q(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !StringsKt.f0("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!StringsKt.a0(str, "+", false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(StringsKt.A1(str, 1));
    }

    public static final long r(double d10, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = d.a(d10, unit, cg.b.f6836c);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jE = zf.a.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? k(zf.a.e(d.a(d10, unit, cg.b.f6838e))) : l(jE);
    }

    public static final long s(int i10, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(cg.b.f6839f) <= 0 ? l(d.c(i10, unit, cg.b.f6836c)) : t(i10, unit);
    }

    public static final long t(long j10, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        cg.b bVar = cg.b.f6836c;
        long jC = d.c(4611686018426999999L, bVar, unit);
        return ((-jC) > j10 || j10 > jC) ? j(kotlin.ranges.g.p(d.b(j10, unit, cg.b.f6838e), -4611686018427387903L, 4611686018427387903L)) : l(d.c(j10, unit, bVar));
    }
}
