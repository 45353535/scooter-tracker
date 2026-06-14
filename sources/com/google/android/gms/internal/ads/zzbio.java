package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public class zzbio {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbio(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbio zza(String str, boolean z10) {
        return new zzbio(str, Boolean.valueOf(z10), 1);
    }

    public static zzbio zzb(String str, long j10) {
        return new zzbio(str, Long.valueOf(j10), 2);
    }

    public static zzbio zzc(String str, double d10) {
        return new zzbio(str, Double.valueOf(d10), 3);
    }

    public static zzbio zzd(String str, String str2) {
        return new zzbio("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbju zzbjuVarZza = zzbjw.zza();
        if (zzbjuVarZza != null) {
            int i10 = this.zzc - 1;
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? zzbjuVarZza.zzd(this.zza, (String) this.zzb) : zzbjuVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zzbjuVarZza.zzb(this.zza, ((Long) this.zzb).longValue()) : zzbjuVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbjw.zzb() != null) {
            zzbjw.zzb().zza();
        }
        return this.zzb;
    }
}
