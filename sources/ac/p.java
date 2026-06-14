package ac;

import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends AdRequest {

    public static final class b extends AdRequest.AdRequestBuilderImpl {
        public b() {
            this(AdPlacementConfig.nativeBuilder().build());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p build(h hVar) {
            return new p(hVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h createAdRequestParameters() {
            return new h(this.adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        public b c(MediaAssetType... mediaAssetTypeArr) {
            if (mediaAssetTypeArr.length == 0) {
                return this;
            }
            this.adPlacementConfig = this.adPlacementConfig.newBuilder(AdFormat.createNative(Arrays.asList(mediaAssetTypeArr))).build();
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

        public b(AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ zb.f setNetworks(List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }
    }

    private static class c extends UnifiedAdRequestParamsImpl implements od.n {
        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, od.d, od.n
        public /* bridge */ /* synthetic */ h getAdRequestParameters() {
            return (h) super.getAdRequestParameters();
        }

        private c(h hVar, TargetingParams targetingParams, zb.d dVar) {
            super(hVar, targetingParams, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public od.n createUnifiedAdRequestParams(h hVar, TargetingParams targetingParams, zb.d dVar) {
        return new c(hVar, targetingParams, dVar);
    }

    @Override // io.bidmachine.AdRequest
    protected void processBidPayload(ResponsePayload responsePayload) {
        ((h) getAdRequestParameters()).d(false);
        super.processBidPayload(responsePayload);
    }

    private p(h hVar) {
        super(hVar);
    }
}
