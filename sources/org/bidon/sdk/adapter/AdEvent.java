package org.bidon.sdk.adapter;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.rewarded.Reward;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent;", "", LogConstants.EVENT_EXPIRED, "LoadFailed", "Fill", LogConstants.EVENT_CLICKED, LogConstants.EVENT_CLOSED, LogConstants.EVENT_SHOWN, "PaidRevenue", "OnReward", "ShowFailed", "Lorg/bidon/sdk/adapter/AdEvent$Clicked;", "Lorg/bidon/sdk/adapter/AdEvent$Closed;", "Lorg/bidon/sdk/adapter/AdEvent$Expired;", "Lorg/bidon/sdk/adapter/AdEvent$Fill;", "Lorg/bidon/sdk/adapter/AdEvent$LoadFailed;", "Lorg/bidon/sdk/adapter/AdEvent$OnReward;", "Lorg/bidon/sdk/adapter/AdEvent$PaidRevenue;", "Lorg/bidon/sdk/adapter/AdEvent$ShowFailed;", "Lorg/bidon/sdk/adapter/AdEvent$Shown;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdEvent {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$Clicked;", "Lorg/bidon/sdk/adapter/AdEvent;", "ad", "Lorg/bidon/sdk/ads/Ad;", "<init>", "(Lorg/bidon/sdk/ads/Ad;)V", "getAd", "()Lorg/bidon/sdk/ads/Ad;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Clicked implements AdEvent {

        @NotNull
        private final Ad ad;

        public Clicked(@NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            this.ad = ad2;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$Closed;", "Lorg/bidon/sdk/adapter/AdEvent;", "ad", "Lorg/bidon/sdk/ads/Ad;", "<init>", "(Lorg/bidon/sdk/ads/Ad;)V", "getAd", "()Lorg/bidon/sdk/ads/Ad;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Closed implements AdEvent {

        @NotNull
        private final Ad ad;

        public Closed(@NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            this.ad = ad2;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$Expired;", "Lorg/bidon/sdk/adapter/AdEvent;", "ad", "Lorg/bidon/sdk/ads/Ad;", "<init>", "(Lorg/bidon/sdk/ads/Ad;)V", "getAd", "()Lorg/bidon/sdk/ads/Ad;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Expired implements AdEvent {

        @NotNull
        private final Ad ad;

        public Expired(@NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            this.ad = ad2;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$Fill;", "Lorg/bidon/sdk/adapter/AdEvent;", "ad", "Lorg/bidon/sdk/ads/Ad;", "<init>", "(Lorg/bidon/sdk/ads/Ad;)V", "getAd", "()Lorg/bidon/sdk/ads/Ad;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fill implements AdEvent {

        @NotNull
        private final Ad ad;

        public Fill(@NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            this.ad = ad2;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$LoadFailed;", "Lorg/bidon/sdk/adapter/AdEvent;", "cause", "Lorg/bidon/sdk/config/BidonError;", "<init>", "(Lorg/bidon/sdk/config/BidonError;)V", "getCause", "()Lorg/bidon/sdk/config/BidonError;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadFailed implements AdEvent {

        @NotNull
        private final BidonError cause;

        public LoadFailed(@NotNull BidonError cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        @NotNull
        public final BidonError getCause() {
            return this.cause;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$OnReward;", "Lorg/bidon/sdk/adapter/AdEvent;", "ad", "Lorg/bidon/sdk/ads/Ad;", "reward", "Lorg/bidon/sdk/ads/rewarded/Reward;", "<init>", "(Lorg/bidon/sdk/ads/Ad;Lorg/bidon/sdk/ads/rewarded/Reward;)V", "getAd", "()Lorg/bidon/sdk/ads/Ad;", "getReward", "()Lorg/bidon/sdk/ads/rewarded/Reward;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReward implements AdEvent {

        @NotNull
        private final Ad ad;

        @Nullable
        private final Reward reward;

        public OnReward(@NotNull Ad ad2, @Nullable Reward reward) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            this.ad = ad2;
            this.reward = reward;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }

        @Nullable
        public final Reward getReward() {
            return this.reward;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$PaidRevenue;", "Lorg/bidon/sdk/adapter/AdEvent;", "ad", "Lorg/bidon/sdk/ads/Ad;", "adValue", "Lorg/bidon/sdk/logs/analytic/AdValue;", "<init>", "(Lorg/bidon/sdk/ads/Ad;Lorg/bidon/sdk/logs/analytic/AdValue;)V", "getAd", "()Lorg/bidon/sdk/ads/Ad;", "getAdValue", "()Lorg/bidon/sdk/logs/analytic/AdValue;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaidRevenue implements AdEvent {

        @NotNull
        private final Ad ad;

        @NotNull
        private final AdValue adValue;

        public PaidRevenue(@NotNull Ad ad2, @NotNull AdValue adValue) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            this.ad = ad2;
            this.adValue = adValue;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }

        @NotNull
        public final AdValue getAdValue() {
            return this.adValue;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$ShowFailed;", "Lorg/bidon/sdk/adapter/AdEvent;", "cause", "Lorg/bidon/sdk/config/BidonError;", "<init>", "(Lorg/bidon/sdk/config/BidonError;)V", "getCause", "()Lorg/bidon/sdk/config/BidonError;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowFailed implements AdEvent {

        @NotNull
        private final BidonError cause;

        public ShowFailed(@NotNull BidonError cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        @NotNull
        public final BidonError getCause() {
            return this.cause;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdEvent$Shown;", "Lorg/bidon/sdk/adapter/AdEvent;", "ad", "Lorg/bidon/sdk/ads/Ad;", "<init>", "(Lorg/bidon/sdk/ads/Ad;)V", "getAd", "()Lorg/bidon/sdk/ads/Ad;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Shown implements AdEvent {

        @NotNull
        private final Ad ad;

        public Shown(@NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            this.ad = ad2;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }
    }
}
