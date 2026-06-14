package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4478p3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4230ac extends AbstractC4478p3<Q0> implements NativeAdListener, C0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f42352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f42353s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4230ac(@NotNull InterfaceC4435md threadInterface, @NotNull C4405l0 adSmashData, @Nullable BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, @Nullable C4283dd c4283dd, @NotNull C4424m2 item, @Nullable Q0 q02) {
        super(threadInterface, adSmashData, baseAdAdapter, new C4237b1(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), item, q02);
        Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f44610g = c4283dd;
    }

    private final void J() {
        Sf sf2;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f44608e != AbstractC4478p3.h.FAILED) {
            kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.f44608e}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            D0 d02 = this.f44607d;
            if (d02 == null || (sf2 = d02.f40516j) == null) {
                return;
            }
            sf2.q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4230ac this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC4478p3
    protected void G() {
        Sf sf2;
        if (!(this.f44606c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            D0 d02 = this.f44607d;
            if (d02 == null || (sf2 = d02.f40516j) == null) {
                return;
            }
            sf2.g("activity must not be null");
            return;
        }
        Object obj = this.f44606c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.f44614k;
        Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    @Nullable
    public final AdapterNativeAdViewBinder R() {
        return this.f42353s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull final AdapterNativeAdData adapterNativeAdData, @NotNull final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().e()) {
            u().a(new Runnable() { // from class: com.ironsource.gk
                @Override // java.lang.Runnable
                public final void run() {
                    C4230ac.a(this.f43199b, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC4478p3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().e()) {
            u().a(new Runnable() { // from class: com.ironsource.fk
                @Override // java.lang.Runnable
                public final void run() {
                    C4230ac.a(this.f43138b);
                }
            });
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, @Nullable String str) {
        throw new lf.n("An operation is not implemented: Not yet implemented");
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f42352r = adapterNativeAdData;
        this.f42353s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void P() {
        Sf sf2;
        C4621xb c4621xb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4478p3.h.NONE);
        Object obj = this.f44606c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.f44614k;
                Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            D0 d02 = this.f44607d;
            if (d02 != null && (sf2 = d02.f40516j) != null) {
                sf2.g(str);
            }
        }
        D0 d03 = this.f44607d;
        if (d03 == null || (c4621xb = d03.f40512f) == null) {
            return;
        }
        Integer sessionDepth = r();
        Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        c4621xb.a(sessionDepth.intValue());
    }

    @Nullable
    public final AdapterNativeAdData Q() {
        return this.f42352r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4230ac this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    @Override // com.ironsource.AbstractC4478p3, com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@NotNull A0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.f44610g != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
