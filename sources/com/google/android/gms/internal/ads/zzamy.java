package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
final class zzamy {
    public final String zza;
    public final int zzb;

    @Nullable
    @ColorInt
    public final Integer zzc;

    @Nullable
    @ColorInt
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamy(String str, int i10, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    @Nullable
    public static zzamy zza(String str, zzamw zzamwVar) {
        zzamy zzamyVar;
        String strTrim;
        int iZzd;
        Integer numZzb;
        Integer numZzb2;
        int i10;
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        zzgrc.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = strArrSplit.length;
        int i12 = zzamwVar.zzk;
        if (length != i12) {
            Object[] objArr = {Integer.valueOf(i12), Integer.valueOf(length), str};
            String str2 = zzfj.zza;
            zzee.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            strTrim = strArrSplit[zzamwVar.zza].trim();
            int i13 = zzamwVar.zzb;
            iZzd = i13 != -1 ? zzd(strArrSplit[i13].trim()) : -1;
            int i14 = zzamwVar.zzc;
            numZzb = i14 != -1 ? zzb(strArrSplit[i14].trim()) : null;
            int i15 = zzamwVar.zzd;
            numZzb2 = i15 != -1 ? zzb(strArrSplit[i15].trim()) : null;
            i10 = zzamwVar.zze;
            f10 = -3.4028235E38f;
        } catch (RuntimeException e10) {
            e = e10;
            zzamyVar = null;
        }
        try {
            if (i10 != -1) {
                String strTrim2 = strArrSplit[i10].trim();
                zzamyVar = null;
                try {
                    f10 = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e11) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strTrim2).length() + 29);
                    sb2.append("Failed to parse font size: '");
                    sb2.append(strTrim2);
                    sb2.append("'");
                    zzee.zzd("SsaStyle", sb2.toString(), e11);
                }
            } else {
                zzamyVar = null;
            }
            int i16 = zzamwVar.zzf;
            if (i16 == -1 || !zze(strArrSplit[i16].trim())) {
                z10 = false;
                z11 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            int i17 = zzamwVar.zzg;
            if (i17 == -1 || !zze(strArrSplit[i17].trim())) {
                z12 = z10;
                z13 = true;
            } else {
                z13 = true;
                z12 = true;
            }
            int i18 = zzamwVar.zzh;
            boolean z14 = (i18 == -1 || !zze(strArrSplit[i18].trim())) ? z10 : z13;
            int i19 = zzamwVar.zzi;
            boolean z15 = (i19 == -1 || !zze(strArrSplit[i19].trim())) ? z10 : z13;
            int i20 = zzamwVar.zzj;
            if (i20 != -1) {
                String strTrim3 = strArrSplit[i20].trim();
                try {
                    int i21 = Integer.parseInt(strTrim3.trim());
                    if (i21 == z13 || i21 == 3) {
                        i11 = i21;
                    }
                } catch (NumberFormatException unused) {
                }
                zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                i11 = -1;
            } else {
                i11 = -1;
            }
            return new zzamy(strTrim, iZzd, numZzb, numZzb2, f10, z11, z12, z14, z15, i11);
        } catch (RuntimeException e12) {
            e = e12;
            StringBuilder sb3 = new StringBuilder(str.length() + 36);
            sb3.append("Skipping malformed 'Style:' line: '");
            sb3.append(str);
            sb3.append("'");
            zzee.zzd("SsaStyle", sb3.toString(), e);
            return zzamyVar;
        }
    }

    @Nullable
    @ColorInt
    public static Integer zzb(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgrc.zza(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgxz.zza(((j10 >> 24) & 255) ^ 255), zzgxz.zza(j10 & 255), zzgxz.zza((j10 >> 8) & 255), zzgxz.zza((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            zzee.zzd("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int i10;
        try {
            i10 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i10;
            default:
                zzee.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            zzee.zzd("SsaStyle", sb2.toString(), e10);
            return false;
        }
    }
}
