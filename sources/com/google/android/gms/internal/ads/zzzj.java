package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzzj implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzzj(zzv zzvVar, int i10) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = p1.c(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzj zzzjVar) {
        return zzgts.zzg().zzd(this.zzb, zzzjVar.zzb).zzd(this.zza, zzzjVar.zza).zze();
    }
}
