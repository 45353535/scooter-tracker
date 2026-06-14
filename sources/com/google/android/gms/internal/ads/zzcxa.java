package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcxa implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzdcm zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcxa(zzdcm zzdcmVar) {
        this.zza = zzdcmVar;
    }

    private final void zzm() {
        AtomicBoolean atomicBoolean = this.zzc;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        zzm();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i10) {
        this.zzb.set(true);
        zzm();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        this.zza.zzc();
    }

    public final boolean zzl() {
        return this.zzb.get();
    }
}
