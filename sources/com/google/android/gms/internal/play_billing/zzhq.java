package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzhq implements Iterator {
    final /* synthetic */ zzht zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzhq(zzht zzhtVar, zzhs zzhsVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzht zzhtVar = this.zza;
        if (i10 >= zzhtVar.zzb) {
            return !zzhtVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzht zzhtVar = this.zza;
        return i10 < zzhtVar.zzb ? (zzhp) zzhtVar.zza[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzht zzhtVar = this.zza;
        zzhtVar.zzo();
        int i10 = this.zzb;
        if (i10 >= zzhtVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzhtVar.zzm(i10);
        }
    }
}
