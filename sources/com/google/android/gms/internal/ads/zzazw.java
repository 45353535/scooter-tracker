package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzazw implements zzazy {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    zzazw(zzazz zzazzVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzazzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
