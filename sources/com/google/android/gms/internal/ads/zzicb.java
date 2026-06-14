package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzicb extends AbstractList {
    private final zzibz zza;
    private final zzica zzb;

    public zzicb(zzibz zzibzVar, zzica zzicaVar) {
        this.zza = zzibzVar;
        this.zzb = zzicaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzf(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
