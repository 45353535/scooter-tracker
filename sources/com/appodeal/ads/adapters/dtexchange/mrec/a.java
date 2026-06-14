package com.appodeal.ads.adapters.dtexchange.mrec;

import android.widget.FrameLayout;
import com.appodeal.ads.adapters.dtexchange.unified.d;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedMrecCallback f12195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f12196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UnifiedMrecCallback callback, FrameLayout mrecView) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(mrecView, "mrecView");
        this.f12195b = callback;
        this.f12196c = mrecView;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        if (inneractiveAdSpot != null) {
            FrameLayout frameLayout = this.f12196c;
            if (inneractiveAdSpot.isReady()) {
                InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
                InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof InneractiveAdViewUnitController ? (InneractiveAdViewUnitController) selectedUnitController : null;
                if (inneractiveAdViewUnitController != null) {
                    inneractiveAdViewUnitController.setEventsListener(this);
                    inneractiveAdViewUnitController.bindView(frameLayout);
                    this.f12195b.onAdLoaded(this.f12196c);
                    return;
                }
            }
        }
        this.f12195b.onAdLoadFailed(LoadingError.NoFill);
    }
}
