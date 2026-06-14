package yads;

import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.X1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g01 {
    public static cr a(r62 r62Var) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = r62Var.f115342c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(StringUtils.COMMA, 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : j10;
        String str4 = (String) map.get(HttpHeaders.LAST_MODIFIED);
        long jA3 = str4 != null ? a(str4) : j10;
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            j14 = (j11 * 1000) + jCurrentTimeMillis;
            if (z10) {
                j13 = j14;
            } else {
                Long.signum(j12);
                j13 = (j12 * 1000) + j14;
            }
        } else {
            j13 = (jA <= j10 || jA2 < jA) ? j10 : (jA2 - jA) + jCurrentTimeMillis;
            j14 = j13;
        }
        cr crVar = new cr();
        crVar.f109523a = r62Var.f115341b;
        crVar.f109524b = str5;
        crVar.f109528f = j14;
        crVar.f109527e = j13;
        crVar.f109525c = jA;
        crVar.f109526d = jA3;
        crVar.f109529g = map;
        crVar.f109530h = r62Var.f115343d;
        return crVar;
    }

    public static String a(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] strArrSplit = str.split(";", 0);
        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(C4240b4.j.f42668b, 0);
            if (strArrSplit2.length == 2 && strArrSplit2[0].equals(D5.M)) {
                return strArrSplit2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !X1.f42014f.equals(str)) {
                boolean z10 = rj3.f115467a;
                boolean z11 = lb1.f113032a;
                return 0L;
            }
            boolean z12 = rj3.f115467a;
            boolean z13 = lb1.f113032a;
            return 0L;
        }
    }
}
