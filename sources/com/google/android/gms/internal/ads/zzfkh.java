package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfkh {
    public static void zza(int i10, Throwable th2, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
        sb2.append("Ad failed to load : ");
        sb2.append(i10);
        String string = sb2.toString();
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th2);
        if (i10 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, str);
    }

    public static void zzb(Context context, boolean z10) {
        if (z10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        String strZzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzD).length() + 102);
        sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb2.append(strZzD);
        sb2.append("\")) to get test ads on this device.");
        String string = sb2.toString();
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
    }
}
