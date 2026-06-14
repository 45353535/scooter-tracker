package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzvq implements zzwv, zztk {
    final /* synthetic */ zzvs zza;
    private final Object zzb;
    private zzwu zzc;
    private zztj zzd;

    public zzvq(zzvs zzvsVar, Object obj) {
        Objects.requireNonNull(zzvsVar);
        this.zza = zzvsVar;
        this.zzc = zzvsVar.zzf(null);
        this.zzd = zzvsVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i10, @Nullable zzwk zzwkVar) {
        zzwk zzwkVarZzx;
        if (zzwkVar != null) {
            zzwkVarZzx = this.zza.zzx(this.zzb, zzwkVar);
            if (zzwkVarZzx == null) {
                return false;
            }
        } else {
            zzwkVarZzx = null;
        }
        zzvs zzvsVar = this.zza;
        zzvsVar.zzw(this.zzb, 0);
        zzwu zzwuVar = this.zzc;
        int i11 = zzwuVar.zza;
        if (!Objects.equals(zzwuVar.zzb, zzwkVarZzx)) {
            this.zzc = zzvsVar.zzg(0, zzwkVarZzx);
        }
        zztj zztjVar = this.zzd;
        int i12 = zztjVar.zza;
        if (Objects.equals(zztjVar.zzb, zzwkVarZzx)) {
            return true;
        }
        this.zzd = zzvsVar.zzi(0, zzwkVarZzx);
        return true;
    }

    private final zzwg zzg(zzwg zzwgVar, @Nullable zzwk zzwkVar) {
        zzvs zzvsVar = this.zza;
        Object obj = this.zzb;
        zzvsVar.zzy(obj, zzwgVar.zzc, zzwkVar);
        zzvsVar.zzy(obj, zzwgVar.zzd, zzwkVar);
        return zzwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i10, @Nullable zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, int i11) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzd(zzwbVar, zzwgVar, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i10, @Nullable zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zze(zzwbVar, zzwgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i10, @Nullable zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzf(zzwbVar, zzwgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i10, @Nullable zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z10) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzg(zzwbVar, zzwgVar, iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i10, @Nullable zzwk zzwkVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzh(zzwgVar);
        }
    }
}
