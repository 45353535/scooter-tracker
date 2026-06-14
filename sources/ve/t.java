package ve;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    private static final boolean c(String str, int i10) {
        int i11 = i10 + 1;
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        return i11 == str.length() || str.charAt(i11) == ';' || str.charAt(i11) == ',';
    }

    public static final List d(String str) {
        return e(str, false);
    }

    public static final List e(String str, boolean z10) {
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        Lazy lazyB = lf.i.b(lf.l.f94211d, new Function0() { // from class: ve.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.f();
            }
        });
        int iG = 0;
        while (iG <= StringsKt.p0(str)) {
            iG = g(str, iG, lazyB, z10);
        }
        return n(lazyB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList f() {
        return new ArrayList();
    }

    private static final int g(String str, int i10, Lazy lazy, boolean z10) {
        Lazy lazyB = lf.i.b(lf.l.f94211d, new Function0() { // from class: ve.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.h();
            }
        });
        Integer numValueOf = z10 ? Integer.valueOf(i10) : null;
        int i11 = i10;
        while (i11 <= StringsKt.p0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',') {
                ((ArrayList) lazy.getValue()).add(new k(m(str, i10, numValueOf != null ? numValueOf.intValue() : i11), n(lazyB)));
                return i11 + 1;
            }
            if (cCharAt != ';') {
                i11 = z10 ? i(str, i11, lazyB) : i11 + 1;
            } else {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i11);
                }
                i11 = i(str, i11 + 1, lazyB);
            }
        }
        ((ArrayList) lazy.getValue()).add(new k(m(str, i10, numValueOf != null ? numValueOf.intValue() : i11), n(lazyB)));
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList h() {
        return new ArrayList();
    }

    private static final int i(String str, int i10, Lazy lazy) {
        int i11 = i10;
        while (i11 <= StringsKt.p0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                j(lazy, str, i10, i11, "");
                return i11;
            }
            if (cCharAt == '=') {
                Pair pairK = k(str, i11 + 1);
                int iIntValue = ((Number) pairK.component1()).intValue();
                j(lazy, str, i10, i11, (String) pairK.component2());
                return iIntValue;
            }
            i11++;
        }
        j(lazy, str, i10, i11, "");
        return i11;
    }

    private static final void j(Lazy lazy, String str, int i10, int i11, String str2) {
        String strM = m(str, i10, i11);
        if (strM.length() == 0) {
            return;
        }
        ((ArrayList) lazy.getValue()).add(new l(strM, str2));
    }

    private static final Pair k(String str, int i10) {
        if (str.length() == i10) {
            return TuplesKt.to(Integer.valueOf(i10), "");
        }
        if (str.charAt(i10) == '\"') {
            return l(str, i10 + 1);
        }
        int i11 = i10;
        while (i11 <= StringsKt.p0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                return TuplesKt.to(Integer.valueOf(i11), m(str, i10, i11));
            }
            i11++;
        }
        return TuplesKt.to(Integer.valueOf(i11), m(str, i10, i11));
    }

    private static final Pair l(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= StringsKt.p0(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' && c(str, i10)) {
                return TuplesKt.to(Integer.valueOf(i10 + 1), sb2.toString());
            }
            if (cCharAt != '\\' || i10 >= StringsKt.p0(str) - 2) {
                sb2.append(cCharAt);
                i10++;
            } else {
                sb2.append(str.charAt(i10 + 1));
                i10 += 2;
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return TuplesKt.to(numValueOf, '\"' + string);
    }

    private static final String m(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt.v1(strSubstring).toString();
    }

    private static final List n(Lazy lazy) {
        return lazy.isInitialized() ? (List) lazy.getValue() : CollectionsKt.emptyList();
    }
}
