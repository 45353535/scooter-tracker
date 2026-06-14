package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbja;
import com.google.android.gms.internal.ads.zzcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes7.dex */
public final class zzd {
    public static void zza(Context context) {
        int i10 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbja.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                ListenableFuture listenableFutureZzb = new zzc(context).zzb();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzcel.zza(listenableFutureZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e10);
            }
        }
    }
}
