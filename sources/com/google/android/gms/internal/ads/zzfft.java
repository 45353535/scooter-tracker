package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes8.dex */
final class zzfft implements zzgzl {
    zzfft(zzffw zzffwVar) {
        Objects.requireNonNull(zzffwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
