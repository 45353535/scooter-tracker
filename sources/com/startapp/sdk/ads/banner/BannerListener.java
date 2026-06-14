package com.startapp.sdk.ads.banner;

import android.view.View;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public interface BannerListener {
    @Keep
    void onClick(View view);

    @Keep
    void onFailedToReceiveAd(View view);

    @Keep
    void onImpression(View view);

    @Keep
    void onReceiveAd(View view);
}
