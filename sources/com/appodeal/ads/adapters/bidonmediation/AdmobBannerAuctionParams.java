package com.appodeal.ads.adapters.bidonmediation;

import android.app.Activity;
import com.appodeal.ads.adapters.bidonmediation.ext.ExtKt;
import com.google.android.gms.ads.AdSize;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001c\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/AdmobBannerAuctionParams;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "activity", "Landroid/app/Activity;", "bannerFormat", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "<init>", "(Landroid/app/Activity;Lorg/bidon/sdk/ads/banner/BannerFormat;Lorg/bidon/sdk/auction/models/AdUnit;)V", "getActivity", "()Landroid/app/Activity;", "getBannerFormat", "()Lorg/bidon/sdk/ads/banner/BannerFormat;", "getAdUnit", "()Lorg/bidon/sdk/auction/models/AdUnit;", "price", "", "getPrice", "()D", C4240b4.i.O, "Lcom/google/android/gms/ads/AdSize;", "getAdSize", "()Lcom/google/android/gms/ads/AdSize;", "adUnitId", "", "getAdUnitId", "()Ljava/lang/String;", "toString", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobBannerAuctionParams implements AdAuctionParams {

    @NotNull
    private final Activity activity;

    @NotNull
    private final AdUnit adUnit;

    @Nullable
    private final String adUnitId;

    @NotNull
    private final BannerFormat bannerFormat;
    private final double price;

    public AdmobBannerAuctionParams(@NotNull Activity activity, @NotNull BannerFormat bannerFormat, @NotNull AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.activity = activity;
        this.bannerFormat = bannerFormat;
        this.adUnit = adUnit;
        this.price = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.adUnitId = extra != null ? extra.getString("ad_unit_id") : null;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final AdSize getAdSize() {
        return ExtKt.toAdmobAdSize(this.bannerFormat);
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    @NotNull
    public AdUnit getAdUnit() {
        return this.adUnit;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final BannerFormat getBannerFormat() {
        return this.bannerFormat;
    }

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.price;
    }

    @NotNull
    public String toString() {
        return "AdmobBannerAuctionParams(" + getAdUnit() + ")";
    }
}
