package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f118290a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) {
        int i10 = w83.f117341a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    public static void a(w92 w92Var) throws ba2 {
        int i10 = w92Var.f117357b;
        String strC = w92Var.c();
        if (strC == null || !strC.startsWith("WEBVTT")) {
            w92Var.e(i10);
            throw new ba2("Expected WEBVTT. Got " + w92Var.c(), null, true, 1);
        }
    }
}
