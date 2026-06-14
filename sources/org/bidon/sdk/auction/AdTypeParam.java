package org.bidon.sdk.auction;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/auction/AdTypeParam;", "", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "pricefloor", "", "getPricefloor", "()D", "auctionKey", "", "getAuctionKey", "()Ljava/lang/String;", "Banner", "Interstitial", "Rewarded", "Lorg/bidon/sdk/auction/AdTypeParam$Banner;", "Lorg/bidon/sdk/auction/AdTypeParam$Interstitial;", "Lorg/bidon/sdk/auction/AdTypeParam$Rewarded;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdTypeParam {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lorg/bidon/sdk/auction/AdTypeParam$Banner;", "Lorg/bidon/sdk/auction/AdTypeParam;", "activity", "Landroid/app/Activity;", "pricefloor", "", "auctionKey", "", "bannerFormat", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "containerWidth", "", "<init>", "(Landroid/app/Activity;DLjava/lang/String;Lorg/bidon/sdk/ads/banner/BannerFormat;F)V", "getActivity", "()Landroid/app/Activity;", "getPricefloor", "()D", "getAuctionKey", "()Ljava/lang/String;", "getBannerFormat", "()Lorg/bidon/sdk/ads/banner/BannerFormat;", "getContainerWidth", "()F", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements AdTypeParam {

        @NotNull
        private final Activity activity;

        @Nullable
        private final String auctionKey;

        @NotNull
        private final BannerFormat bannerFormat;
        private final float containerWidth;
        private final double pricefloor;

        public Banner(@NotNull Activity activity, double d10, @Nullable String str, @NotNull BannerFormat bannerFormat, float f10) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
            this.activity = activity;
            this.pricefloor = d10;
            this.auctionKey = str;
            this.bannerFormat = bannerFormat;
            this.containerWidth = f10;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        @NotNull
        public Activity getActivity() {
            return this.activity;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        @Nullable
        public String getAuctionKey() {
            return this.auctionKey;
        }

        @NotNull
        public final BannerFormat getBannerFormat() {
            return this.bannerFormat;
        }

        public final float getContainerWidth() {
            return this.containerWidth;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        public double getPricefloor() {
            return this.pricefloor;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/auction/AdTypeParam$Interstitial;", "Lorg/bidon/sdk/auction/AdTypeParam;", "activity", "Landroid/app/Activity;", "pricefloor", "", "auctionKey", "", "<init>", "(Landroid/app/Activity;DLjava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "getPricefloor", "()D", "getAuctionKey", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Interstitial implements AdTypeParam {

        @NotNull
        private final Activity activity;

        @Nullable
        private final String auctionKey;
        private final double pricefloor;

        public Interstitial(@NotNull Activity activity, double d10, @Nullable String str) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.pricefloor = d10;
            this.auctionKey = str;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        @NotNull
        public Activity getActivity() {
            return this.activity;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        @Nullable
        public String getAuctionKey() {
            return this.auctionKey;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        public double getPricefloor() {
            return this.pricefloor;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/auction/AdTypeParam$Rewarded;", "Lorg/bidon/sdk/auction/AdTypeParam;", "activity", "Landroid/app/Activity;", "pricefloor", "", "auctionKey", "", "<init>", "(Landroid/app/Activity;DLjava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "getPricefloor", "()D", "getAuctionKey", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Rewarded implements AdTypeParam {

        @NotNull
        private final Activity activity;

        @Nullable
        private final String auctionKey;
        private final double pricefloor;

        public Rewarded(@NotNull Activity activity, double d10, @Nullable String str) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.pricefloor = d10;
            this.auctionKey = str;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        @NotNull
        public Activity getActivity() {
            return this.activity;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        @Nullable
        public String getAuctionKey() {
            return this.auctionKey;
        }

        @Override // org.bidon.sdk.auction.AdTypeParam
        public double getPricefloor() {
            return this.pricefloor;
        }
    }

    @NotNull
    Activity getActivity();

    @Nullable
    String getAuctionKey();

    double getPricefloor();
}
