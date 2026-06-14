package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhz extends zzmb implements zznn {
    private zzhz() {
        throw null;
    }

    public final List zza() {
        return DesugarCollections.unmodifiableList(((zzib) this.zza).zza());
    }

    public final int zzb() {
        return ((zzib) this.zza).zzb();
    }

    public final zzid zzc(int i10) {
        return ((zzib) this.zza).zzc(i10);
    }

    public final zzhz zzd(int i10, zzic zzicVar) {
        zzaX();
        ((zzib) this.zza).zzj(i10, (zzid) zzicVar.zzbc());
        return this;
    }

    public final zzhz zze(zzic zzicVar) {
        zzaX();
        ((zzib) this.zza).zzk((zzid) zzicVar.zzbc());
        return this;
    }

    public final zzhz zzf(Iterable iterable) {
        zzaX();
        ((zzib) this.zza).zzm(iterable);
        return this;
    }

    public final zzhz zzg() {
        zzaX();
        ((zzib) this.zza).zzn();
        return this;
    }

    public final String zzh() {
        return ((zzib) this.zza).zze();
    }

    public final zzhz zzi(String str) {
        zzaX();
        ((zzib) this.zza).zzo(str);
        return this;
    }

    public final zzhz zzj(String str) {
        zzaX();
        ((zzib) this.zza).zzp(str);
        return this;
    }

    /* synthetic */ zzhz(byte[] bArr) {
        super(zzib.zzh);
    }
}
