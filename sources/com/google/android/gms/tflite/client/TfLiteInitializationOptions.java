package com.google.android.gms.tflite.client;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes8.dex */
public abstract class TfLiteInitializationOptions {

    public static abstract class Builder {
        @NonNull
        public abstract TfLiteInitializationOptions build();

        @NonNull
        @ShowFirstParty
        @KeepForSdk
        public abstract Builder setEnableAutomaticDownload(boolean z10);

        @NonNull
        public abstract Builder setEnableGpuDelegateSupport(boolean z10);

        @NonNull
        public abstract Builder zza(boolean z10);
    }

    @NonNull
    public static Builder builder() {
        zza zzaVar = new zza();
        zzaVar.setEnableGpuDelegateSupport(false);
        zzaVar.zza(false);
        zzaVar.setEnableAutomaticDownload(false);
        return zzaVar;
    }

    @ShowFirstParty
    @KeepForSdk
    public abstract boolean enableAutomaticDownload();

    public abstract boolean enableGpuDelegateSupport();

    public abstract boolean zza();

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static Builder builder(@NonNull TfLiteInitializationOptions tfLiteInitializationOptions) {
        Builder builder = builder();
        builder.setEnableGpuDelegateSupport(tfLiteInitializationOptions.enableGpuDelegateSupport());
        tfLiteInitializationOptions.zza();
        builder.zza(false);
        builder.setEnableAutomaticDownload(tfLiteInitializationOptions.enableAutomaticDownload());
        return builder;
    }
}
