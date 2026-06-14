package s9;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f99893a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f99894b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append(TokenBuilder.TOKEN_DELIMITER);
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(String str, String str2) {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                q9.u.c("HttpUtil", "Unexpected Content-Length [" + str + C4240b4.j.f42674e);
                j10 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f99893a.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong((String) q9.a.e(matcher.group(2))) - Long.parseLong((String) q9.a.e(matcher.group(1)))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            q9.u.h("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + C4240b4.j.f42674e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            q9.u.c("HttpUtil", "Unexpected Content-Range [" + str2 + C4240b4.j.f42674e);
            return j10;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f99894b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) q9.a.e(matcher.group(1)));
        }
        return -1L;
    }
}
