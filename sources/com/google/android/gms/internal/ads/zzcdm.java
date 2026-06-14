package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcdm {
    public final ListenableFuture zza(Context context, int i10) {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzy(context)) {
            zzcei.zza.execute(new zzcdl(this, context, zzcenVar));
        }
        return zzcenVar;
    }
}
