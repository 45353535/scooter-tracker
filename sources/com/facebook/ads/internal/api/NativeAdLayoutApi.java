package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface NativeAdLayoutApi extends AdComponentViewApiProvider {
    void initialize(NativeAdLayout nativeAdLayout);

    void setMaxWidth(int i10);

    void setMinWidth(int i10);
}
