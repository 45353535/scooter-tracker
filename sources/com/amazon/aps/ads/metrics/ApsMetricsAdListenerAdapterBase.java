package com.amazon.aps.ads.metrics;

import android.view.View;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.aps.shared.metrics.model.ApsMetricsResult;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Df;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/amazon/aps/ads/metrics/ApsMetricsAdListenerAdapterBase;", "Lcom/amazon/device/ads/DTBAdListener;", "bidId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/amazon/device/ads/DTBAdListener;)V", "getBidId", "()Ljava/lang/String;", "setBidId", "(Ljava/lang/String;)V", "getListener", "()Lcom/amazon/device/ads/DTBAdListener;", "onAdLoaded", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "onAdFailed", Df.f40645f, "isAllowedToCaptureExtendedMetrics", "", Df.f40650k, "onAdOpen", Df.f40646g, "onImpressionFired", TelemetryAdLifecycleEvent.AD_ERROR, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsMetricsAdListenerAdapterBase implements DTBAdListener {

    @Nullable
    private String bidId;

    @Nullable
    private final DTBAdListener listener;

    public ApsMetricsAdListenerAdapterBase(@Nullable String str, @Nullable DTBAdListener dTBAdListener) {
        this.bidId = str;
        this.listener = dTBAdListener;
    }

    @Nullable
    public String getBidId() {
        return this.bidId;
    }

    @Nullable
    public DTBAdListener getListener() {
        return this.listener;
    }

    public final boolean isAllowedToCaptureExtendedMetrics() {
        return DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_APSMETRICS_EXTENDED_METRICS, false);
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClicked(@Nullable View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdClicked(view);
        }
        if (isAllowedToCaptureExtendedMetrics()) {
            ApsMetrics.INSTANCE.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdClickEvent(jCurrentTimeMillis));
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClosed(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdClosed(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdError(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdError(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdFailed(@Nullable View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdFailed(view);
        }
        ApsMetrics.INSTANCE.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchEndTime(ApsMetricsResult.Failure, jCurrentTimeMillis));
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLeftApplication(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdLeftApplication(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLoaded(@Nullable View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdLoaded(view);
        }
        ApsMetrics.INSTANCE.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchEndTime(ApsMetricsResult.Success, jCurrentTimeMillis));
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdOpen(@Nullable View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdOpen(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onImpressionFired(@Nullable View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onImpressionFired(view);
        }
        ApsMetrics.INSTANCE.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdImpressionEndTime(ApsMetricsResult.Success, jCurrentTimeMillis));
    }

    public void setBidId(@Nullable String str) {
        this.bidId = str;
    }
}
