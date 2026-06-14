package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfkp {

    @Nullable
    @VisibleForTesting
    static Task zza;

    @Nullable
    @VisibleForTesting
    public static AppSetIdClient zzb;
    private static final Object zzc = new Object();

    public static void zza(Context context, boolean z10) {
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = AppSet.getClient(context);
                }
                Task task = zza;
                if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z10 && zza.isComplete()))) {
                    try {
                        zza = ((AppSetIdClient) Preconditions.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 31);
                        sb2.append("Failed to get app set ID info: ");
                        sb2.append(message);
                        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                        zza = Tasks.forException(e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public static Task zzb(Context context) {
        Task task;
        zza(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }
}
