package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
final class zzen extends zzeo {
    final /* synthetic */ zzev zza;
    private int zzb;
    private final int zzc;

    zzen(zzev zzevVar) {
        Objects.requireNonNull(zzevVar);
        this.zza = zzevVar;
        this.zzb = 0;
        this.zzc = zzevVar.zze();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeq
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
