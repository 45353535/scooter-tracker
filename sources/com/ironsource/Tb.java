package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Tb extends AbstractC4643z implements NativeAdListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f41806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f41807y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(@NotNull V0 adTools, @NotNull A instanceData, @NotNull G adInstancePayload, @NotNull D listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.AbstractC4643z
    protected void A() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData adDataI = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().e().h().g("activity must not be null");
            return;
        }
        Object objG = g();
        Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        Intrinsics.checkNotNullExpressionValue(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) objG).loadAd(adDataI, activeContext, this);
    }

    @Nullable
    public final AdapterNativeAdData I() {
        return this.f41806x;
    }

    @Nullable
    public final AdapterNativeAdViewBinder J() {
        return this.f41807y;
    }

    @Override // com.ironsource.AbstractC4643z
    public void a(@NotNull I adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC4643z
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                Object objG = g();
                Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) objG).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f41806x = adapterNativeAdData;
        this.f41807y = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(@NotNull Mb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.f41806x);
        nativeAdBinder.a(this.f41807y);
    }
}
