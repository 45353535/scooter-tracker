package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.net.HttpHeaders;
import com.ironsource.X1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzasv {
    @Nullable
    public static zzarh zza(zzaru zzaruVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long jZzb;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzaruVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb2 = str != null ? zzb(str) : 0L;
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
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
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
        long jZzb3 = str3 != null ? zzb(str3) : j10;
        String str4 = (String) map.get(HttpHeaders.LAST_MODIFIED);
        if (str4 != null) {
            j13 = jCurrentTimeMillis;
            jZzb = zzb(str4);
        } else {
            j13 = jCurrentTimeMillis;
            jZzb = j10;
        }
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            long j16 = (j12 * 1000) + j13;
            if (z10) {
                j15 = j16;
            } else {
                Long.signum(j11);
                j15 = (j11 * 1000) + j16;
            }
            j14 = j16;
        } else {
            j14 = (jZzb2 <= j10 || jZzb3 < jZzb2) ? j10 : (jZzb3 - jZzb2) + j13;
            j15 = j14;
        }
        zzarh zzarhVar = new zzarh();
        zzarhVar.zza = zzaruVar.zzb;
        zzarhVar.zzb = str5;
        zzarhVar.zzf = j14;
        zzarhVar.zze = j15;
        zzarhVar.zzc = jZzb2;
        zzarhVar.zzd = jZzb;
        zzarhVar.zzg = map;
        zzarhVar.zzh = zzaruVar.zzd;
        return zzarhVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || X1.f42014f.equals(str)) {
                zzask.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzask.zzd(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
