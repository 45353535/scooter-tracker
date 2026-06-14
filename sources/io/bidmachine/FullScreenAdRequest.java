package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.AdRequest;
import io.bidmachine.FullScreenAdRequest;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FullScreenAdRequest<SelfType extends FullScreenAdRequest<SelfType>> extends AdRequest<SelfType, FullScreenAdRequestParameters, od.j> {

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class FullScreenRequestBuilder<SelfType extends FullScreenRequestBuilder<SelfType, ReturnType>, ReturnType extends FullScreenAdRequest<ReturnType>> extends AdRequest.AdRequestBuilderImpl<SelfType, ReturnType, FullScreenAdRequestParameters> {
        protected FullScreenRequestBuilder(@NonNull AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        protected SelfType setAdContentType(@NonNull AdContentType adContentType) {
            return this;
        }
    }

    private static class b extends UnifiedAdRequestParamsImpl implements od.j {
        private b(FullScreenAdRequestParameters fullScreenAdRequestParameters, TargetingParams targetingParams, zb.d dVar) {
            super(fullScreenAdRequestParameters, targetingParams, dVar);
        }
    }

    protected FullScreenAdRequest(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    @NonNull
    public AdContentType getAdContentType() {
        return getAdRequestParameters().getAdContentType();
    }

    @Override // io.bidmachine.AdRequest
    boolean isPlacementBuilderMatch(@NonNull w8.n nVar) {
        return super.isPlacementBuilderMatch(nVar) && getAdRequestParameters().isContentTypeMatch(nVar.g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    @NonNull
    public od.j createUnifiedAdRequestParams(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters, @NonNull TargetingParams targetingParams, @NonNull zb.d dVar) {
        return new b(fullScreenAdRequestParameters, targetingParams, dVar);
    }
}
