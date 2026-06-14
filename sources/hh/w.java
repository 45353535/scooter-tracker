package hh;

import com.ironsource.D5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f73770e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f73771f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f73772g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f73773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f73774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f73775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f73776d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = w.f73771f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = w.f73772g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt.a0(strGroup4, "'", false, 2, null) && StringsKt.M(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new w(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        public final w b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ w(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(w wVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return wVar.c(charset);
    }

    public static final w f(String str) {
        return f73770e.b(str);
    }

    public final Charset c(Charset charset) {
        String strE = e(D5.M);
        if (strE == null) {
            return charset;
        }
        try {
            return Charset.forName(strE);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int iC = rf.c.c(0, this.f73776d.length - 1, 2);
        if (iC < 0) {
            return null;
        }
        while (!StringsKt.N(this.f73776d[i10], name, true)) {
            if (i10 == iC) {
                return null;
            }
            i10 += 2;
        }
        return this.f73776d[i10 + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && Intrinsics.areEqual(((w) obj).f73773a, this.f73773a);
    }

    public int hashCode() {
        return this.f73773a.hashCode();
    }

    public String toString() {
        return this.f73773a;
    }

    private w(String str, String str2, String str3, String[] strArr) {
        this.f73773a = str;
        this.f73774b = str2;
        this.f73775c = str3;
        this.f73776d = strArr;
    }
}
