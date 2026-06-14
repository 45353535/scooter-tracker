package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgk extends zzmb implements zznn {
    private zzgk() {
        throw null;
    }

    public final int zza() {
        return ((zzgl) this.zza).zzf();
    }

    public final zzgj zzb(int i10) {
        return ((zzgl) this.zza).zzg(i10);
    }

    public final zzgk zzc(int i10, zzgi zzgiVar) {
        zzaX();
        ((zzgl) this.zza).zzt(i10, (zzgj) zzgiVar.zzbc());
        return this;
    }

    public final List zzd() {
        return DesugarCollections.unmodifiableList(((zzgl) this.zza).zzh());
    }

    public final zzgk zze() {
        zzaX();
        ((zzgl) this.zza).zzu();
        return this;
    }

    public final zzgk zzf() {
        zzaX();
        ((zzgl) this.zza).zzv();
        return this;
    }

    public final List zzg() {
        return DesugarCollections.unmodifiableList(((zzgl) this.zza).zzk());
    }

    public final String zzh() {
        return ((zzgl) this.zza).zzm();
    }

    /* synthetic */ zzgk(byte[] bArr) {
        super(zzgl.zzu);
    }
}
