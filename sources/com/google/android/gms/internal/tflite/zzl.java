package com.google.android.gms.internal.tflite;

import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzl {
    public static Task zza(ModuleInstallClient moduleInstallClient, final Feature[] featureArr, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OptionalModuleApi optionalModuleApi = new OptionalModuleApi() { // from class: com.google.android.gms.internal.tflite.zzi
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                return featureArr;
            }
        };
        return moduleInstallClient.installModules(ModuleInstallRequest.newBuilder().addApi(optionalModuleApi).setListener(new zzk(taskCompletionSource, moduleInstallClient)).build()).continueWithTask(executor, new Continuation() { // from class: com.google.android.gms.internal.tflite.zzj
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Exception exception = task.getException();
                if (exception != null) {
                    return Tasks.forException(exception);
                }
                if (!((ModuleInstallResponse) task.getResult()).areModulesAlreadyInstalled()) {
                    return taskCompletionSource.getTask();
                }
                Feature[] featureArr2 = featureArr;
                Log.i("TFLITE_MODULE_INSTALLER", "Following modules are already installed:");
                for (Feature feature : featureArr2) {
                    Log.i("TFLITE_MODULE_INSTALLER", feature.toString());
                }
                return Tasks.forResult(Boolean.TRUE);
            }
        });
    }
}
