package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes8.dex */
final class zzar extends zzao {
    private final zzat zza;

    zzar(zzat zzatVar, int i10) {
        super(zzatVar.size(), i10);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.fido.zzao
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
