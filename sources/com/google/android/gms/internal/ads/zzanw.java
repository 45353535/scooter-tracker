package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzanw {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = DesugarCollections.unmodifiableMap(map2);
    }

    @Nullable
    public static zzanq zza(zzer zzerVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzerVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzerVar, list);
            }
            String strZzN2 = zzerVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzerVar, list);
                }
            }
        }
        return null;
    }

    static zzcw zzb(String str) {
        zzanv zzanvVar = new zzanv();
        zze(str, zzanvVar);
        return zzanvVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.text.SpannedString zzc(@androidx.annotation.Nullable java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zzc(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    @Nullable
    private static zzanq zzd(@Nullable String str, Matcher matcher, zzer zzerVar, List list) {
        zzanv zzanvVar = new zzanv();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzanvVar.zza = zzany.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzanvVar.zzb = zzany.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzanvVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb2.length() > 0) {
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb2.append(strZzN.trim());
                strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            }
            zzanvVar.zzc = zzc(str, sb2.toString(), list);
            return new zzanq(zzanvVar.zza().zzr(), zzanvVar.zza, zzanvVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzee.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zze(java.lang.String r17, com.google.android.gms.internal.ads.zzanv r18) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zze(java.lang.String, com.google.android.gms.internal.ads.zzanv):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzf(@androidx.annotation.Nullable java.lang.String r17, com.google.android.gms.internal.ads.zzant r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zzf(java.lang.String, com.google.android.gms.internal.ads.zzant, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static int zzg(List list, @Nullable String str, zzant zzantVar) {
        List listZzh = zzh(list, str, zzantVar);
        for (int i10 = 0; i10 < listZzh.size(); i10++) {
            zzanp zzanpVar = ((zzanu) listZzh.get(i10)).zzb;
            if (zzanpVar.zzx() != -1) {
                return zzanpVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, @Nullable String str, zzant zzantVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzanp zzanpVar = (zzanp) list.get(i10);
            int iZze = zzanpVar.zze(str, zzantVar.zza, zzantVar.zzd, zzantVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzanu(iZze, zzanpVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
