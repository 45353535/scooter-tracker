package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgbr implements zzgen {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    private final zzgbl zzf;
    private final zzgbr zzg = this;

    zzgbr(zzgbl zzgblVar) {
        this.zzf = zzgblVar;
        zzikp zzikpVarZza = zzikf.zza(zzgeq.zza());
        this.zza = zzikpVarZza;
        zzikp zzikpVarZza2 = zzikf.zza(zzgga.zza(zzgblVar.zza, zzgblVar.zzc, zzgblVar.zzG, zzikpVarZza, zzgblVar.zzJ, zzgblVar.zzu, zzgblVar.zzj, zzggd.zza()));
        this.zzb = zzikpVarZza2;
        zzikp zzikpVarZza3 = zzikf.zza(zzgev.zza());
        this.zzc = zzikpVarZza3;
        zzgbq zzgbqVar = new zzgbq(this);
        this.zzd = zzgbqVar;
        this.zze = zzikf.zza(zzgeo.zza(zzgblVar.zzc, zzikpVarZza2, zzgblVar.zzG, zzgblVar.zzF, zzikpVarZza3, zzgbqVar, zzgblVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final zzgdv zza() {
        return (zzgdv) this.zze.zzb();
    }

    final /* synthetic */ zzgbl zzb() {
        return this.zzf;
    }

    final /* synthetic */ zzgbr zzc() {
        return this.zzg;
    }
}
