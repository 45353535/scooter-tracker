package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdo implements zzbdr {
    final /* synthetic */ Activity zza;

    zzbdo(zzbds zzbdsVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbdsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdr
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
