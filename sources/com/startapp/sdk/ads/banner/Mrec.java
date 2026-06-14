package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.r1;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class Mrec extends BannerStandard {
    @Keep
    public Mrec(Activity activity) {
        super(activity);
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    protected String getBannerName() {
        return "StartApp Mrec";
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard
    protected int getBannerType() {
        return 1;
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    protected int getHeightInDp() {
        return 250;
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    protected int getWidthInDp() {
        return 300;
    }

    @Keep
    public Mrec(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    @Keep
    public Mrec(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    @Keep
    public Mrec(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    @Keep
    public Mrec(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    @Keep
    public Mrec(Activity activity, AttributeSet attributeSet, int i10) {
        super(activity, attributeSet, i10);
    }

    @Keep
    @Deprecated
    public Mrec(Context context) {
        super(context);
    }

    @Keep
    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Keep
    @Deprecated
    public Mrec(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Keep
    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Keep
    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Keep
    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    Mrec(Context context, boolean z10, AdPreferences adPreferences, r1 r1Var) {
        super(context, z10, adPreferences, r1Var);
    }
}
