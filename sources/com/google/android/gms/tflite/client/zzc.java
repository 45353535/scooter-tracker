package com.google.android.gms.tflite.client;

import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes8.dex */
final class zzc extends TfLiteInitializationOptions {
    private final boolean zza;

    @ShowFirstParty
    private final boolean zzb;

    /* synthetic */ zzc(boolean z10, boolean z11, boolean z12, zzb zzbVar) {
        this.zza = z10;
        this.zzb = z12;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    @ShowFirstParty
    public final boolean enableAutomaticDownload() {
        return this.zzb;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    public final boolean enableGpuDelegateSupport() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TfLiteInitializationOptions) {
            TfLiteInitializationOptions tfLiteInitializationOptions = (TfLiteInitializationOptions) obj;
            if (this.zza == tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                tfLiteInitializationOptions.zza();
                if (this.zzb == tfLiteInitializationOptions.enableAutomaticDownload()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.zza ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final String toString() {
        return "TfLiteInitializationOptions{enableGpuDelegateSupport=" + this.zza + ", enableTpuDelegateSupport=false, enableAutomaticDownload=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    public final boolean zza() {
        return false;
    }
}
