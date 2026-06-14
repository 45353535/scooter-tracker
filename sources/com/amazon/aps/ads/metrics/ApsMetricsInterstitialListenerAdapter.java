package com.amazon.aps.ads.metrics;

import android.view.View;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/amazon/aps/ads/metrics/ApsMetricsInterstitialListenerAdapter;", "Lcom/amazon/aps/ads/metrics/ApsMetricsAdListenerAdapterBase;", "Lcom/amazon/device/ads/DTBAdInterstitialListener;", "bidId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/amazon/device/ads/DTBAdInterstitialListener;)V", "getBidId", "()Ljava/lang/String;", "setBidId", "(Ljava/lang/String;)V", "getListener", "()Lcom/amazon/device/ads/DTBAdInterstitialListener;", "onVideoCompleted", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsMetricsInterstitialListenerAdapter extends ApsMetricsAdListenerAdapterBase implements DTBAdInterstitialListener {

    @Nullable
    private String bidId;

    @Nullable
    private final DTBAdInterstitialListener listener;

    public ApsMetricsInterstitialListenerAdapter(@Nullable String str, @Nullable DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(str, dTBAdInterstitialListener);
        this.bidId = str;
        this.listener = dTBAdInterstitialListener;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    @Nullable
    public String getBidId() {
        return this.bidId;
    }

    @Override // com.amazon.device.ads.DTBAdVideoListener
    public void onVideoCompleted(@Nullable View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdInterstitialListener listener = getListener();
        if (listener != null) {
            listener.onVideoCompleted(view);
        }
        ApsMetrics.INSTANCE.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withVideoCompletedEvent(jCurrentTimeMillis));
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public void setBidId(@Nullable String str) {
        this.bidId = str;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    @Nullable
    public DTBAdInterstitialListener getListener() {
        return this.listener;
    }
}
