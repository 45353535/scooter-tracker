package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes8.dex */
public class zzic {
    private int zza;

    @CallSuper
    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzi(4);
    }

    public final boolean zzc() {
        return zzi(1);
    }

    public final boolean zzd() {
        return zzi(536870912);
    }

    public final boolean zze() {
        return zzi(268435456);
    }

    public final boolean zzf() {
        return zzi(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }

    public final void zzh(int i10) {
        this.zza |= 536870912;
    }

    protected final boolean zzi(int i10) {
        return (this.zza & i10) == i10;
    }
}
