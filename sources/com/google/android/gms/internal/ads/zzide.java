package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzide {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzidc zzidcVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzc(zzidcVar, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzd(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzied.zza(zzian.zzv((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzian) {
            sb2.append(": \"");
            sb2.append(zzied.zza((zzian) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzibr) {
            sb2.append(" {");
            zzc((zzibr) obj, sb2, i10 + 2);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            zzd(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i12, C4240b4.i.W, entry.getKey());
        zzb(sb2, i12, "value", entry.getValue());
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        zzd(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(com.google.android.gms.internal.ads.zzidc r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzide.zzc(com.google.android.gms.internal.ads.zzidc, java.lang.StringBuilder, int):void");
    }

    private static void zzd(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }
}
