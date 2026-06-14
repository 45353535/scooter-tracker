package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdc extends BroadcastReceiver {
    final /* synthetic */ zzbdg zza;

    zzbdc(zzbdg zzbdgVar) {
        Objects.requireNonNull(zzbdgVar);
        this.zza = zzbdgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg(3);
    }
}
