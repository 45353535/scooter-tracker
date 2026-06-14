package com.appodeal.ads.adapters.gam;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.notsy.NotsyNetwork;
import io.bidmachine.ads.networks.gam.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/gam/GamNetwork;", "Lcom/appodeal/ads/adapters/notsy/NotsyNetwork;", "builder", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GamNetwork extends NotsyNetwork {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/gam/GamNetwork$builder;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobNetwork$builder;", "<init>", "()V", "build", "Lcom/appodeal/ads/adapters/gam/GamNetwork;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends UnifiedAdmobNetwork.builder {
        public builder() {
            super(BuildConfig.ADAPTER_NAME, "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public GamNetwork build() {
            return new GamNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamNetwork(@NotNull AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
    }
}
