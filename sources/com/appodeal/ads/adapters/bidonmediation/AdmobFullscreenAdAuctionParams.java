package com.appodeal.ads.adapters.bidonmediation;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.auction.models.AdUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/AdmobFullscreenAdAuctionParams;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "activity", "Landroid/app/Activity;", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "<init>", "(Landroid/app/Activity;Lorg/bidon/sdk/auction/models/AdUnit;)V", "getActivity", "()Landroid/app/Activity;", "getAdUnit", "()Lorg/bidon/sdk/auction/models/AdUnit;", "price", "", "getPrice", "()D", "adUnitId", "", "getAdUnitId", "()Ljava/lang/String;", "toString", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobFullscreenAdAuctionParams implements AdAuctionParams {

    @NotNull
    private final Activity activity;

    @NotNull
    private final AdUnit adUnit;

    @Nullable
    private final String adUnitId;
    private final double price;

    public AdmobFullscreenAdAuctionParams(@NotNull Activity activity, @NotNull AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.activity = activity;
        this.adUnit = adUnit;
        this.price = getAdUnit().getPricefloor();
        JSONObject extra = getAdUnit().getExtra();
        this.adUnitId = extra != null ? extra.getString("ad_unit_id") : null;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
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

    @Override // org.bidon.sdk.adapter.AdAuctionParams
    public double getPrice() {
        return this.price;
    }

    @NotNull
    public String toString() {
        return "AdmobFullscreenAdAuctionParams(" + getAdUnit() + ")";
    }
}
