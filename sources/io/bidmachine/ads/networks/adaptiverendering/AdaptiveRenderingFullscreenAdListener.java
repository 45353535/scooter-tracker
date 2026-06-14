package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import com.ironsource.C4329g8;
import com.ironsource.Df;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import id.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ld.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingFullscreenAdListener;", "Lgc/n;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lod/i;", "callback", "<init>", "(Landroid/content/Context;Lod/i;)V", "Lgc/m;", "fullScreenAd", "", "onAdLoaded", "(Lgc/m;)V", "Lid/a0;", "error", "onAdFailToLoad", "(Lgc/m;Lid/a0;)V", "onAdShown", "onAdFailToShow", Df.f40645f, "onAdFinished", "onAdAppeared", "onAdDisappeared", "onAdExpired", "Lid/z0;", "privacySheetParams", "onOpenPrivacySheet", "(Lgc/m;Lid/z0;)V", "Lid/t;", "brokenCreativeEvent", "onBrokenCreativeEvent", "(Lgc/m;Lid/t;)V", "Lod/i;", "applicationContext", "Landroid/content/Context;", "", C4329g8.f43168m, "Z", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingFullscreenAdListener implements gc.n {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final od.i callback;
    private volatile boolean isShown;

    public AdaptiveRenderingFullscreenAdListener(@NotNull Context context, @NotNull od.i callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // fc.a
    public void onAdAppeared(@NotNull gc.m fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
    }

    @Override // fc.a
    public void onAdDisappeared(@NotNull gc.m fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
    }

    @Override // fc.a
    public void onAdClicked(@NotNull gc.m fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.callback.onAdClicked();
    }

    @Override // fc.a
    public void onAdExpired(@NotNull gc.m fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.callback.onAdExpired();
    }

    @Override // fc.a
    public void onAdFailToLoad(@NotNull gc.m fullScreenAd, @NotNull id.a0 error) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(error, "error");
        od.i iVar = this.callback;
        ae.a NoFill = ae.a.f4247q;
        Intrinsics.checkNotNullExpressionValue(NoFill, "NoFill");
        iVar.onAdLoadFailed(AdaptiveRenderingAdapterKt.toBMError(error, NoFill));
    }

    @Override // fc.a
    public void onAdFailToShow(@NotNull gc.m fullScreenAd, @NotNull id.a0 error) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(error, "error");
        od.i iVar = this.callback;
        ae.a InternalUnknownError = ae.a.f4248r;
        Intrinsics.checkNotNullExpressionValue(InternalUnknownError, "InternalUnknownError");
        iVar.onAdShowFailed(AdaptiveRenderingAdapterKt.toBMError(error, InternalUnknownError));
    }

    @Override // fc.a
    public void onAdFinished(@NotNull gc.m fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        if (this.isShown) {
            this.callback.onAdFinished();
        }
        this.callback.onAdClosed();
    }

    @Override // fc.a
    public void onAdLoaded(@NotNull gc.m fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.callback.onAdLoaded();
    }

    @Override // fc.a
    public void onAdShown(@NotNull gc.m fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.isShown = true;
        this.callback.onAdShown();
    }

    @Override // fc.a
    public void onBrokenCreativeEvent(@NotNull gc.m fullScreenAd, @NotNull id.t brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
        this.callback.onBrokenCreativeEvent(AdaptiveRenderingAdapterKt.toEventParams(brokenCreativeEvent));
    }

    @Override // fc.a
    public void onOpenPrivacySheet(@NotNull gc.m fullScreenAd, @NotNull z0 privacySheetParams) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        a.C1079a c1079a = ld.a.f94158d;
        Context contextM = io.bidmachine.core.h.m(this.applicationContext);
        Intrinsics.checkNotNullExpressionValue(contextM, "findDialogContext(applicationContext)");
        c1079a.a(contextM, privacySheetParams);
    }
}
