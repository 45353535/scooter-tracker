package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
final class zzbds implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzbds(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzbdk(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzbdq(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzbdn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzbdm(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzbdp(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzbdl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzbdo(this, activity));
    }

    protected final void zza(zzbdr zzbdrVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzbdrVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzc) {
                    return;
                }
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while dispatching lifecycle callback.", e10);
        }
    }
}
