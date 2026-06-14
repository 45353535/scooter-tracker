package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbx extends BroadcastReceiver {
    private final zzdx zza;

    /* synthetic */ zzbx(zzbz zzbzVar, zzdx zzdxVar, zzby zzbyVar, byte[] bArr) {
        Objects.requireNonNull(zzbzVar);
        this.zza = zzdxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzn(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                }
            });
        }
    }
}
