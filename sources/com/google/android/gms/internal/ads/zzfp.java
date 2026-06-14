package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfp {
    private boolean zza;

    public zzfp(Context context, Looper looper, zzdn zzdnVar) {
        context.getApplicationContext();
        zzdnVar.zzd(looper, null);
        zzdnVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z10) {
        if (this.zza == z10) {
            return;
        }
        this.zza = z10;
    }
}
