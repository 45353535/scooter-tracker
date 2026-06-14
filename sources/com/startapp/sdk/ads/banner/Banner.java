package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.r1;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class Banner extends BannerStandard {
    @Keep
    public Banner(Context context) {
        super(context);
    }

    @Keep
    public Banner(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Keep
    public Banner(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Keep
    public Banner(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Keep
    public Banner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Keep
    public Banner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Keep
    Banner(Context context, boolean z10, AdPreferences adPreferences, r1 r1Var) {
        super(context, z10, adPreferences, r1Var);
    }
}
