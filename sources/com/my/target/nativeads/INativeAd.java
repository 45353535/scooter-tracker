package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.NativeAdView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface INativeAd extends IAd {
    void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder);

    void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder, @Nullable List<View> list);

    void registerView(@NonNull NativeAdView nativeAdView);

    void registerView(@NonNull NativeAdView nativeAdView, @Nullable List<View> list);
}
