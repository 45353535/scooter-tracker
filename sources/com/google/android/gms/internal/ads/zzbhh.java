package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbhh {
    private final String zza = (String) zzbiy.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbhh(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put(C4240b4.i.G, com.google.android.gms.ads.internal.util.zzs.zzv());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzJ(context) ? "0" : "1");
        Future futureZza = com.google.android.gms.ads.internal.zzt.zzp().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbzy) futureZza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbzy) futureZza.get()).zzk));
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmN)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.zzG(context) ? "0" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkR)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcX)).booleanValue() || zzgrt.zzc(com.google.android.gms.ads.internal.zzt.zzh().zzu())) {
                return;
            }
            this.zzb.put(N6.L, com.google.android.gms.ads.internal.zzt.zzh().zzu());
        }
    }

    final String zza() {
        return this.zza;
    }

    final Context zzb() {
        return this.zzc;
    }

    final String zzc() {
        return this.zzd;
    }

    final Map zzd() {
        return this.zzb;
    }
}
