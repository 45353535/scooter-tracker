package com.google.android.gms.internal.play_billing;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzhd {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzhb zzhbVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzhbVar, sb2, 0);
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
        zzc(i10, sb2);
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
            String str2 = (String) obj;
            zzev zzevVar = zzev.zza;
            sb2.append(zzhz.zza(str2.isEmpty() ? zzev.zza : new zzet(str2.getBytes(zzga.zza))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb2.append(": \"");
            sb2.append(zzhz.zza((zzev) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzfu) {
            sb2.append(" {");
            zzd((zzfu) obj, sb2, i10 + 2);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            zzc(i10, sb2);
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
        zzc(i10, sb2);
        sb2.append("}");
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzd(com.google.android.gms.internal.play_billing.zzhb r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhd.zzd(com.google.android.gms.internal.play_billing.zzhb, java.lang.StringBuilder, int):void");
    }
}
