package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes8.dex */
final class zzdq extends zzdo {
    private final zzds zza;

    zzdq(zzds zzdsVar, int i10) {
        super(zzdsVar.size(), i10);
        this.zza = zzdsVar;
    }

    @Override // com.google.android.gms.internal.location.zzdo
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
