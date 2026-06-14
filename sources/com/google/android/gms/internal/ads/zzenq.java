package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzenq {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;

    @Nullable
    final Integer zze;

    zzenq(String str, String str2, int i10, long j10, @Nullable Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = j10;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i10 = this.zzc;
        long j10 = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i10).length() + 1 + String.valueOf(j10).length());
        sb2.append(str);
        sb2.append(".");
        sb2.append(i10);
        sb2.append(".");
        sb2.append(j10);
        String string = sb2.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(str2).length());
            sb3.append(string);
            sb3.append(".");
            sb3.append(str2);
            string = sb3.toString();
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzci)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb4 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb4.append(string);
        sb4.append(".");
        sb4.append(num);
        return sb4.toString();
    }
}
