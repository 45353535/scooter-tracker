package ve;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f106708a = CollectionsKt.listOf("");

    private static final int b(String str, int i10, int i11, char c10) {
        int i12 = 0;
        while (true) {
            int i13 = i10 + i12;
            if (i13 >= i11 || str.charAt(i13) != c10) {
                break;
            }
            i12++;
        }
        return i12;
    }

    private static final void c(m0 m0Var, String str, int i10, int i11) {
        int i12;
        Integer numValueOf = Integer.valueOf(f(str, i10, i11));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i11;
        String strSubstring = str.substring(i10, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        m0Var.x(strSubstring);
        int i13 = iIntValue + 1;
        if (i13 < i11) {
            String strSubstring2 = str.substring(i13, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            i12 = Integer.parseInt(strSubstring2);
        } else {
            i12 = 0;
        }
        m0Var.y(i12);
    }

    private static final int d(String str, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt = str.charAt(i10);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i12 = i10;
            i13 = i12;
        } else {
            i12 = i10;
            i13 = -1;
        }
        while (i12 < i11) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 == ':') {
                if (i13 == -1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i13);
            }
            if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                break;
            }
            if (i13 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                i13 = i12;
            }
            i12++;
        }
        return -1;
    }

    public static final List e() {
        return f106708a;
    }

    private static final int f(String str, int i10, int i11) {
        boolean z10 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z10 = true;
                } else if (cCharAt == ']') {
                    z10 = false;
                }
            } else if (!z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static final void g(m0 m0Var, String str, int i10, int i11, int i12) {
        if (i12 == 1) {
            m0Var.x("");
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            o0.j(m0Var, strSubstring);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            m0Var.x("");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            String strSubstring2 = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            o0.j(m0Var, sb2.toString());
            return;
        }
        int iU0 = StringsKt.u0(str, IOUtils.DIR_SEPARATOR_UNIX, i10, false, 4, null);
        if (iU0 == -1 || iU0 == i11) {
            String strSubstring3 = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            m0Var.x(strSubstring3);
        } else {
            String strSubstring4 = str.substring(i10, iU0);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            m0Var.x(strSubstring4);
            String strSubstring5 = str.substring(iU0, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
            o0.j(m0Var, strSubstring5);
        }
    }

    private static final void h(m0 m0Var, String str, int i10, int i11) {
        if (i10 >= i11 || str.charAt(i10) != '#') {
            return;
        }
        String strSubstring = str.substring(i10 + 1, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        m0Var.s(strSubstring);
    }

    private static final void i(m0 m0Var, String str, int i10, int i11) {
        int iV0 = StringsKt.v0(str, "@", i10, false, 4, null);
        if (iV0 == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String strSubstring = str.substring(i10, iV0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        m0Var.C(f.i(strSubstring, 0, 0, null, 7, null));
        String strSubstring2 = str.substring(iV0 + 1, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        m0Var.x(strSubstring2);
    }

    private static final int j(final m0 m0Var, String str, int i10, int i11) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            m0Var.B(true);
            return i11;
        }
        Integer numValueOf = Integer.valueOf(StringsKt.u0(str, '#', i12, false, 4, null));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i11 = numValueOf.intValue();
        }
        String strSubstring = str.substring(i12, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        l0.d(strSubstring, 0, 0, false, 6, null).c(new Function2() { // from class: ve.r0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s0.k(m0Var, (String) obj, (List) obj2);
            }
        });
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(m0 m0Var, String key, List values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        m0Var.e().c(key, values);
        return Unit.f93236a;
    }

    public static final m0 l(m0 m0Var, String urlString) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (StringsKt.y0(urlString)) {
            return m0Var;
        }
        try {
            return m(m0Var, urlString);
        } catch (Throwable th2) {
            throw new q0(urlString, th2);
        }
    }

    public static final m0 m(m0 m0Var, String urlString) {
        int i10;
        int iIntValue;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        int length = urlString.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!CharsKt.b(urlString.charAt(i11))) {
                break;
            }
            i11++;
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                if (!CharsKt.b(urlString.charAt(length2))) {
                    i10 = length2;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length2 = i12;
            }
            i10 = -1;
        } else {
            i10 = -1;
        }
        int i13 = i10 + 1;
        int iD = d(urlString, i11, i13);
        if (iD > 0) {
            String strSubstring = urlString.substring(i11, i11 + iD);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            m0Var.z(t0.f106709d.a(strSubstring));
            i11 += iD + 1;
        }
        if (Intrinsics.areEqual(m0Var.o().i(), "data")) {
            String strSubstring2 = urlString.substring(i11, i13);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            m0Var.x(strSubstring2);
            return m0Var;
        }
        int iB = b(urlString, i11, i13, IOUtils.DIR_SEPARATOR_UNIX);
        int iJ = i11 + iB;
        if (Intrinsics.areEqual(m0Var.o().i(), C4240b4.i.f42616b)) {
            g(m0Var, urlString, iJ, i13, iB);
            return m0Var;
        }
        if (Intrinsics.areEqual(m0Var.o().i(), "mailto")) {
            if (iB != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            i(m0Var, urlString, iJ, i13);
            return m0Var;
        }
        if (Intrinsics.areEqual(m0Var.o().i(), "about")) {
            if (iB != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring3 = urlString.substring(iJ, i13);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            m0Var.x(strSubstring3);
            return m0Var;
        }
        if (Intrinsics.areEqual(m0Var.o().i(), MRAIDNativeFeature.TEL)) {
            if (iB != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring4 = urlString.substring(iJ, i13);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            m0Var.x(strSubstring4);
            return m0Var;
        }
        if (iB >= 2) {
            while (true) {
                Integer numValueOf = Integer.valueOf(StringsKt.x0(urlString, ze.l.b("@/\\?#"), iJ, false, 4, null));
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i13;
                if (iIntValue >= i13 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iF = f(urlString, iJ, iIntValue);
                if (iF != -1) {
                    String strSubstring5 = urlString.substring(iJ, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    m0Var.w(strSubstring5);
                    String strSubstring6 = urlString.substring(iF + 1, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                    m0Var.u(strSubstring6);
                } else {
                    String strSubstring7 = urlString.substring(iJ, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                    m0Var.w(strSubstring7);
                }
                iJ = iIntValue + 1;
            }
            c(m0Var, urlString, iJ, iIntValue);
            iJ = iIntValue;
        }
        if (iJ >= i13) {
            m0Var.v(urlString.charAt(i10) == '/' ? f106708a : CollectionsKt.emptyList());
            return m0Var;
        }
        m0Var.v(iB == 0 ? CollectionsKt.dropLast(m0Var.g(), 1) : CollectionsKt.emptyList());
        Integer numValueOf2 = Integer.valueOf(StringsKt.x0(urlString, ze.l.b("?#"), iJ, false, 4, null));
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : i13;
        if (iIntValue2 > iJ) {
            String strSubstring8 = urlString.substring(iJ, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring8, "substring(...)");
            m0Var.v(CollectionsKt.plus((Collection) ((m0Var.g().size() == 1 && ((CharSequence) CollectionsKt.first(m0Var.g())).length() == 0) ? CollectionsKt.emptyList() : m0Var.g()), (Iterable) CollectionsKt.plus((Collection) (iB == 1 ? f106708a : CollectionsKt.emptyList()), (Iterable) (Intrinsics.areEqual(strSubstring8, "/") ? f106708a : StringsKt.X0(strSubstring8, new char[]{IOUtils.DIR_SEPARATOR_UNIX}, false, 0, 6, null)))));
            iJ = iIntValue2;
        }
        if (iJ < i13 && urlString.charAt(iJ) == '?') {
            iJ = j(m0Var, urlString, iJ, i13);
        }
        h(m0Var, urlString, iJ, i13);
        return m0Var;
    }
}
