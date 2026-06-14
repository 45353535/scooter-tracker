package com.google.android.gms.tflite.dynamite;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.tflite.zzaa;
import com.google.android.gms.internal.tflite.zzg;
import com.google.android.gms.internal.tflite.zzz;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.dynamite.internal.zzh;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class TfLiteDynamite {
    private TfLiteDynamite() {
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static Executor createDefaultExecutor() {
        zzg.zza();
        zzz zzzVar = new zzz();
        zzzVar.zza("TFLiteClient-%d");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzzVar.zzb());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static TfLiteClient getClient(@NonNull Context context, int i10, @NonNull Executor executor) {
        zzaa zzaaVar;
        switch (i10) {
            case 0:
                zzaaVar = zzaa.CUSTOMER_UNKNOWN;
                break;
            case 1:
                zzaaVar = zzaa.CUSTOMER_3P_JAVA_API;
                break;
            case 2:
                zzaaVar = zzaa.CUSTOMER_3P_TASKS_JAVA_API;
                break;
            case 3:
                zzaaVar = zzaa.CUSTOMER_BLUESKY;
                break;
            case 4:
                zzaaVar = zzaa.CUSTOMER_HULK;
                break;
            case 5:
                zzaaVar = zzaa.CUSTOMER_LEIBNIZ;
                break;
            case 6:
                zzaaVar = zzaa.CUSTOMER_BARHOPPER;
                break;
            case 7:
                zzaaVar = zzaa.CUSTOMER_MLKIT_CUSTOM_ICA;
                break;
            case 8:
                zzaaVar = zzaa.CUSTOMER_MLKIT_NLCLASSIFIER;
                break;
            case 9:
                zzaaVar = zzaa.CUSTOMER_USERPROFILE;
                break;
            case 10:
                zzaaVar = zzaa.CUSTOMER_TEST;
                break;
            case 11:
                zzaaVar = zzaa.CUSTOMER_TASKS_AUDIO;
                break;
            case 12:
                zzaaVar = zzaa.CUSTOMER_TASKS_TEXT;
                break;
            case 13:
                zzaaVar = zzaa.CUSTOMER_TASKS_VISION;
                break;
            case 14:
                zzaaVar = zzaa.CUSTOMER_MLKIT_SMARTREPLY;
                break;
            case 15:
                zzaaVar = zzaa.CUSTOMER_MLKIT_OCR;
                break;
            case 16:
                zzaaVar = zzaa.CUSTOMER_MLKIT_IMAGE_CAPTION;
                break;
            case 17:
                zzaaVar = zzaa.CUSTOMER_MLBENCHMARK;
                break;
            case 18:
                zzaaVar = zzaa.CUSTOMER_MLKIT_DOCUMENT_DETECTION;
                break;
            case 19:
                zzaaVar = zzaa.CUSTOMER_TFLITE_DELEGATE_DYNAMITE;
                break;
            case 20:
                zzaaVar = zzaa.CUSTOMER_ACCELERATION_SERVICE;
                break;
            case 21:
                zzaaVar = zzaa.CUSTOMER_3P_NATIVE_API;
                break;
            case 22:
                zzaaVar = zzaa.CUSTOMER_MLKIT_DOCUMENT_STAIN_REMOVER;
                break;
            case 23:
                zzaaVar = zzaa.CUSTOMER_PHOTOS;
                break;
            case 24:
                zzaaVar = zzaa.CUSTOMER_MAPS;
                break;
            default:
                zzaaVar = null;
                break;
        }
        zzh zzhVar = new zzh(context, executor, (zzaa) Preconditions.checkNotNull(zzaaVar, "Invalid customer ID " + i10));
        zzhVar.zzb();
        return zzhVar;
    }
}
