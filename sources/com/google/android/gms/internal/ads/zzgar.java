package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgar extends zzgyh {
    Object zza;

    zzgar(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final boolean zzb(Throwable th2) {
        return super.zzb(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
