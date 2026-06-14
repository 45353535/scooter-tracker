package com.unity3d.ads.beta;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/beta/BannerLoadOptions;", "", "placementId", "", "bannerSize", "Lkotlin/Pair;", "", "adMarkup", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/BannerShowListener;", "(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/util/Map;Lcom/unity3d/ads/beta/BannerShowListener;)V", "getAdMarkup", "()Ljava/lang/String;", "getBannerSize", "()Lkotlin/Pair;", "getExtras", "()Ljava/util/Map;", "getListener", "()Lcom/unity3d/ads/beta/BannerShowListener;", "getPlacementId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BannerLoadOptions {

    @Nullable
    private final String adMarkup;

    @NotNull
    private final Pair<Integer, Integer> bannerSize;

    @Nullable
    private final Map<String, String> extras;

    @Nullable
    private final BannerShowListener listener;

    @NotNull
    private final String placementId;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/beta/BannerLoadOptions$Builder;", "", "placementId", "", "bannerSize", "Lkotlin/Pair;", "", "(Ljava/lang/String;Lkotlin/Pair;)V", "adMarkup", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/BannerShowListener;", "build", "Lcom/unity3d/ads/beta/BannerLoadOptions;", "withAdMarkup", "withExtras", "withListener", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String adMarkup;

        @NotNull
        private final Pair<Integer, Integer> bannerSize;

        @Nullable
        private Map<String, String> extras;

        @Nullable
        private BannerShowListener listener;

        @NotNull
        private final String placementId;

        public Builder(@NotNull String placementId, @NotNull Pair<Integer, Integer> bannerSize) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
            this.placementId = placementId;
            this.bannerSize = bannerSize;
        }

        @NotNull
        public final BannerLoadOptions build() {
            return new BannerLoadOptions(this.placementId, this.bannerSize, this.adMarkup, this.extras, this.listener);
        }

        @NotNull
        public final Builder withAdMarkup(@NotNull String adMarkup) {
            Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.extras = extras;
            return this;
        }

        @NotNull
        public final Builder withListener(@NotNull BannerShowListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }
    }

    public BannerLoadOptions(@NotNull String placementId, @NotNull Pair<Integer, Integer> bannerSize, @Nullable String str, @Nullable Map<String, String> map, @Nullable BannerShowListener bannerShowListener) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        this.placementId = placementId;
        this.bannerSize = bannerSize;
        this.adMarkup = str;
        this.extras = map;
        this.listener = bannerShowListener;
    }

    @Nullable
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @NotNull
    public final Pair<Integer, Integer> getBannerSize() {
        return this.bannerSize;
    }

    @Nullable
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    public final BannerShowListener getListener() {
        return this.listener;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ BannerLoadOptions(String str, Pair pair, String str2, Map map, BannerShowListener bannerShowListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pair, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : bannerShowListener);
    }
}
