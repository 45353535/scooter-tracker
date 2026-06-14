package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.NativeBannerAdView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface INativeBannerAd extends IAd {
    void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder);

    void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder, @Nullable List<View> list);

    void registerView(@NonNull NativeBannerAdView nativeBannerAdView);

    void registerView(@NonNull NativeBannerAdView nativeBannerAdView, @Nullable List<View> list);
}
