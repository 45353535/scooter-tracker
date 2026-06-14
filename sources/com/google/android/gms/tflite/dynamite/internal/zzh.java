package com.google.android.gms.tflite.dynamite.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.tflite.zzaa;
import com.google.android.gms.internal.tflite.zzl;
import com.google.android.gms.internal.tflite.zzm;
import com.google.android.gms.internal.tflite.zzn;
import com.google.android.gms.internal.tflite.zzs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzh implements TfLiteClient {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final Executor zzc;
    private final zzaa zzd;
    private final ModuleInstallClient zze;

    public zzh(Context context, Executor executor, zzaa zzaaVar) {
        ModuleInstallClient client = ModuleInstall.getClient(context);
        this.zzb = context;
        this.zzc = executor;
        this.zzd = zzaaVar;
        this.zze = client;
        zzs.zza(context);
    }

    public static /* synthetic */ Task zza(zzh zzhVar, TfLiteInitializationOptions tfLiteInitializationOptions, Void r62) {
        Context context = zzhVar.zzb;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = ClientLibraryUtils.getPackageInfo(context, packageName);
        String str = packageInfo == null ? null : packageInfo.versionName;
        zzaa zzaaVar = zzhVar.zzd;
        CustomerInfo customerInfo = new CustomerInfo(packageName, str, zzaaVar != null ? Integer.valueOf(zzaaVar.zza()) : null);
        Context context2 = zzhVar.zzb;
        boolean zEnableGpuDelegateSupport = tfLiteInitializationOptions.enableGpuDelegateSupport();
        tfLiteInitializationOptions.zza();
        return Tasks.forResult(new NativeInitializationHandle(zzj.zzb(context2, customerInfo, zEnableGpuDelegateSupport, false).zzc()));
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return new Feature[]{zzm.zza};
    }

    @Override // com.google.android.gms.tflite.client.TfLiteClient
    public final Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle() {
        Task taskContinueWith;
        TfLiteInitializationOptions tfLiteInitializationOptions = TfLiteClient.DEFAULT_TFLITE_INITIALIZATION_OPTIONS;
        if (tfLiteInitializationOptions.enableAutomaticDownload()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzm.zza);
            if (tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                arrayList.add(zzn.zza);
            }
            Feature[] featureArr = (Feature[]) arrayList.toArray(new Feature[0]);
            taskContinueWith = zzl.zza(this.zze, featureArr, this.zzc).addOnFailureListener(new zze(featureArr)).continueWith(this.zzc, new zzf());
        } else {
            taskContinueWith = Tasks.forResult(null);
        }
        return taskContinueWith.onSuccessTask(this.zzc, new zzg(this, tfLiteInitializationOptions));
    }

    public final void zzb() {
        Context context = this.zzb;
        String packageName = context.getPackageName();
        Preconditions.checkArgument(UidVerifier.uidHasPackageName(context, Process.myUid(), packageName), "Invalid package name \"%s\" for context", packageName);
    }

    @Override // com.google.android.gms.tflite.client.TfLiteClient
    public final Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle(TfLiteInitializationOptions tfLiteInitializationOptions) {
        Task taskContinueWith;
        if (!tfLiteInitializationOptions.enableAutomaticDownload()) {
            taskContinueWith = Tasks.forResult(null);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzm.zza);
            if (tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                arrayList.add(zzn.zza);
            }
            Feature[] featureArr = (Feature[]) arrayList.toArray(new Feature[0]);
            taskContinueWith = zzl.zza(this.zze, featureArr, this.zzc).addOnFailureListener(new zze(featureArr)).continueWith(this.zzc, new zzf());
        }
        return taskContinueWith.onSuccessTask(this.zzc, new zzg(this, tfLiteInitializationOptions));
    }
}
