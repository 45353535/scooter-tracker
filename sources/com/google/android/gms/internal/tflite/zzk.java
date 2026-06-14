package com.google.android.gms.internal.tflite;

import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzk implements InstallStatusListener {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ ModuleInstallClient zzb;

    zzk(TaskCompletionSource taskCompletionSource, ModuleInstallClient moduleInstallClient) {
        this.zza = taskCompletionSource;
        this.zzb = moduleInstallClient;
    }

    @Override // com.google.android.gms.common.moduleinstall.InstallStatusListener
    public final void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        int installState = moduleInstallStatusUpdate.getInstallState();
        if (installState != 3) {
            if (installState == 4) {
                this.zza.trySetResult(Boolean.TRUE);
                this.zzb.unregisterListener(this);
                return;
            } else if (installState != 5) {
                return;
            }
        }
        this.zza.trySetResult(Boolean.FALSE);
        this.zzb.unregisterListener(this);
    }
}
