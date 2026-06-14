package com.google.android.gms.internal.play_billing;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
final class zzbx {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzbx(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + C4240b4.j.f42668b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + C4240b4.j.f42668b + String.valueOf(obj));
    }
}
