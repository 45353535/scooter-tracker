package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes8.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzagd extends zzafi {
    private final long zza;

    public zzagd(zzaev zzaevVar, long j10) {
        super(zzaevVar);
        zzgrc.zza(zzaevVar.zzn() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
