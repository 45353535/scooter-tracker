package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.common.ExternalClickHandler;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface t2 {
    String a();

    void a(View view, List list, int i10, MediaAdView mediaAdView);

    void a(ExternalClickHandler externalClickHandler);

    void a(NativeAd.NativeAdMediaListener nativeAdMediaListener);

    float b();

    NativePromoBanner d();

    void handleAdChoicesClick(Context context);

    void registerView(NativeAdViewBinder nativeAdViewBinder, List list, int i10);

    void unregisterView();
}
