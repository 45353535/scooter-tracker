package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzekc {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    zzekc(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            MeasurementManagerFutures measurementManagerFuturesFrom = MeasurementManagerFutures.from(this.zzb);
            this.zza = measurementManagerFuturesFrom;
            return measurementManagerFuturesFrom == null ? zzgzo.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesFrom.getMeasurementApiStatusAsync();
        } catch (Exception e10) {
            return zzgzo.zzc(e10);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
        } catch (Exception e10) {
            return zzgzo.zzc(e10);
        }
    }
}
