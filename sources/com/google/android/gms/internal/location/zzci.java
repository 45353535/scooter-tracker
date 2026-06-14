package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzci extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    zzci(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzb(int i10, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzc(int i10, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzd(int i10, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i10)), this.zza);
    }
}
