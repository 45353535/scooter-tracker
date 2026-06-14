package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzikr {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzikr(int i10, int i11, zzikq zzikqVar) {
        this.zza = zzikd.zza(i10);
        this.zzb = zzikd.zza(i11);
    }

    public final zzikr zza(zzikp zzikpVar) {
        this.zza.add(zzikpVar);
        return this;
    }

    public final zzikr zzb(zzikp zzikpVar) {
        this.zzb.add(zzikpVar);
        return this;
    }

    public final zziks zzc() {
        return new zziks(this.zza, this.zzb, null);
    }
}
