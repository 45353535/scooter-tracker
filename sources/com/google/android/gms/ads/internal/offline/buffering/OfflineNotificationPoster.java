package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.taurusx.tax.o.g;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class OfflineNotificationPoster extends Worker {
    private final zzbxl zza;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbb.zzb().zzk(context, new zzbtp());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.Result doWork() {
        try {
            this.zza.zzj(ObjectWrapper.wrap(getApplicationContext()), new zza(getInputData().getString(g.f66428y), getInputData().getString("gws_query_id"), getInputData().getString(CampaignEx.JSON_KEY_IMAGE_URL)));
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
