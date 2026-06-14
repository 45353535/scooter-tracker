package hh;

import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f73708j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f73709k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f73710l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f73711m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f73712n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f73713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f73714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f73716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f73717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f73718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f73719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f73720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f73721i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.M(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !ih.d.i(str);
        }

        private final String f(String str) {
            if (StringsKt.M(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = ih.a.e(StringsKt.P0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = m.f73712n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iV0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(m.f73712n).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f73711m).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iV0 == -1 && matcher.usePattern(m.f73710l).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f73710l.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iV0 = StringsKt.v0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f73709k).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iV0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(ih.d.f74841f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iV0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").g(str)) {
                    return StringsKt.a0(str, TokenBuilder.TOKEN_DELIMITER, false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(u url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long j10, u url, String setCookie) {
            long j11;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iR = ih.d.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = ih.d.r(setCookie, D5.T, 0, iR, 2, null);
            m mVar = null;
            if (iR2 == iR) {
                return null;
            }
            String strY = ih.d.Y(setCookie, 0, iR2, 1, null);
            if (strY.length() == 0 || ih.d.y(strY) != -1) {
                return null;
            }
            String strX = ih.d.X(setCookie, iR2 + 1, iR);
            if (ih.d.y(strX) != -1) {
                return null;
            }
            int i10 = iR + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = DatesKt.MAX_DATE;
            while (i10 < length) {
                int iP = ih.d.p(setCookie, ';', i10, length);
                int iP2 = ih.d.p(setCookie, D5.T, i10, iP);
                String strX2 = ih.d.X(setCookie, i10, iP2);
                String strX3 = iP2 < iP ? ih.d.X(setCookie, iP2 + 1, iP) : "";
                m mVar2 = mVar;
                if (StringsKt.N(strX2, "expires", true)) {
                    try {
                        jG = g(strX3, 0, strX3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.N(strX2, "max-age", true)) {
                    jH = h(strX3);
                    z11 = true;
                } else if (StringsKt.N(strX2, C4240b4.j.D, true)) {
                    strF = f(strX3);
                    z13 = false;
                } else if (StringsKt.N(strX2, "path", true)) {
                    str = strX3;
                } else if (StringsKt.N(strX2, "secure", true)) {
                    z12 = true;
                } else if (StringsKt.N(strX2, "httponly", true)) {
                    z10 = true;
                }
                i10 = iP + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > DatesKt.MAX_DATE) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strH = url.h();
            if (strF == null) {
                strF = strH;
            } else if (!b(strH, strF)) {
                return mVar3;
            }
            if (strH.length() != strF.length() && PublicSuffixDatabase.INSTANCE.c().c(strF) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !StringsKt.a0(str, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iB0 = StringsKt.B0(strD, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null);
                if (iB0 != 0) {
                    strSubstring = strD.substring(0, iB0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strY, strX, j11, strF, str, z12, z10, z11, z13, null);
        }

        public final List e(u url, t headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listJ = headers.j(HttpHeaders.SET_COOKIE);
            int size = listJ.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m mVarC = c(url, (String) listJ.get(i10));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        private a() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f73713a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(mVar.f73713a, this.f73713a) && Intrinsics.areEqual(mVar.f73714b, this.f73714b) && mVar.f73715c == this.f73715c && Intrinsics.areEqual(mVar.f73716d, this.f73716d) && Intrinsics.areEqual(mVar.f73717e, this.f73717e) && mVar.f73718f == this.f73718f && mVar.f73719g == this.f73719g && mVar.f73720h == this.f73720h && mVar.f73721i == this.f73721i;
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f73713a);
        sb2.append(D5.T);
        sb2.append(this.f73714b);
        if (this.f73720h) {
            if (this.f73715c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(nh.c.b(new Date(this.f73715c)));
            }
        }
        if (!this.f73721i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f73716d);
        }
        sb2.append("; path=");
        sb2.append(this.f73717e);
        if (this.f73718f) {
            sb2.append("; secure");
        }
        if (this.f73719g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final String g() {
        return this.f73714b;
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f73713a.hashCode()) * 31) + this.f73714b.hashCode()) * 31) + androidx.collection.b.a(this.f73715c)) * 31) + this.f73716d.hashCode()) * 31) + this.f73717e.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f73718f)) * 31) + androidx.compose.foundation.c.a(this.f73719g)) * 31) + androidx.compose.foundation.c.a(this.f73720h)) * 31) + androidx.compose.foundation.c.a(this.f73721i);
    }

    public String toString() {
        return f(false);
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f73713a = str;
        this.f73714b = str2;
        this.f73715c = j10;
        this.f73716d = str3;
        this.f73717e = str4;
        this.f73718f = z10;
        this.f73719g = z11;
        this.f73720h = z12;
        this.f73721i = z13;
    }
}
