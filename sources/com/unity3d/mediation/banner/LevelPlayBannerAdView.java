package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.C4600w7;
import com.ironsource.Ca;
import com.ironsource.V2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ca f67890a;

    public static final class Config {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final LevelPlayAdSize f67891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Double f67892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f67893c;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            private LevelPlayAdSize f67894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private Double f67895b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private String f67896c;

            @NotNull
            public final Config build() {
                return new Config(this.f67894a, this.f67895b, this.f67896c);
            }

            @NotNull
            public final Builder setAdSize(@NotNull LevelPlayAdSize adSize) {
                Intrinsics.checkNotNullParameter(adSize, "adSize");
                this.f67894a = adSize;
                return this;
            }

            @NotNull
            public final Builder setBidFloor(double d10) {
                this.f67895b = Double.valueOf(d10);
                return this;
            }

            @NotNull
            public final Builder setPlacementName(@NotNull String placementName) {
                Intrinsics.checkNotNullParameter(placementName, "placementName");
                this.f67896c = placementName;
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                levelPlayAdSize = config.f67891a;
            }
            if ((i10 & 2) != 0) {
                d10 = config.f67892b;
            }
            if ((i10 & 4) != 0) {
                str = config.f67893c;
            }
            return config.copy(levelPlayAdSize, d10, str);
        }

        @Nullable
        public final LevelPlayAdSize component1() {
            return this.f67891a;
        }

        @Nullable
        public final Double component2() {
            return this.f67892b;
        }

        @Nullable
        public final String component3() {
            return this.f67893c;
        }

        @NotNull
        public final Config copy(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d10, @Nullable String str) {
            return new Config(levelPlayAdSize, d10, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.areEqual(this.f67891a, config.f67891a) && Intrinsics.areEqual((Object) this.f67892b, (Object) config.f67892b) && Intrinsics.areEqual(this.f67893c, config.f67893c);
        }

        @Nullable
        public final LevelPlayAdSize getAdSize() {
            return this.f67891a;
        }

        @Nullable
        public final Double getBidFloor() {
            return this.f67892b;
        }

        @Nullable
        public final String getPlacementName() {
            return this.f67893c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f67891a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d10 = this.f67892b;
            int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str = this.f67893c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Config(adSize=" + this.f67891a + ", bidFloor=" + this.f67892b + ", placementName=" + this.f67893c + ")";
        }

        public Config(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d10, @Nullable String str) {
            this.f67891a = levelPlayAdSize;
            this.f67892b = d10;
            this.f67893c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : levelPlayAdSize, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Ca a(String str, Config config) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        V2 v2A = a(context);
        addView(v2A);
        return new Ca(C4600w7.f45720a.a(), str, v2A, config, null, 16, null);
    }

    public final void destroy() {
        this.f67890a.b();
    }

    @NotNull
    public final String getAdId() {
        String string = this.f67890a.c().toString();
        Intrinsics.checkNotNullExpressionValue(string, "bannerViewInternal.adId.toString()");
        return string;
    }

    @NotNull
    public final LevelPlayAdSize getAdSize() {
        return this.f67890a.d();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f67890a.e();
    }

    @Nullable
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f67890a.f();
    }

    @NotNull
    public final String getPlacementName() {
        return this.f67890a.g();
    }

    public final void loadAd() {
        this.f67890a.i();
    }

    public final void pauseAutoRefresh() {
        this.f67890a.j();
    }

    public final void resumeAutoRefresh() {
        this.f67890a.k();
    }

    public final void setBannerListener(@Nullable LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f67890a.a(levelPlayBannerAdViewListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("context: " + context.getClass().getSimpleName());
        Pair<String, Config> pairA = Ca.f40486n.a(context, attributeSet);
        this.f67890a = a(pairA.component1(), pairA.component2());
    }

    private final V2 a(Context context) {
        V2 v22 = new V2(context);
        v22.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return v22;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String adUnitId) {
        this(context, adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String adUnitId, @NotNull Config config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f67890a = a(adUnitId, config);
    }
}
