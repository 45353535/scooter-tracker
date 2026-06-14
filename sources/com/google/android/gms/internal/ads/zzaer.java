package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaer implements zzagh {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ void zzN(long j10) {
        m.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ int zza(zzj zzjVar, int i10, boolean z10) {
        return m.b(this, zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ void zzc(zzer zzerVar, int i10) {
        m.c(this, zzerVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i10, int i11) {
        zzerVar.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzagg zzaggVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
    }
}
