package yads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class le3 {
    public static final Long a(String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
                boolean z10 = lb1.f113032a;
            }
        }
        return null;
    }

    public static final Integer b(String str) {
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                boolean z10 = lb1.f113032a;
            }
        }
        return null;
    }
}
