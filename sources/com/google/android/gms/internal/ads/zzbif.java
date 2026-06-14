package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbif {

    @Nullable
    private CustomTabsSession zza;

    @Nullable
    private CustomTabsClient zzb;

    @Nullable
    private CustomTabsServiceConnection zzc;

    @Nullable
    private zzbie zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzikw.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.zzc;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Nullable
    public final CustomTabsSession zzc() {
        CustomTabsClient customTabsClient = this.zzb;
        if (customTabsClient == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = customTabsClient.newSession(null);
        }
        return this.zza;
    }

    public final void zzd(zzbie zzbieVar) {
        this.zzd = zzbieVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzikw.zza(activity)) != null) {
            zzikx zzikxVar = new zzikx(this);
            this.zzc = zzikxVar;
            CustomTabsClient.bindCustomTabsService(activity, strZza, zzikxVar);
        }
    }

    public final void zzf(CustomTabsClient customTabsClient) {
        this.zzb = customTabsClient;
        customTabsClient.warmup(0L);
        zzbie zzbieVar = this.zzd;
        if (zzbieVar != null) {
            zzbieVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
