package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbaq extends BroadcastReceiver {
    final /* synthetic */ zzbar zza;

    zzbaq(zzbar zzbarVar) {
        Objects.requireNonNull(zzbarVar);
        this.zza = zzbarVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
