package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class zzafk implements zzagh {
    private final zzagh zza;

    public zzafk(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzN(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public int zza(zzj zzjVar, int i10, boolean z10) throws IOException {
        return this.zza.zza(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zzb(zzjVar, i10, z10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public void zzc(zzer zzerVar, int i10) {
        this.zza.zzc(zzerVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public void zzd(zzer zzerVar, int i10, int i11) {
        this.zza.zzd(zzerVar, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public void zze(long j10, int i10, int i11, int i12, @Nullable zzagg zzaggVar) {
        this.zza.zze(j10, i10, i11, i12, zzaggVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        this.zza.zzz(zzvVar);
    }
}
