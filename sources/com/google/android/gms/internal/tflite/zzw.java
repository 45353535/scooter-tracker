package com.google.android.gms.internal.tflite;

/* JADX INFO: loaded from: classes8.dex */
final class zzw implements zzu {
    private static final zzu zza = new zzu() { // from class: com.google.android.gms.internal.tflite.zzv
    };
    private volatile zzu zzb;

    zzw(zzu zzuVar) {
        this.zzb = zzuVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned null>";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}
