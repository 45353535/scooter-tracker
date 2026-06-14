package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdbx extends zzdhd {
    private boolean zzb;

    public zzdbx(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzdbw.zza);
        this.zzb = true;
    }
}
