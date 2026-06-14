package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes8.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzagf implements zzaex {
    private final long zzb;
    private final zzaex zzc;

    public zzagf(long j10, zzaex zzaexVar) {
        this.zzb = j10;
        this.zzc = zzaexVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i10, int i11) {
        return this.zzc.zzu(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(zzafy zzafyVar) {
        this.zzc.zzw(new zzage(this, zzafyVar, zzafyVar));
    }
}
