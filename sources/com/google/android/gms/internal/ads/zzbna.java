package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbna implements zzboh {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final Pattern zzb = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No label given for CSI tick.");
                return;
            }
            zzbgv zzbgvVar = zzbhe.zzcG;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && !zza.matcher(str2).matches()) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() || zza.matcher(str3).matches()) {
                    zzcjlVar.zzq().zzb(str2, str3, jElapsedRealtime);
                    return;
                } else {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            } catch (NumberFormatException e10) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed timestamp for CSI tick.", e10);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No value given for CSI experiment.");
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcG)).booleanValue() || zzb.matcher(str5).matches()) {
                zzcjlVar.zzq().zzc().zzd(EidRequestBuilder.REQUEST_FIELD_EMAIL, str5);
                return;
            } else {
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No name given for CSI extra.");
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcG)).booleanValue() || zza.matcher(str6).matches()) {
                zzcjlVar.zzq().zzc().zzd(str6, str7);
            } else {
                int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        }
    }
}
