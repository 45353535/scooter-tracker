package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzaza implements Runnable {
    final /* synthetic */ zzazb zza;

    zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzazb zzazbVar = this.zza;
        if (zzazbVar.zzb != null) {
            return;
        }
        synchronized (zzazb.zzd) {
            if (zzazbVar.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) zzbhe.zzdl.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzazb.zza = zzfxd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z10);
            zzazb.zzd.open();
        }
    }
}
