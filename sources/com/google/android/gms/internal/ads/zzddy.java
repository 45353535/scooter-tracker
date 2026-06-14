package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzddy extends zzdhd {
    private boolean zzb;

    @VisibleForTesting
    public zzddy(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzddx.zza);
        this.zzb = true;
    }
}
