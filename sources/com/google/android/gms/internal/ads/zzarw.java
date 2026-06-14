package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzarw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzary zzc;

    zzarw(zzary zzaryVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzaryVar);
        this.zzc = zzaryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzary zzaryVar = this.zzc;
        zzaryVar.zzx().zza(this.zza, this.zzb);
        zzaryVar.zzx().zzb(zzaryVar.toString());
    }
}
