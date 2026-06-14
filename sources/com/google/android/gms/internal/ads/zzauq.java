package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzauq implements Supplier {
    private final /* synthetic */ int zzc;
    public static final /* synthetic */ zzauq zzb = new zzauq(1);
    static final /* synthetic */ zzauq zza = new zzauq(0);

    private /* synthetic */ zzauq(int i10) {
        this.zzc = i10;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.zzc != 0 ? zzavg.zza(null) : new zzaut();
    }
}
