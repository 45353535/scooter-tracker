package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfbe implements zzfav {
    private final int zza;
    private final int zzb;

    zzfbe(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        Bundle bundle = ((zzdah) obj).zza;
        int i11 = this.zza;
        if (i11 == -1 || (i10 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i11);
        bundle.putInt("crashes_without_flags", i10);
        int i12 = com.google.android.gms.ads.internal.client.zzbb.zza;
        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
