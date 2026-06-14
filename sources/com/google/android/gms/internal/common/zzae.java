package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes8.dex */
final class zzae extends zzz {
    private final zzah zza;

    zzae(zzah zzahVar, int i10) {
        super(zzahVar.size(), i10);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
