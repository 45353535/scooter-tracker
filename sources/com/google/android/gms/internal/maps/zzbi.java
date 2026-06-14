package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes8.dex */
final class zzbi extends zzbe {
    private final zzbk zza;

    zzbi(zzbk zzbkVar, int i10) {
        super(zzbkVar.size(), i10);
        this.zza = zzbkVar;
    }

    @Override // com.google.android.gms.internal.maps.zzbe
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
