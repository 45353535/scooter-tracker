package com.google.android.gms.internal.tflite;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
final class zzo extends zzr {
    private final Context zza;
    private final zzu zzb;

    zzo(Context context, zzu zzuVar) {
        this.zza = context;
        this.zzb = zzuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (this.zza.equals(zzrVar.zza()) && this.zzb.equals(zzrVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        zzu zzuVar = this.zzb;
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + zzuVar.toString() + "}";
    }

    @Override // com.google.android.gms.internal.tflite.zzr
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.tflite.zzr
    final zzu zzb() {
        return this.zzb;
    }
}
