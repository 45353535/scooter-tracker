package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzhyy extends zzhza {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhyy(zzhyz zzhyzVar) {
        super(zzhyzVar.zza);
        Objects.requireNonNull(zzhyzVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
