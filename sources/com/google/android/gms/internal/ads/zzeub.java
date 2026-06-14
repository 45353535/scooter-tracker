package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeub implements zzfav {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzeub(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z10) {
        this.zza = zzxVar;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgt)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i10 = zzxVar.zza;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", CmcdData.Factory.STREAM_TYPE_LIVE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
