package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhbi {
    private static final zzhbg zza = zzhbh.zza;
    private final zzhaz zzb;
    private final zzhbb zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzhbg zzg;
    private final int zzh;

    /* synthetic */ zzhbi(zzhaz zzhazVar, int i10, int i11, boolean z10, boolean z11, zzhbg zzhbgVar, byte[] bArr) {
        this.zzb = zzhazVar;
        this.zzh = i10;
        int i12 = i10 - 2;
        this.zzc = i12 != 1 ? i12 != 3 ? zzhbb.zzb : zzhbb.zzc : zzhbb.zza;
        this.zzd = i11;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = zzhbgVar;
    }

    public final zzhaz zza() {
        this.zzg.zza(this);
        return this.zzb;
    }

    public final zzhbb zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    final /* synthetic */ zzhaz zzf() {
        return this.zzb;
    }

    final /* synthetic */ int zzg() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ int zzj() {
        return this.zzh;
    }
}
