package com.google.android.gms.tflite.dynamite.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.tflite.zzm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzj {
    public static final long zza;
    private static final String zzb;
    private final Context zzc;
    private final CustomerInfo zzd;
    private final com.google.android.gms.tflite.dynamite.zzc zze;
    private final int zzf;
    private final boolean zzg;

    static {
        Feature feature = zzm.zza;
        zzb = "com.google.android.gms.".concat(String.valueOf(feature.getName()));
        zza = feature.getVersion();
    }

    private zzj(Context context, CustomerInfo customerInfo, com.google.android.gms.tflite.dynamite.zzc zzcVar, int i10, boolean z10, boolean z11) {
        this.zzc = context;
        this.zzd = customerInfo;
        this.zze = zzcVar;
        this.zzf = i10;
        this.zzg = z10;
    }

    public static zzi zza(Context context, long j10) throws DynamiteModule.LoadingException {
        com.google.android.gms.internal.tflite.zzh zzhVar = new com.google.android.gms.internal.tflite.zzh(DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION);
        DynamiteModule dynamiteModuleLoad = DynamiteModule.load(context, zzhVar, zzb);
        int iZza = zzhVar.zza();
        if (iZza == 0 || iZza >= j10) {
            return new zzi(dynamiteModuleLoad, iZza);
        }
        throw new IllegalStateException(String.format("Dynamite module version %d does not meet minimum requirement of %d", Integer.valueOf(iZza), Long.valueOf(j10)));
    }

    static zzj zzb(Context context, CustomerInfo customerInfo, boolean z10, boolean z11) throws DynamiteModule.LoadingException {
        zzi zziVarZza = zza(context, z10 ? 221902000L : zza);
        return new zzj(context, customerInfo, com.google.android.gms.tflite.dynamite.zzb.zza(zziVarZza.zzb("com.google.android.gms.tflite.dynamite.TfLiteDynamiteLoaderImpl")), zziVarZza.zza(), z10, false);
    }

    final Object zzc() throws RemoteException, DynamiteModule.LoadingException {
        if (this.zzf >= 221902000) {
            return ObjectWrapper.unwrap(this.zze.zzf(ObjectWrapper.wrap(this.zzc), new zzb(this.zzd, this.zzg, false)));
        }
        Preconditions.checkState(!this.zzg);
        if (this.zzf >= 214812000) {
            return ObjectWrapper.unwrap(this.zze.zze(ObjectWrapper.wrap(this.zzc), this.zzd));
        }
        long jZzd = this.zze.zzd(ObjectWrapper.wrap(this.zzc), this.zzd);
        Context context = this.zzc;
        return new zzd(jZzd, ObjectWrapper.unwrap(com.google.android.gms.tflite.dynamite.zze.zza(zza(context, zza).zzb("com.google.android.gms.tflite.dynamite.TfLiteLoggerCreator")).zzd(ObjectWrapper.wrap(context), this.zzd)), false);
    }
}
