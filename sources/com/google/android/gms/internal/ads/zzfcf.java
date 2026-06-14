package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzfcf implements zzgyw {
    static final /* synthetic */ zzfcf zza = new zzfcf();

    private /* synthetic */ zzfcf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgzo.zza(new zzfch(null, -1)) : zzgzo.zza(new zzfch(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
