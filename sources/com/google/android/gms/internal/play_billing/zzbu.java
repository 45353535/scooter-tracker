package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
final class zzbu extends zzbq {
    private final zzbw zza;

    zzbu(zzbw zzbwVar, int i10) {
        super(zzbwVar.size(), i10);
        this.zza = zzbwVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
