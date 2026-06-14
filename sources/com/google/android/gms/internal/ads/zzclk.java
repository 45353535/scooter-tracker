package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzclk {

    @Nullable
    private Profile zza = null;

    zzclk() {
    }

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                WebViewCompat.setProfile(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e10) {
                String strConcat = "WebViewCompat error: ".concat(e10.toString());
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpx)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "WebViewCompat.setProfile");
                }
            }
        }
    }

    @RequiresApi(api = 24)
    @UiThread
    final void zzb(zzclo zzcloVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore", Constants.GET_INSTANCE, new zzfyr[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore$-CC", Constants.GET_INSTANCE, new zzfyr[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcloVar.zza;
                zzdxy zzdxyVarZza = zzcloVar.zzb.zzd().zza();
                zzdxyVarZza.zzc("action", "webview_p_l");
                zzdxyVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdxyVarZza.zzd();
                return;
            }
            return;
        }
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
            zzdxy zzdxyVarZza2 = zzcloVar.zzb.zzd().zza();
            zzdxyVarZza2.zzc("action", "webview_p_f");
            zzdxyVarZza2.zzc("webview_p_f", "No instance");
            zzdxyVarZza2.zzd();
        }
    }
}
