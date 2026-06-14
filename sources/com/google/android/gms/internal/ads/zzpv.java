package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzpv extends BroadcastReceiver {
    final /* synthetic */ zzpx zza;

    /* synthetic */ zzpv(zzpx zzpxVar, byte[] bArr) {
        Objects.requireNonNull(zzpxVar);
        this.zza = zzpxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpx zzpxVar = this.zza;
        zzpxVar.zzf(zzps.zzb(context, intent, zzpxVar.zzj(), zzpxVar.zzh()));
    }
}
