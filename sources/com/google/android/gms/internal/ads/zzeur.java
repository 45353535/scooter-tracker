package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeur implements zzfax {
    private final zzgzy zza;
    private final VersionInfoParcel zzb;

    zzeur(VersionInfoParcel versionInfoParcel, zzgzy zzgzyVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 54;
    }

    final /* synthetic */ zzeus zzc() {
        return zzeus.zzc(this.zzb);
    }
}
