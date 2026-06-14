package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgti implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgtm zze;

    /* synthetic */ zzgti(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zze = zzgtmVar;
        this.zzb = zzgtmVar.zzs();
        this.zzc = zzgtmVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zzc;
        this.zzd = i10;
        Object objZza = zza(i10);
        this.zzc = this.zze.zzg(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzgrc.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzgtm zzgtmVar = this.zze;
        zzgtmVar.remove(zzgtmVar.zzo(i10));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i10);
}
