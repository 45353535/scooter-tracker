package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class OfflinePingSender extends Worker {
    private final zzbxl zza;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbb.zzb().zzk(context, new zzbtp());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.Result doWork() {
        try {
            this.zza.zzg();
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
