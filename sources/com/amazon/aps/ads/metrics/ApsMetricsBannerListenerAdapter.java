package com.amazon.aps.ads.metrics;

import com.amazon.device.ads.DTBAdBannerListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/aps/ads/metrics/ApsMetricsBannerListenerAdapter;", "Lcom/amazon/aps/ads/metrics/ApsMetricsAdListenerAdapterBase;", "Lcom/amazon/device/ads/DTBAdBannerListener;", "bidId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/amazon/device/ads/DTBAdBannerListener;)V", "getBidId", "()Ljava/lang/String;", "setBidId", "(Ljava/lang/String;)V", "getListener", "()Lcom/amazon/device/ads/DTBAdBannerListener;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsMetricsBannerListenerAdapter extends ApsMetricsAdListenerAdapterBase implements DTBAdBannerListener {

    @Nullable
    private String bidId;

    @Nullable
    private final DTBAdBannerListener listener;

    public ApsMetricsBannerListenerAdapter(@Nullable String str, @Nullable DTBAdBannerListener dTBAdBannerListener) {
        super(str, dTBAdBannerListener);
        this.bidId = str;
        this.listener = dTBAdBannerListener;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    @Nullable
    public String getBidId() {
        return this.bidId;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public void setBidId(@Nullable String str) {
        this.bidId = str;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    @Nullable
    public DTBAdBannerListener getListener() {
        return this.listener;
    }
}
