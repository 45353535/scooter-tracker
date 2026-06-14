package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzcf extends BroadcastReceiver {
    final /* synthetic */ zzcg zza;

    zzcf(zzcg zzcgVar) {
        Objects.requireNonNull(zzcgVar);
        this.zza = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd(context, intent);
    }
}
