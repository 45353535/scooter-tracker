package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzcqt implements zzgyw {
    static final /* synthetic */ zzcqt zza = new zzcqt();

    private /* synthetic */ zzcqt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlS)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgzo.zza(new GetTopicsResponse(zzguf.zzi()));
    }
}
