package u8;

import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.BannerAdSize;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import java.util.List;
import od.g;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends AdRequest {

    private static class b extends UnifiedAdRequestParamsImpl implements g {
        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, od.d, od.n
        public /* bridge */ /* synthetic */ u8.b getAdRequestParameters() {
            return (u8.b) super.getAdRequestParameters();
        }

        private b(u8.b bVar, TargetingParams targetingParams, zb.d dVar) {
            super(bVar, targetingParams, dVar);
        }
    }

    public static final class c extends AdRequest.AdRequestBuilderImpl {
        public c() {
            super(AdPlacementConfig.bannerBuilder().build());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build(u8.b bVar) {
            return new d(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u8.b createAdRequestParameters() {
            return new u8.b(this.adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        public c c(e eVar) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder(AdFormat.createBanner(e.h(eVar))).build();
            return this;
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setBidPayload(String str) {
            return super.setBidPayload(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setCustomParams(CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setListener(AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setLoadingTimeOut(Integer num) {
            return super.setLoadingTimeOut(num);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setNetworks(String str) {
            return super.setNetworks(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setPlacementId(String str) {
            return super.setPlacementId(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, zb.f
        public /* bridge */ /* synthetic */ zb.f setPriceFloorParams(PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setSessionAdParams(SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setTargetingParams(TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }

        public c(AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setNetworks(List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public g createUnifiedAdRequestParams(u8.b bVar, TargetingParams targetingParams, zb.d dVar) {
        return new b(bVar, targetingParams, dVar);
    }

    public BannerAdSize k() {
        return ((u8.b) getAdRequestParameters()).a();
    }

    private d(u8.b bVar) {
        super(bVar);
    }
}
