package com.vungle.ads.internal;

import android.content.Context;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/NativeAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "getImpressionUrls", "", "", "getPlacementRefId", "isValidAdSize", "", C4240b4.i.O, "isValidAdTypeForPlacement", "placement", "Lcom/vungle/ads/internal/model/Placement;", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeAdInternal extends AdInternal implements NativePresenterDelegate {

    @NotNull
    public static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";

    @NotNull
    public static final String TOKEN_APP_ICON = "APP_ICON";

    @NotNull
    public static final String TOKEN_APP_NAME = "APP_NAME";

    @NotNull
    public static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";

    @NotNull
    public static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";

    @NotNull
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";

    @NotNull
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";

    @NotNull
    public static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";

    @NotNull
    public static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";

    @NotNull
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";

    @NotNull
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdInternal(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    @Nullable
    /* JADX INFO: renamed from: getAdSizeForAdRequest */
    public VungleAdSize getAdSize() {
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    @Nullable
    public List<String> getImpressionUrls() {
        BidPayload bidPayload = getBidPayload();
        if (bidPayload != null) {
            return bidPayload.getImpression();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    @Nullable
    public String getPlacementRefId() {
        Placement placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(@Nullable VungleAdSize adSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(@NotNull Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isNative();
    }
}
