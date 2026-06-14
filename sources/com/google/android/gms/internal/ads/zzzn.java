package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzzn implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzaaa zza;

    zzzn(zzzp zzzpVar, zzaaa zzaaaVar) {
        this.zza = zzaaaVar;
        Objects.requireNonNull(zzzpVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzl();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzl();
    }
}
