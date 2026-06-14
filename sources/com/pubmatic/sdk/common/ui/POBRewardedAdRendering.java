package com.pubmatic.sdk.common.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface POBRewardedAdRendering {
    void destroy();

    void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    void setAdRendererListener(@NonNull POBRewardedAdRendererListener pOBRewardedAdRendererListener);

    void setWatermark(@Nullable String str);

    void show();
}
