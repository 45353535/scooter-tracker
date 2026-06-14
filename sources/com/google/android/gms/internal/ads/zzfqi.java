package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfqi implements zzgzl {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzddu zzc;
    final /* synthetic */ zzfqk zzd;

    zzfqi(zzfqk zzfqkVar, zzfoe zzfoeVar, zzfoo zzfooVar, zzddu zzdduVar) {
        this.zza = zzfoeVar;
        this.zzb = zzfooVar;
        this.zzc = zzdduVar;
        Objects.requireNonNull(zzfqkVar);
        this.zzd = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(@NonNull Throwable th2) {
        zzfoe zzfoeVar = this.zza;
        if (zzfoeVar == null) {
            return;
        }
        zzfoeVar.zzd(false);
        zzfoo zzfooVar = this.zzb;
        if (zzfooVar != null) {
            zzfooVar.zza(zzfoeVar);
            zzfooVar.zzh();
        } else {
            zzfqk zzfqkVar = this.zzd;
            zzfqkVar.zze().zzb(zzfoeVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqi.zzb(java.lang.Object):void");
    }
}
