package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
final class zzbrt implements Runnable {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzbrg zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbsl zze;

    zzbrt(zzbsl zzbslVar, zzbsk zzbskVar, zzbrg zzbrgVar, ArrayList arrayList, long j10) {
        this.zza = zzbskVar;
        this.zzb = zzbrgVar;
        this.zzc = arrayList;
        this.zzd = j10;
        Objects.requireNonNull(zzbslVar);
        this.zze = zzbslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbsl zzbslVar = this.zze;
        synchronized (zzbslVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbsk zzbskVar = this.zza;
                if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziK)).booleanValue()) {
                        zzbskVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbskVar.zzg();
                    }
                    zzgzy zzgzyVar = zzcei.zzf;
                    final zzbrg zzbrgVar = this.zzb;
                    Objects.requireNonNull(zzbrgVar);
                    zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrs
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbrgVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zze));
                    int iZzi = zzbskVar.zzi();
                    int iZzk = zzbslVar.zzk();
                    ArrayList arrayList = this.zzc;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                        sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb2.append(strValueOf2);
                        string = sb2.toString();
                    }
                    long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd;
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(iZzi).length() + 36 + String.valueOf(iZzk).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb3.append("Could not finish the full JS engine loading in ");
                    sb3.append(strValueOf);
                    sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb3.append(iZzi);
                    sb3.append(". Update status(fullLoadTimeout) is ");
                    sb3.append(iZzk);
                    sb3.append(string);
                    sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb3.append(jCurrentTimeMillis);
                    sb3.append(" ms at timeout. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
