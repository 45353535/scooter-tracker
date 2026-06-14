package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzgdz implements zzgyw {
    static final /* synthetic */ zzgdz zza = new zzgdz();

    private /* synthetic */ zzgdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        final zzgdv zzgdvVar = (zzgdv) obj;
        return zzgzo.zzk(zzgdvVar.zzb(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgea
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                return zzgdvVar;
            }
        }, zzhaf.zza());
    }
}
