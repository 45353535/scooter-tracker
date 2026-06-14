package com.google.android.gms.internal.tflite_java;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;
import com.google.android.gms.tflite.dynamite.TfLiteDynamite;
import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
@ShowFirstParty
public abstract class zzi {
    private static final Map zza = DesugarCollections.synchronizedMap(new EnumMap(zzo.class));
    private final Executor zzb;
    private final zzo zzc;
    private final TfLiteClient zzd;

    protected zzi(Context context, Executor executor, zzo zzoVar) {
        TfLiteClient client = TfLiteDynamite.getClient(context, zzoVar.zza(), executor);
        this.zzb = executor;
        this.zzc = zzoVar;
        this.zzd = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Task zza(NativeInitializationHandle nativeInitializationHandle) throws Exception {
        try {
            zzc();
            initializeNative(nativeInitializationHandle.getInternal());
            return Tasks.forResult(null);
        } catch (UnsatisfiedLinkError e10) {
            return Tasks.forException(new Exception("Native initialization method not found", e10));
        }
    }

    protected abstract void initializeNative(Object obj);

    @ShowFirstParty
    public Task zzb(TfLiteInitializationOptions tfLiteInitializationOptions) {
        Map map = zza;
        synchronized (map) {
            try {
                zzg zzgVar = (zzg) map.get(this.zzc);
                if (zzgVar != null) {
                    return zzgVar.zza(tfLiteInitializationOptions);
                }
                Task<TContinuationResult> taskOnSuccessTask = this.zzd.getTfLiteNativeInitializationHandle(tfLiteInitializationOptions).onSuccessTask(this.zzb, new SuccessContinuation() { // from class: com.google.android.gms.internal.tflite_java.zzf
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        return this.zza.zza((NativeInitializationHandle) obj);
                    }
                });
                map.put(this.zzc, new zzg(taskOnSuccessTask, tfLiteInitializationOptions, null));
                taskOnSuccessTask.addOnFailureListener(zzn.zza(), new OnFailureListener() { // from class: com.google.android.gms.internal.tflite_java.zze
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        zzi.zza.remove(this.zza.zzc);
                    }
                });
                return taskOnSuccessTask;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void zzc() throws UnsatisfiedLinkError {
    }

    public final TfLiteClient zze() {
        return this.zzd;
    }
}
