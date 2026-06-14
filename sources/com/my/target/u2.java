package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface u2 {
    String a();

    void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener);

    float b();

    NativeBanner c();

    void handleAdChoicesClick(Context context);

    void registerView(View view, List list, int i10);

    void registerView(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i10);

    void unregisterView();
}
