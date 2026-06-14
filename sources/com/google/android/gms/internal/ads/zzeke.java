package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeke {
    private final Context zza;

    zzeke(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z10) {
        try {
            GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z10).build();
            TopicsManagerFutures topicsManagerFuturesFrom = TopicsManagerFutures.from(this.zza);
            return topicsManagerFuturesFrom != null ? topicsManagerFuturesFrom.getTopicsAsync(getTopicsRequestBuild) : zzgzo.zzc(new IllegalStateException());
        } catch (Exception e10) {
            return zzgzo.zzc(e10);
        }
    }
}
