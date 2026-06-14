package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbyp;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AppOpenAd {

    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    @Deprecated
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        try {
            return zzb.zza(context).zzh(str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzd.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback2 = appOpenAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzbff(context2, str, adRequest2.zza(), appOpenAdLoadCallback2).zza();
                        } catch (IllegalStateException e10) {
                            zzbyp.zza(context2).zzh(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbff(context, str, adRequest.zza(), appOpenAdLoadCallback).zza();
    }

    @Nullable
    @Deprecated
    public static AppOpenAd pollAd(@NonNull Context context, @NonNull String str) {
        try {
            zzbex zzbexVarZzi = zzb.zza(context).zzi(str);
            if (zzbexVarZzi != null) {
                return new zzbet(zzbexVarZzi, str);
            }
            zzo.zzl("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j10);

    public abstract void show(@NonNull Activity activity);
}
