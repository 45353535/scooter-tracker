package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
final class zzeme implements zzdmc {
    private final zzfir zza;
    private final zzbvs zzb;
    private final AdFormat zzc;

    @Nullable
    private zzdbx zzd = null;

    zzeme(zzfir zzfirVar, zzbvs zzbvsVar, AdFormat adFormat) {
        this.zza = zzfirVar;
        this.zzb = zzbvsVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, @Nullable zzdbs zzdbsVar) throws zzdmb {
        boolean zZzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdmb("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zZzk) {
                zzdbx zzdbxVar = this.zzd;
                if (zzdbxVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcc)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzdbxVar.zza();
                return;
            }
            throw new zzdmb("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdmb(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zza;
    }

    public final void zzc(zzdbx zzdbxVar) {
        this.zzd = zzdbxVar;
    }
}
