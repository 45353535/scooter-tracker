package io.bidmachine.ads.networks.adaptiverendering;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0006"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingConfig;", "Lio/bidmachine/NetworkConfig;", "()V", "createNetworkAdapter", "Lio/bidmachine/NetworkAdapter;", com.taurusx.tax.f.y.f66058y, "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingConfig extends NetworkConfig {

    @NotNull
    public static final String NATIVE_FEATURES_KEY = "features";

    public AdaptiveRenderingConfig() {
        super(AdaptiveRenderingAdapter.KEY, null);
    }

    @Override // io.bidmachine.NetworkConfig
    @NotNull
    protected NetworkAdapter createNetworkAdapter() {
        return new AdaptiveRenderingAdapter();
    }
}
