package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface AdListener {
    @Benchmark
    void onAdClicked(Ad ad2);

    @Benchmark
    void onAdLoaded(Ad ad2);

    @Benchmark
    void onError(Ad ad2, AdError adError);

    @Benchmark
    void onLoggingImpression(Ad ad2);
}
