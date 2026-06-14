package l9;

import io.bidmachine.AdContentType;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import java.util.List;
import zb.f;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends FullScreenAdRequest {

    public static final class b extends FullScreenAdRequest.FullScreenRequestBuilder {
        public b() {
            this(AdPlacementConfig.interstitialBuilder().build());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
            return new d(fullScreenAdRequestParameters);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FullScreenAdRequestParameters createAdRequestParameters() {
            return new l9.b(this.adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        @Override // io.bidmachine.FullScreenAdRequest.FullScreenRequestBuilder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b setAdContentType(AdContentType adContentType) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder(AdFormat.createInterstitial(adContentType)).build();
            return this;
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setBidPayload(String str) {
            return super.setBidPayload(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setCustomParams(CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setListener(AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setLoadingTimeOut(Integer num) {
            return super.setLoadingTimeOut(num);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setNetworks(String str) {
            return super.setNetworks(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setPlacementId(String str) {
            return super.setPlacementId(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, zb.f
        public /* bridge */ /* synthetic */ f setPriceFloorParams(PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setSessionAdParams(SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setTargetingParams(TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }

        public b(AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setNetworks(List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }
    }

    private d(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }
}
