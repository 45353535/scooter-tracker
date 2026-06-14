package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsr {
    private final zzco[] zza;
    private final zztc zzb;
    private final zzcu zzc;

    public zzsr(zzco... zzcoVarArr) {
        zztc zztcVar = new zztc();
        zzcu zzcuVar = new zzcu();
        zzco[] zzcoVarArr2 = {zztcVar, zzcuVar};
        this.zza = zzcoVarArr2;
        System.arraycopy(zzcoVarArr, 0, zzcoVarArr2, 0, 0);
        this.zzb = zztcVar;
        this.zzc = zzcuVar;
    }

    public final zzco[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcu zzcuVar = this.zzc;
        zzcuVar.zzk(zzavVar.zzb);
        zzcuVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z10) {
        this.zzb.zzq(z10);
        return z10;
    }

    public final long zzd(long j10) {
        zzcu zzcuVar = this.zzc;
        return zzcuVar.zzc() ? zzcuVar.zzm(j10) : j10;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
