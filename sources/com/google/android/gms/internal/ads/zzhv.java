package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhv {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static long zzb(@Nullable String str, @Nullable String str2) {
        long j10 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 28);
                sb2.append("Unexpected Content-Length [");
                sb2.append(str);
                sb2.append(C4240b4.j.f42674e);
                zzee.zze("HttpUtil", sb2.toString());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            String strGroup = matcher.group(2);
            if (strGroup == null) {
                throw null;
            }
            long j11 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            if (strGroup2 == null) {
                throw null;
            }
            long j12 = (j11 - Long.parseLong(strGroup2)) + 1;
            if (j10 < 0) {
                return j12;
            }
            if (j10 == j12) {
                return j10;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + 1);
            sb3.append("Inconsistent headers [");
            sb3.append(str);
            sb3.append("] [");
            sb3.append(str2);
            sb3.append(C4240b4.j.f42674e);
            zzee.zzc("HttpUtil", sb3.toString());
            return Math.max(j10, j12);
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb4.append("Unexpected Content-Range [");
            sb4.append(str2);
            sb4.append(C4240b4.j.f42674e);
            zzee.zze("HttpUtil", sb4.toString());
            return j10;
        }
    }
}
