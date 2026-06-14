package ub;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.x;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f105415a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(d0 d0Var) {
        String strS;
        while (true) {
            String strS2 = d0Var.s();
            if (strS2 == null) {
                return null;
            }
            if (f105415a.matcher(strS2).matches()) {
                do {
                    strS = d0Var.s();
                    if (strS != null) {
                    }
                } while (!strS.isEmpty());
            } else {
                Matcher matcher = e.f105389a.matcher(strS2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(d0 d0Var) {
        String strS = d0Var.s();
        return strS != null && strS.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrK1 = o0.k1(str, "\\.");
        long j10 = 0;
        for (String str2 : o0.j1(strArrK1[0], StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrK1.length == 2) {
            String strTrim = strArrK1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void e(d0 d0Var) throws x {
        int iF = d0Var.f();
        if (b(d0Var)) {
            return;
        }
        d0Var.W(iF);
        throw x.a("Expected WEBVTT. Got " + d0Var.s(), null);
    }
}
