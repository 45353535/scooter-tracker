package org.bidon.sdk.ads.banner.render;

import android.graphics.Point;
import android.graphics.PointF;
import com.amazon.device.ads.DtbDeviceData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.banner.BannerPosition;
import org.bidon.sdk.ads.banner.render.AdRenderer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/CalculateAdContainerParamsUseCase;", "", "<init>", "()V", "invoke", "Lorg/bidon/sdk/ads/banner/render/AdViewsParameters;", "positionState", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState;", DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY, "Landroid/graphics/Point;", "bannerWidth", "", "bannerHeight", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CalculateAdContainerParamsUseCase {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerPosition.values().length];
            try {
                iArr[BannerPosition.HorizontalTop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerPosition.HorizontalBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerPosition.VerticalLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerPosition.VerticalRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final AdViewsParameters invoke(@NotNull AdRenderer.PositionState positionState, @NotNull Point screenSize, int bannerWidth, int bannerHeight) {
        AdRenderer.AdContainerParams adContainerParams;
        AdRenderer.AdContainerParams adContainerParams2;
        Pair pair;
        int iIntValue;
        int iIntValue2;
        Intrinsics.checkNotNullParameter(positionState, "positionState");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        boolean z10 = positionState instanceof AdRenderer.PositionState.Coordinate;
        if (z10) {
            adContainerParams2 = ((AdRenderer.PositionState.Coordinate) positionState).getAdContainerParams();
        } else {
            if (!(positionState instanceof AdRenderer.PositionState.Place)) {
                throw new m();
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[((AdRenderer.PositionState.Place) positionState).getPosition().ordinal()];
            if (i10 == 1) {
                adContainerParams = new AdRenderer.AdContainerParams(new Point(0, 0), 0, new PointF(0.0f, 0.0f));
            } else if (i10 == 2) {
                adContainerParams = new AdRenderer.AdContainerParams(new Point(0, screenSize.y), 0, new PointF(0.0f, 1.0f));
            } else if (i10 == 3) {
                adContainerParams = new AdRenderer.AdContainerParams(new Point(0, 0), -90, new PointF(0.0f, 0.0f));
            } else {
                if (i10 != 4) {
                    throw new m();
                }
                adContainerParams = new AdRenderer.AdContainerParams(new Point(screenSize.x, 0), 90, new PointF(1.0f, 0.0f));
            }
            adContainerParams2 = adContainerParams;
        }
        if (z10) {
            pair = TuplesKt.to(Integer.valueOf(bannerWidth), Integer.valueOf(bannerHeight));
        } else {
            if (!(positionState instanceof AdRenderer.PositionState.Place)) {
                throw new m();
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[((AdRenderer.PositionState.Place) positionState).getPosition().ordinal()];
            if (i11 == 1 || i11 == 2) {
                pair = TuplesKt.to(Integer.valueOf(bannerWidth), Integer.valueOf(bannerHeight));
            } else {
                if (i11 != 3 && i11 != 4) {
                    throw new m();
                }
                pair = TuplesKt.to(Integer.valueOf(bannerHeight), Integer.valueOf(bannerWidth));
            }
        }
        int iIntValue3 = ((Number) pair.component1()).intValue();
        int iIntValue4 = ((Number) pair.component2()).intValue();
        if (z10) {
            iIntValue = iIntValue3;
        } else {
            if (!(positionState instanceof AdRenderer.PositionState.Place)) {
                throw new m();
            }
            Integer numValueOf = Integer.valueOf(iIntValue3);
            if (!ArraysKt.contains(new BannerPosition[]{BannerPosition.VerticalRight, BannerPosition.VerticalLeft}, ((AdRenderer.PositionState.Place) positionState).getPosition())) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        }
        if (z10) {
            iIntValue2 = iIntValue4;
        } else {
            if (!(positionState instanceof AdRenderer.PositionState.Place)) {
                throw new m();
            }
            Integer numValueOf2 = ArraysKt.contains(new BannerPosition[]{BannerPosition.HorizontalTop, BannerPosition.HorizontalBottom}, ((AdRenderer.PositionState.Place) positionState).getPosition()) ? Integer.valueOf(iIntValue4) : null;
            iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : -1;
        }
        return new AdViewsParameters(adContainerParams2, iIntValue3, iIntValue4, iIntValue, iIntValue2);
    }
}
