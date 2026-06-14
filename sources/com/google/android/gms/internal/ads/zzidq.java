package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
final class zzidq extends zziag {
    final zzids zza;
    zziai zzb;
    final /* synthetic */ zzidt zzc;

    zzidq(zzidt zzidtVar) {
        Objects.requireNonNull(zzidtVar);
        this.zzc = zzidtVar;
        this.zza = new zzids(zzidtVar, null);
        this.zzb = zzb();
    }

    private final zziai zzb() {
        zzids zzidsVar = this.zza;
        if (zzidsVar.hasNext()) {
            return zzidsVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zziai
    public final byte zza() {
        zziai zziaiVar = this.zzb;
        if (zziaiVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zziaiVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
