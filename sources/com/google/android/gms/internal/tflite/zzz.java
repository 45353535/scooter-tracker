package com.google.android.gms.internal.tflite;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class zzz {
    private String zza = null;

    public final zzz zza(String str) {
        String.format(Locale.ROOT, "TFLiteClient-%d", 0);
        this.zza = "TFLiteClient-%d";
        return this;
    }

    public final ThreadFactory zzb() {
        String str = this.zza;
        return new zzy(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, null, null, null);
    }
}
