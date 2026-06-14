package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class zzxg extends zzafk {
    private final zzyb zza;
    private final zzaer zzb;
    private final AtomicReference zzc;

    zzxg(zzyb zzybVar) {
        super(zzybVar);
        this.zza = zzybVar;
        this.zzb = new zzaer();
        this.zzc = new AtomicReference(zzxf.PASS_THROUGH);
    }

    private final zzagh zzh() {
        return this.zzc.get() == zzxf.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zza(zzj zzjVar, int i10, boolean z10) throws IOException {
        return zzh().zza(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return zzh().zzb(zzjVar, i10, z10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzer zzerVar, int i10) {
        zzh().zzc(zzerVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i10, int i11) {
        zzh().zzd(zzerVar, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzagg zzaggVar) {
        zzh().zze(j10, i10, i11, i12, zzaggVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzxf.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzxf.DISCARDING);
        }
    }

    final boolean zzf() {
        return this.zzc.get() == zzxf.PASS_THROUGH;
    }
}
