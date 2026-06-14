package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.ironsource.C4264cb;
import com.ironsource.C4310f6;
import com.ironsource.C4441n0;
import com.ironsource.C4600w7;
import com.ironsource.D0;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4496q4;
import com.ironsource.Za;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayInterstitialAd {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4264cb f67900b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPlacementCapped(@NotNull String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            return Za.f42251n.a(placementName, LevelPlay.AdFormat.INTERSTITIAL);
        }

        private Companion() {
        }
    }

    public static final class Config implements Za.b {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Double f67901a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            private Double f67902a;

            @NotNull
            public final Config build() {
                return new Config(this.f67902a);
            }

            @NotNull
            public final Builder setBidFloor(double d10) {
                this.f67902a = Double.valueOf(d10);
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = config.f67901a;
            }
            return config.copy(d10);
        }

        @Nullable
        public final Double component1() {
            return this.f67901a;
        }

        @NotNull
        public final Config copy(@Nullable Double d10) {
            return new Config(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.areEqual((Object) this.f67901a, (Object) ((Config) obj).f67901a);
        }

        @Override // com.ironsource.Za.b
        @Nullable
        public Double getBidFloor() {
            return this.f67901a;
        }

        public int hashCode() {
            Double d10 = this.f67901a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(bidFloor=" + this.f67901a + ")";
        }

        public Config(@Nullable Double d10) {
            this.f67901a = d10;
        }

        public /* synthetic */ Config(Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : d10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(@NotNull String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public static final boolean isPlacementCapped(@NotNull String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    @NotNull
    public final String getAdId() {
        return this.f67900b.b();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f67899a;
    }

    public final boolean isAdReady() {
        return this.f67900b.c();
    }

    public final void loadAd() {
        this.f67900b.d();
    }

    public final void setListener(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.f67900b.a(levelPlayInterstitialAdListener);
    }

    public final void showAd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(@NotNull String adUnitId, @NotNull Config config) {
        this(adUnitId, new Za.c(new C4441n0(IronSource.a.INTERSTITIAL, D0.b.MEDIATION), new C4310f6(), Ib.f41088s.d(), new InterfaceC4496q4.a(), C4600w7.f45720a, config));
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    public final void showAd(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f67900b.a(activity, str);
    }

    public LevelPlayInterstitialAd(@NotNull String adUnitId, @NotNull Za.c payload) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.c());
        this.f67899a = adUnitId;
        this.f67900b = new C4264cb(adUnitId, payload.c(), payload.b(), payload.a(), payload.f(), payload.d(), payload.e());
    }
}
