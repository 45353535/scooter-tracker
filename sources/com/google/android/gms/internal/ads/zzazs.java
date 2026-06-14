package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzazs implements zzazy {
    final /* synthetic */ Activity zza;

    zzazs(zzazz zzazzVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzazzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
