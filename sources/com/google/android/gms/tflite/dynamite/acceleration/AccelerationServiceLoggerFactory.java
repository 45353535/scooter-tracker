package com.google.android.gms.tflite.dynamite.acceleration;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;
import com.google.android.gms.tflite.dynamite.internal.zzj;

/* JADX INFO: loaded from: classes8.dex */
public final class AccelerationServiceLoggerFactory {
    private AccelerationServiceLoggerFactory() {
    }

    @NonNull
    @KeepForSdk
    public static AccelerationServiceLogger create(@NonNull Context context, @NonNull CustomerInfo customerInfo) {
        zzd zzdVar;
        try {
            IBinder iBinderZzb = zzj.zza(context, zzj.zza).zzb("com.google.android.gms.tflite.dynamite.AccelerationLoggerCreator");
            if (iBinderZzb == null) {
                zzdVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZzb.queryLocalInterface("com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLoggerCreator");
                zzdVar = iInterfaceQueryLocalInterface instanceof zzd ? (zzd) iInterfaceQueryLocalInterface : new zzd(iBinderZzb);
            }
            return new zza(zzdVar.zzd(ObjectWrapper.wrap(context), customerInfo));
        } catch (RemoteException | DynamiteModule.LoadingException e10) {
            Log.w("TfLiteGMS", "Failed to initialize logger.", e10);
            return new zze();
        }
    }

    @NonNull
    @KeepForSdk
    public static AccelerationServiceLogger createNoop() {
        return new zze();
    }
}
