package com.pubmatic.sdk.common.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface POBInterstitialRendering {
    void destroy();

    void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    void setAdRendererListener(@Nullable POBInterstitialRendererListener pOBInterstitialRendererListener);

    void setVideoAdEventListener(@Nullable POBVideoAdEventListener pOBVideoAdEventListener);

    void setWatermark(@Nullable String str);

    void show(int i10);
}
