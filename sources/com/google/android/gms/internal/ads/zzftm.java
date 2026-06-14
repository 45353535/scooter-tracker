package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zzftm {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzftm zza = new zzftm();
    private Context zzb;

    private zzftm() {
    }

    public static zzftm zza() {
        return zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
