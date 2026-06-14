package com.pubmatic.sdk.video.renderer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.ui.POBBannerRendering;

/* JADX INFO: loaded from: classes11.dex */
public interface POBVideoRendering extends POBBannerRendering {
    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    void destroy();

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    /* synthetic */ void invalidateExpiration();

    void proceedAdSkip(boolean z10);

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    /* synthetic */ void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    /* synthetic */ void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener);

    void setVideoRenderingListener(@Nullable POBVideoRenderingListener pOBVideoRenderingListener);

    void setVideoSkipEventListener(@Nullable POBVideoSkipEventListener pOBVideoSkipEventListener);

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    /* synthetic */ void setWatermark(@Nullable String str);
}
