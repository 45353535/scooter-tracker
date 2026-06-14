package org.bidon.sdk.ads.banner.render;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.banner.render.AdRenderer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdViewsParameters;", "", "baseParams", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$AdContainerParams;", "adContainerWidth", "", "adContainerHeight", "adContainerLayoutParamsWidth", "adContainerLayoutParamsHeight", "<init>", "(Lorg/bidon/sdk/ads/banner/render/AdRenderer$AdContainerParams;IIII)V", "getBaseParams", "()Lorg/bidon/sdk/ads/banner/render/AdRenderer$AdContainerParams;", "getAdContainerWidth", "()I", "getAdContainerHeight", "getAdContainerLayoutParamsWidth", "getAdContainerLayoutParamsHeight", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdViewsParameters {
    private final int adContainerHeight;
    private final int adContainerLayoutParamsHeight;
    private final int adContainerLayoutParamsWidth;
    private final int adContainerWidth;

    @NotNull
    private final AdRenderer.AdContainerParams baseParams;

    public AdViewsParameters(@NotNull AdRenderer.AdContainerParams baseParams, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(baseParams, "baseParams");
        this.baseParams = baseParams;
        this.adContainerWidth = i10;
        this.adContainerHeight = i11;
        this.adContainerLayoutParamsWidth = i12;
        this.adContainerLayoutParamsHeight = i13;
    }

    public static /* synthetic */ AdViewsParameters copy$default(AdViewsParameters adViewsParameters, AdRenderer.AdContainerParams adContainerParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            adContainerParams = adViewsParameters.baseParams;
        }
        if ((i14 & 2) != 0) {
            i10 = adViewsParameters.adContainerWidth;
        }
        if ((i14 & 4) != 0) {
            i11 = adViewsParameters.adContainerHeight;
        }
        if ((i14 & 8) != 0) {
            i12 = adViewsParameters.adContainerLayoutParamsWidth;
        }
        if ((i14 & 16) != 0) {
            i13 = adViewsParameters.adContainerLayoutParamsHeight;
        }
        int i15 = i13;
        int i16 = i11;
        return adViewsParameters.copy(adContainerParams, i10, i16, i12, i15);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdRenderer.AdContainerParams getBaseParams() {
        return this.baseParams;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAdContainerWidth() {
        return this.adContainerWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAdContainerHeight() {
        return this.adContainerHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAdContainerLayoutParamsWidth() {
        return this.adContainerLayoutParamsWidth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAdContainerLayoutParamsHeight() {
        return this.adContainerLayoutParamsHeight;
    }

    @NotNull
    public final AdViewsParameters copy(@NotNull AdRenderer.AdContainerParams baseParams, int adContainerWidth, int adContainerHeight, int adContainerLayoutParamsWidth, int adContainerLayoutParamsHeight) {
        Intrinsics.checkNotNullParameter(baseParams, "baseParams");
        return new AdViewsParameters(baseParams, adContainerWidth, adContainerHeight, adContainerLayoutParamsWidth, adContainerLayoutParamsHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdViewsParameters)) {
            return false;
        }
        AdViewsParameters adViewsParameters = (AdViewsParameters) other;
        return Intrinsics.areEqual(this.baseParams, adViewsParameters.baseParams) && this.adContainerWidth == adViewsParameters.adContainerWidth && this.adContainerHeight == adViewsParameters.adContainerHeight && this.adContainerLayoutParamsWidth == adViewsParameters.adContainerLayoutParamsWidth && this.adContainerLayoutParamsHeight == adViewsParameters.adContainerLayoutParamsHeight;
    }

    public final int getAdContainerHeight() {
        return this.adContainerHeight;
    }

    public final int getAdContainerLayoutParamsHeight() {
        return this.adContainerLayoutParamsHeight;
    }

    public final int getAdContainerLayoutParamsWidth() {
        return this.adContainerLayoutParamsWidth;
    }

    public final int getAdContainerWidth() {
        return this.adContainerWidth;
    }

    @NotNull
    public final AdRenderer.AdContainerParams getBaseParams() {
        return this.baseParams;
    }

    public int hashCode() {
        return (((((((this.baseParams.hashCode() * 31) + this.adContainerWidth) * 31) + this.adContainerHeight) * 31) + this.adContainerLayoutParamsWidth) * 31) + this.adContainerLayoutParamsHeight;
    }

    @NotNull
    public String toString() {
        return "AdViewsParameters(baseParams=" + this.baseParams + ", adContainerWidth=" + this.adContainerWidth + ", adContainerHeight=" + this.adContainerHeight + ", adContainerLayoutParamsWidth=" + this.adContainerLayoutParamsWidth + ", adContainerLayoutParamsHeight=" + this.adContainerLayoutParamsHeight + ")";
    }
}
