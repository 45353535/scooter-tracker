package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgud extends zzgsc {
    private final zzguf zza;

    zzgud(zzguf zzgufVar, int i10) {
        super(zzgufVar.size(), i10);
        this.zza = zzgufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
