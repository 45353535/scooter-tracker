package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* JADX INFO: loaded from: classes8.dex */
final class zzamu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzamu(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static zzamu zza(String str) {
        byte b10;
        zzgrc.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new zzamu(i11, i12, i13, i14, i15, length);
            }
            String strZza = zzgql.zza(strArrSplit[i10].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    b10 = !strZza.equals("end") ? (byte) -1 : (byte) 2;
                    break;
                case 3556653:
                    b10 = !strZza.equals("text") ? (byte) -1 : (byte) 4;
                    break;
                case 102749521:
                    b10 = !strZza.equals(AdRevenueConstants.LAYER_KEY) ? (byte) -1 : (byte) 0;
                    break;
                case 109757538:
                    b10 = !strZza.equals("start") ? (byte) -1 : (byte) 1;
                    break;
                case 109780401:
                    b10 = !strZza.equals("style") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i11 = i10;
            } else if (b10 == 1) {
                i12 = i10;
            } else if (b10 == 2) {
                i13 = i10;
            } else if (b10 == 3) {
                i14 = i10;
            } else if (b10 == 4) {
                i15 = i10;
            }
            i10++;
        }
    }
}
