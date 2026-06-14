package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzesy implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final int zzc;

    zzesy(zzgzy zzgzyVar, zzfjk zzfjkVar, zzfka zzfkaVar, int i10) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzesz zzc() {
        List listAsList;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhW)).booleanValue()) {
            zzfjk zzfjkVar = this.zzb;
            if (this.zzc != 2) {
                String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhY)).booleanValue()) {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhZ)).split(StringUtils.COMMA));
                } else {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhX)).split(StringUtils.COMMA));
                }
                if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(strZzc))) {
                    strZza = zzfka.zza();
                }
            }
        }
        return new zzesz(strZza);
    }
}
