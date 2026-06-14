package com.google.android.gms.internal.measurement;

import j$.util.Objects;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
final class zzla extends zzlb {
    final /* synthetic */ zzlh zza;
    private int zzb;
    private final int zzc;

    zzla(zzlh zzlhVar) {
        Objects.requireNonNull(zzlhVar);
        this.zza = zzlhVar;
        this.zzb = 0;
        this.zzc = zzlhVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
