package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzclv {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzclv(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzclv zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzclv(3, 0, 0) : zzrVar.zzi ? new zzclv(2, 0, 0) : zzrVar.zzh ? new zzclv(0, 0, 0) : new zzclv(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzclv zzb() {
        return new zzclv(0, 0, 0);
    }

    public static zzclv zzc(int i10, int i11) {
        return new zzclv(1, i10, i11);
    }

    public static zzclv zzd() {
        return new zzclv(4, 0, 0);
    }

    public static zzclv zze() {
        return new zzclv(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
