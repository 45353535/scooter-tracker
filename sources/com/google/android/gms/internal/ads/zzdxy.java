package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdxy {
    final /* synthetic */ zzdxz zza;
    private final Map zzb;

    @VisibleForTesting
    zzdxy(zzdxz zzdxzVar) {
        Objects.requireNonNull(zzdxzVar);
        this.zza = zzdxzVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdxy zza(zzfiu zzfiuVar) {
        zzc("gqi", zzfiuVar.zzb);
        return this;
    }

    public final zzdxy zzb(zzfir zzfirVar) {
        zzc("aai", zzfirVar.zzw);
        zzc(CommonUrlParts.REQUEST_ID, zzfirVar.zzan);
        zzc("ad_format", zzfir.zza(zzfirVar.zzb));
        return this;
    }

    public final zzdxy zzc(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpI)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzdxz zzdxzVar = this.zza;
        return zzdxzVar.zzc().zzf(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final void zzh() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zzc().zzb(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zzc().zzg(this.zzb);
    }

    final /* synthetic */ void zzk() {
        this.zza.zzc().zze(this.zzb);
    }

    final /* synthetic */ zzdxy zzl() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
