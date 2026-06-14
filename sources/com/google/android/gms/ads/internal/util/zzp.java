package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzp extends BroadcastReceiver {
    /* synthetic */ zzp(zzs zzsVar, byte[] bArr) {
        Objects.requireNonNull(zzsVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.gms.ads.internal.util.client.zzl.zzg();
        zzd.zza(context);
    }
}
