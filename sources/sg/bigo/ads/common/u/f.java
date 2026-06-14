package sg.bigo.ads.common.u;

import androidx.annotation.Nullable;
import com.ironsource.D5;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f102766a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f102767b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f102768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f102769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f102770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f102771f;

    private f(String str, String str2, String str3, @Nullable String str4) {
        this.f102768c = str;
        this.f102769d = str2;
        this.f102770e = str3;
        this.f102771f = str4;
    }

    @Nullable
    public static f a(String str) {
        Matcher matcher = f102766a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f102767b.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(D5.M)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = strGroup3;
            }
        }
        return new f(str, lowerCase, lowerCase2, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof f) && ((f) obj).f102768c.equals(this.f102768c);
    }

    public final int hashCode() {
        return this.f102768c.hashCode();
    }

    public final String toString() {
        return this.f102768c;
    }
}
