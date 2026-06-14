package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Pattern f104248a = Pattern.compile("((\\d{1,2})|(100))%");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Pattern f104249b = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && f104248a.matcher(str).matches();
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && f104249b.matcher(str).matches();
    }

    public static int c(String str) {
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length != 3) {
            return -1;
        }
        try {
            return (Integer.parseInt(strArrSplit[0]) * Constants.ONE_HOUR) + (Integer.parseInt(strArrSplit[1]) * 60000) + ((int) (Float.parseFloat(strArrSplit[2]) * 1000.0f));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int d(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str.replace("%", ""));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
