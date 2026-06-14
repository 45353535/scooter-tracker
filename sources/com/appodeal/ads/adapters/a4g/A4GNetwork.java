package com.appodeal.ads.adapters.a4g;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.AdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/a4g/A4GNetwork;", "Lcom/appodeal/ads/adapters/admob/AdmobNetwork;", "builder", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class A4GNetwork extends AdmobNetwork {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/a4g/A4GNetwork$builder;", "Lcom/appodeal/ads/adapters/admob/unified/UnifiedAdmobNetwork$builder;", "<init>", "()V", "build", "Lcom/appodeal/ads/adapters/a4g/A4GNetwork;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends UnifiedAdmobNetwork.builder {
        public builder() {
            super("a4g", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public A4GNetwork build() {
            return new A4GNetwork(this);
        }
    }

    public A4GNetwork(@Nullable AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }
}
