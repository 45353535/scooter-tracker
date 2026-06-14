package com.mbridge.msdk.tracker.network.toolbox;

import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.X1;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.c0;
import com.mbridge.msdk.tracker.network.q;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static b.a a(q qVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = qVar.f51918c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jB = str != null ? b(str) : 0L;
        String str2 = map.get("Cache-Control");
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
        String str3 = map.get("Expires");
        long jB2 = str3 != null ? b(str3) : j10;
        String str4 = map.get(HttpHeaders.LAST_MODIFIED);
        long jB3 = str4 != null ? b(str4) : j10;
        String str5 = map.get("ETag");
        if (i10 != 0) {
            j14 = jCurrentTimeMillis + (j11 * 1000);
            if (z10) {
                j13 = j14;
            } else {
                Long.signum(j12);
                j13 = j14 + (j12 * 1000);
            }
        } else {
            j13 = (jB <= j10 || jB2 < jB) ? j10 : jCurrentTimeMillis + (jB2 - jB);
            j14 = j13;
        }
        b.a aVar = new b.a();
        aVar.f51853a = qVar.f51917b;
        aVar.f51854b = str5;
        aVar.f51858f = j14;
        aVar.f51857e = j13;
        aVar.f51855c = jB;
        aVar.f51856d = jB3;
        aVar.f51859g = map;
        aVar.f51860h = qVar.f51919d;
        return aVar;
    }

    public static long b(String str) {
        try {
            Date date = a("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e10) {
            if ("0".equals(str) || X1.f42014f.equals(str)) {
                c0.d("Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                c0.a(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    static String a(long j10) {
        return a("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static String a(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                String[] strArrSplit2 = strArrSplit[i10].trim().split(C4240b4.j.f42668b, 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals(D5.M)) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static String a(Map<String, String> map) {
        return a(map, "ISO-8859-1");
    }

    static List<com.mbridge.msdk.tracker.network.g> a(List<com.mbridge.msdk.tracker.network.g> list, b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.mbridge.msdk.tracker.network.g> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.mbridge.msdk.tracker.network.g> list2 = aVar.f51860h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.mbridge.msdk.tracker.network.g gVar : aVar.f51860h) {
                    if (!treeSet.contains(gVar.a())) {
                        arrayList.add(gVar);
                    }
                }
            }
        } else if (!aVar.f51859g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f51859g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static Map<String, String> a(b.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = aVar.f51854b;
        if (str != null) {
            map.put(HttpHeaders.IF_NONE_MATCH, str);
        }
        long j10 = aVar.f51856d;
        if (j10 > 0) {
            map.put(HttpHeaders.IF_MODIFIED_SINCE, a(j10));
        }
        return map;
    }
}
