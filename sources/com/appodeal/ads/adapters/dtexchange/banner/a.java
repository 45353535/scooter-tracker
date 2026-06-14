package com.appodeal.ads.adapters.dtexchange.banner;

import android.widget.FrameLayout;
import com.appodeal.ads.adapters.dtexchange.unified.d;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedBannerCallback f12186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f12187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pair f12188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UnifiedBannerCallback callback, FrameLayout bannerView, Pair size) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f12186b = callback;
        this.f12187c = bannerView;
        this.f12188d = size;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        if (inneractiveAdSpot != null) {
            FrameLayout frameLayout = this.f12187c;
            if (inneractiveAdSpot.isReady()) {
                InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
                InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof InneractiveAdViewUnitController ? (InneractiveAdViewUnitController) selectedUnitController : null;
                if (inneractiveAdViewUnitController != null) {
                    inneractiveAdViewUnitController.setEventsListener(this);
                    inneractiveAdViewUnitController.bindView(frameLayout);
                    this.f12186b.onAdLoaded(this.f12187c, ((Number) this.f12188d.getSecond()).intValue());
                    return;
                }
            }
        }
        this.f12186b.onAdLoadFailed(LoadingError.NoFill);
    }
}
