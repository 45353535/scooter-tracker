package com.google.android.gms.tflite.client;

import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* JADX INFO: loaded from: classes8.dex */
final class zza extends TfLiteInitializationOptions.Builder {
    private boolean zza;
    private boolean zzb;
    private byte zzc;

    zza() {
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions build() {
        if (this.zzc == 7) {
            return new zzc(this.zza, false, this.zzb, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" enableGpuDelegateSupport");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" enableTpuDelegateSupport");
        }
        if ((this.zzc & 4) == 0) {
            sb2.append(" enableAutomaticDownload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder setEnableAutomaticDownload(boolean z10) {
        this.zzb = z10;
        this.zzc = (byte) (this.zzc | 4);
        return this;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder setEnableGpuDelegateSupport(boolean z10) {
        this.zza = z10;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder zza(boolean z10) {
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }
}
