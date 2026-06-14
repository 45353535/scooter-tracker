package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzetb implements zzgyw {
    static final /* synthetic */ zzetb zza = new zzetb();

    private /* synthetic */ zzetb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgzo.zza(new zzete(Integer.toString(17))) : zzgzo.zza(new zzete(null));
    }
}
