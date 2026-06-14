package org.bidon.sdk.adapter;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.ResultExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lorg/bidon/sdk/adapter/AdAuctionParamSource;", "", "Landroid/app/Activity;", "activity", "", "pricefloor", "Lorg/bidon/sdk/auction/models/AdUnit;", "adUnit", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "optBannerFormat", "", "optContainerWidth", "<init>", "(Landroid/app/Activity;DLorg/bidon/sdk/auction/models/AdUnit;Lorg/bidon/sdk/ads/banner/BannerFormat;Ljava/lang/Float;)V", "T", "Lkotlin/Function1;", "data", "Lkotlin/Result;", "invoke-IoAF18A", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "invoke", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "D", "getPricefloor", "()D", "Lorg/bidon/sdk/auction/models/AdUnit;", "getAdUnit", "()Lorg/bidon/sdk/auction/models/AdUnit;", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "Ljava/lang/Float;", "getBannerFormat", "()Lorg/bidon/sdk/ads/banner/BannerFormat;", "bannerFormat", "getContainerWidth", "()F", "containerWidth", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdAuctionParamSource {

    @NotNull
    private final Activity activity;

    @NotNull
    private final AdUnit adUnit;

    @Nullable
    private final BannerFormat optBannerFormat;

    @Nullable
    private final Float optContainerWidth;
    private final double pricefloor;

    public AdAuctionParamSource(@NotNull Activity activity, double d10, @NotNull AdUnit adUnit, @Nullable BannerFormat bannerFormat, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.activity = activity;
        this.pricefloor = d10;
        this.adUnit = adUnit;
        this.optBannerFormat = bannerFormat;
        this.optContainerWidth = f10;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final AdUnit getAdUnit() {
        return this.adUnit;
    }

    @NotNull
    public final BannerFormat getBannerFormat() {
        BannerFormat bannerFormat = this.optBannerFormat;
        if (bannerFormat != null) {
            return bannerFormat;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final float getContainerWidth() {
        Float f10 = this.optContainerWidth;
        if (f10 != null) {
            return f10.floatValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final double getPricefloor() {
        return this.pricefloor;
    }

    @NotNull
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final <T> Object m8670invokeIoAF18A(@NotNull Function1<? super AdAuctionParamSource, ? extends T> data) {
        Object objB;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(data.invoke(this));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (!Result.i(objB)) {
            return objB;
        }
        Throwable thG = Result.g(objB);
        LogExtKt.logError("AdAuctionParamSource", String.valueOf(thG != null ? thG.getMessage() : null), thG);
        return ResultExtKt.asFailure(BidonError.NoAppropriateAdUnitId.INSTANCE);
    }
}
