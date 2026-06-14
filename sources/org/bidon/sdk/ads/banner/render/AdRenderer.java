package org.bidon.sdk.ads.banner.render;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import androidx.webkit.Profile;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.ads.banner.BannerPosition;
import org.bidon.sdk.ads.banner.BannerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer;", "", Reporting.EventType.RENDER, "", "activity", "Landroid/app/Activity;", "bannerView", "Lorg/bidon/sdk/ads/banner/BannerView;", "positionState", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState;", "animate", "", "handleConfigurationChanges", "renderListener", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderListener;", MenuActionType.HIDE, "destroy", "RenderListener", "RenderInspector", "AdContainerParams", "PositionState", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdRenderer {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer$AdContainerParams;", "", "offset", "Landroid/graphics/Point;", Key.ROTATION, "", "pivot", "Landroid/graphics/PointF;", "<init>", "(Landroid/graphics/Point;ILandroid/graphics/PointF;)V", "getOffset", "()Landroid/graphics/Point;", "getRotation", "()I", "getPivot", "()Landroid/graphics/PointF;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdContainerParams {

        @NotNull
        private final Point offset;

        @NotNull
        private final PointF pivot;
        private final int rotation;

        public AdContainerParams(@NotNull Point offset, int i10, @NotNull PointF pivot) {
            Intrinsics.checkNotNullParameter(offset, "offset");
            Intrinsics.checkNotNullParameter(pivot, "pivot");
            this.offset = offset;
            this.rotation = i10;
            this.pivot = pivot;
        }

        public static /* synthetic */ AdContainerParams copy$default(AdContainerParams adContainerParams, Point point, int i10, PointF pointF, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                point = adContainerParams.offset;
            }
            if ((i11 & 2) != 0) {
                i10 = adContainerParams.rotation;
            }
            if ((i11 & 4) != 0) {
                pointF = adContainerParams.pivot;
            }
            return adContainerParams.copy(point, i10, pointF);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Point getOffset() {
            return this.offset;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRotation() {
            return this.rotation;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final PointF getPivot() {
            return this.pivot;
        }

        @NotNull
        public final AdContainerParams copy(@NotNull Point offset, int rotation, @NotNull PointF pivot) {
            Intrinsics.checkNotNullParameter(offset, "offset");
            Intrinsics.checkNotNullParameter(pivot, "pivot");
            return new AdContainerParams(offset, rotation, pivot);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdContainerParams)) {
                return false;
            }
            AdContainerParams adContainerParams = (AdContainerParams) other;
            return Intrinsics.areEqual(this.offset, adContainerParams.offset) && this.rotation == adContainerParams.rotation && Intrinsics.areEqual(this.pivot, adContainerParams.pivot);
        }

        @NotNull
        public final Point getOffset() {
            return this.offset;
        }

        @NotNull
        public final PointF getPivot() {
            return this.pivot;
        }

        public final int getRotation() {
            return this.rotation;
        }

        public int hashCode() {
            return (((this.offset.hashCode() * 31) + this.rotation) * 31) + this.pivot.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdContainerParams(offset=" + this.offset + ", rotation=" + this.rotation + ", pivot=" + this.pivot + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState;", "", "Place", "Coordinate", y.f66058y, "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState$Coordinate;", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState$Place;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PositionState {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState$Companion;", "", "<init>", "()V", Profile.DEFAULT_PROFILE_NAME, "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState$Place;", "getDefault", "()Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState$Place;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @NotNull
            public final Place getDefault() {
                return new Place(BannerPosition.HorizontalBottom);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState$Coordinate;", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState;", "adContainerParams", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$AdContainerParams;", "<init>", "(Lorg/bidon/sdk/ads/banner/render/AdRenderer$AdContainerParams;)V", "getAdContainerParams", "()Lorg/bidon/sdk/ads/banner/render/AdRenderer$AdContainerParams;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Coordinate implements PositionState {

            @NotNull
            private final AdContainerParams adContainerParams;

            public Coordinate(@NotNull AdContainerParams adContainerParams) {
                Intrinsics.checkNotNullParameter(adContainerParams, "adContainerParams");
                this.adContainerParams = adContainerParams;
            }

            public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, AdContainerParams adContainerParams, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    adContainerParams = coordinate.adContainerParams;
                }
                return coordinate.copy(adContainerParams);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AdContainerParams getAdContainerParams() {
                return this.adContainerParams;
            }

            @NotNull
            public final Coordinate copy(@NotNull AdContainerParams adContainerParams) {
                Intrinsics.checkNotNullParameter(adContainerParams, "adContainerParams");
                return new Coordinate(adContainerParams);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Coordinate) && Intrinsics.areEqual(this.adContainerParams, ((Coordinate) other).adContainerParams);
            }

            @NotNull
            public final AdContainerParams getAdContainerParams() {
                return this.adContainerParams;
            }

            public int hashCode() {
                return this.adContainerParams.hashCode();
            }

            @NotNull
            public String toString() {
                return "Coordinate(adContainerParams=" + this.adContainerParams + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState$Place;", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState;", C4240b4.i.L, "Lorg/bidon/sdk/ads/banner/BannerPosition;", "<init>", "(Lorg/bidon/sdk/ads/banner/BannerPosition;)V", "getPosition", "()Lorg/bidon/sdk/ads/banner/BannerPosition;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Place implements PositionState {

            @NotNull
            private final BannerPosition position;

            public Place(@NotNull BannerPosition position) {
                Intrinsics.checkNotNullParameter(position, "position");
                this.position = position;
            }

            public static /* synthetic */ Place copy$default(Place place, BannerPosition bannerPosition, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bannerPosition = place.position;
                }
                return place.copy(bannerPosition);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final BannerPosition getPosition() {
                return this.position;
            }

            @NotNull
            public final Place copy(@NotNull BannerPosition position) {
                Intrinsics.checkNotNullParameter(position, "position");
                return new Place(position);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Place) && this.position == ((Place) other).position;
            }

            @NotNull
            public final BannerPosition getPosition() {
                return this.position;
            }

            public int hashCode() {
                return this.position.hashCode();
            }

            @NotNull
            public String toString() {
                return "Place(position=" + this.position + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderInspector;", "", "isRenderPermitted", "", "isActivityValid", "activity", "Landroid/app/Activity;", "isViewVisibleOnScreen", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RenderInspector {
        boolean isActivityValid(@NotNull Activity activity);

        boolean isRenderPermitted();

        boolean isViewVisibleOnScreen(@Nullable View view);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderListener;", "", "onRendered", "", "onRenderFailed", "onVisibilityIssued", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RenderListener {
        void onRenderFailed();

        void onRendered();

        void onVisibilityIssued();
    }

    void destroy(@NotNull Activity activity);

    void hide(@NotNull Activity activity);

    void render(@NotNull Activity activity, @NotNull BannerView bannerView, @NotNull PositionState positionState, boolean animate, boolean handleConfigurationChanges, @NotNull RenderListener renderListener);
}
