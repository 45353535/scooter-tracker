package com.google.android.gms.tflite.java;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.internal.tflite_java.zzd;
import com.google.android.gms.internal.tflite_java.zzl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class TfLite {
    private TfLite() {
    }

    public static TfLiteClient getClient(Context context) {
        return new zza(context).zze();
    }

    public static Task<Status> getTfliteModuleAvailabilityStatus(Context context) {
        ModuleInstallClient client = ModuleInstall.getClient(context);
        final Feature[] featureArr = zzl.zzb;
        zzd.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return client.areModulesAvailable(new OptionalModuleApi() { // from class: com.google.android.gms.internal.tflite_java.zzj
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                return featureArr;
            }
        }).continueWithTask(Executors.unconfigurableExecutorService(threadPoolExecutor), new Continuation() { // from class: com.google.android.gms.internal.tflite_java.zzk
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    int availabilityStatus = ((ModuleAvailabilityResponse) task.getResult()).getAvailabilityStatus();
                    return availabilityStatus != 0 ? availabilityStatus != 1 ? Tasks.forResult(new Status(8, "The modules requested cannot be recognized.")) : Tasks.forResult(new Status(0, "The modules are ready to be downloaded.")) : Tasks.forResult(new Status(0, "The modules are already present on device."));
                }
                Exception exception = task.getException();
                return exception != null ? Tasks.forException(exception) : Tasks.forException(new IllegalStateException("Failed to check modules availability."));
            }
        });
    }

    public static Task<Void> initialize(Context context) {
        return new zza(context).zza();
    }

    public static Task<Void> initialize(Context context, TfLiteInitializationOptions tfLiteInitializationOptions) {
        return new zza(context).zzb(tfLiteInitializationOptions);
    }
}
