package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdva {
    private volatile InputEvent zza;

    @VisibleForTesting(otherwise = 3)
    public zzdva() {
    }

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    public final InputEvent zzb() {
        return this.zza;
    }
}
