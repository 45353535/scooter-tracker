package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
public final class zza implements AccelerationServiceLogger {
    private final zzc zza;

    @VisibleForTesting
    public zza(zzc zzcVar) {
        this.zza = zzcVar;
    }

    private final void zza(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            Log.w("AccelerationLogger", "Failed to log counter: ".concat(str), e10);
        }
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logApplyValidatedConfig(int i10, ApplyValidatedConfigStatus applyValidatedConfigStatus) {
        try {
            this.zza.zzd(i10, applyValidatedConfigStatus);
        } catch (RemoteException e10) {
            Log.w("AccelerationLogger", String.format("Failed to log apply validated config outcome: delegate (%d), status: (%s)", Integer.valueOf(i10), applyValidatedConfigStatus), e10);
        }
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logGenerateBestConfigCounter() {
        zza("AccelerationServiceGenerateBestConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logSelectBestConfigCounter() {
        zza("AccelerationServiceSelectBestConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logValidateConfigCounter() {
        zza("AccelerationServiceValidateConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logValidationResult(byte[] bArr, ValidationSettings validationSettings) {
        try {
            this.zza.zzf(bArr, validationSettings);
        } catch (RemoteException e10) {
            Log.w("AccelerationLogger", "Failed to log validation result; validation settings: ".concat(String.valueOf(validationSettings)), e10);
        }
    }
}
