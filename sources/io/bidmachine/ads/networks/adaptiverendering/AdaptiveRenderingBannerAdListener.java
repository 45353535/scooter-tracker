package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import com.ironsource.Df;
import id.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ld.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingBannerAdListener;", "Lhc/s;", "Lod/f;", "callback", "<init>", "(Lod/f;)V", "Lhc/r;", "adView", "", "onAdLoaded", "(Lhc/r;)V", "Lid/a0;", "error", "onAdFailToLoad", "(Lhc/r;Lid/a0;)V", "onAdShown", "onAdFailToShow", Df.f40645f, "onAdFinished", "onAdAppeared", "onAdDisappeared", "onAdExpired", "Lid/z0;", "privacySheetParams", "onOpenPrivacySheet", "(Lhc/r;Lid/z0;)V", "Lid/t;", "brokenCreativeEvent", "onBrokenCreativeEvent", "(Lhc/r;Lid/t;)V", "Lod/f;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingBannerAdListener implements hc.s {

    @NotNull
    private final od.f callback;

    public AdaptiveRenderingBannerAdListener(@NotNull od.f callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // fc.a
    public void onAdAppeared(@NotNull hc.r adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
    }

    @Override // fc.a
    public void onAdDisappeared(@NotNull hc.r adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
    }

    @Override // fc.a
    public void onAdFinished(@NotNull hc.r adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
    }

    @Override // fc.a
    public void onAdClicked(@NotNull hc.r adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.callback.onAdClicked();
    }

    @Override // fc.a
    public void onAdExpired(@NotNull hc.r adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.callback.onAdExpired();
    }

    @Override // fc.a
    public void onAdFailToLoad(@NotNull hc.r adView, @NotNull id.a0 error) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(error, "error");
        od.f fVar = this.callback;
        ae.a NoFill = ae.a.f4247q;
        Intrinsics.checkNotNullExpressionValue(NoFill, "NoFill");
        fVar.onAdLoadFailed(AdaptiveRenderingAdapterKt.toBMError(error, NoFill));
    }

    @Override // fc.a
    public void onAdFailToShow(@NotNull hc.r adView, @NotNull id.a0 error) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(error, "error");
        od.f fVar = this.callback;
        ae.a InternalUnknownError = ae.a.f4248r;
        Intrinsics.checkNotNullExpressionValue(InternalUnknownError, "InternalUnknownError");
        fVar.onAdShowFailed(AdaptiveRenderingAdapterKt.toBMError(error, InternalUnknownError));
    }

    @Override // fc.a
    public void onAdLoaded(@NotNull hc.r adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.callback.onAdLoaded(adView);
    }

    @Override // fc.a
    public void onAdShown(@NotNull hc.r adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.callback.onAdShown();
    }

    @Override // fc.a
    public void onBrokenCreativeEvent(@NotNull hc.r adView, @NotNull id.t brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
        this.callback.onBrokenCreativeEvent(AdaptiveRenderingAdapterKt.toEventParams(brokenCreativeEvent));
    }

    @Override // fc.a
    public void onOpenPrivacySheet(@NotNull hc.r adView, @NotNull z0 privacySheetParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        a.C1079a c1079a = ld.a.f94158d;
        Context contextN = io.bidmachine.core.h.n(adView.getContext(), adView);
        Intrinsics.checkNotNullExpressionValue(contextN, "findDialogContext(adView.context, adView)");
        c1079a.a(contextN, privacySheetParams);
    }
}
