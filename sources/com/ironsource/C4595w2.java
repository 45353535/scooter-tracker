package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4595w2 extends AbstractC4643z implements BannerAdListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC4629y2> f45693x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private View f45694y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    private FrameLayout.LayoutParams f45695z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4595w2(@NotNull V0 adTools, @NotNull A instanceData, @NotNull G adInstancePayload, @NotNull InterfaceC4629y2 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45693x = new WeakReference<>(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4595w2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    @Override // com.ironsource.AbstractC4643z
    protected void A() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData adDataI = i();
        ISBannerSize iSBannerSizeI = I();
        Map<String, Object> adUnitData = adDataI.getAdUnitData();
        Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put(J2.f41153t, new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeI));
        Object objG = g();
        Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objG).loadAd(adDataI, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeI, this);
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
        C4553tb.a(f(), new Runnable() { // from class: com.ironsource.fn
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.a(this.f43142b);
            }
        }, 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.AbstractC4643z
    public void c() {
        try {
            if (!(g() instanceof AdapterBannerInterface)) {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
                return;
            }
            Object objG = g();
            Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
            ((AdapterBannerInterface) objG).destroyAd(i());
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
    }

    @Override // com.ironsource.AbstractC4643z
    @NotNull
    public LevelPlayAdInfo e() {
        String string = n().i().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = n().i().b().c();
        String string2 = n().h().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        C4424m2 c4424m2N = n().n();
        AbstractC4576v0 abstractC4576v0I = n().i();
        Intrinsics.checkNotNull(abstractC4576v0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strC, string2, c4424m2N, ((L2) abstractC4576v0I).b().h(), n().i().l(), MapsKt.toMap(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLeftApplication(Map map) {
        p4.d.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View adView, @NotNull FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        onAdLoadSuccess(adView, frameLayoutParams, new LinkedHashMap());
    }

    @Override // com.ironsource.AbstractC4643z, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.jn
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.a(this.f43429b, extraData);
            }
        });
        super.onAdOpened(extraData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenDismissed(Map map) {
        p4.d.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenPresented(Map map) {
        p4.d.d(this, map);
    }

    private final ISBannerSize I() {
        V0 v0F = f();
        AbstractC4576v0 abstractC4576v0I = n().i();
        Intrinsics.checkNotNull(abstractC4576v0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return v0F.a(((L2) abstractC4576v0I).b().h());
    }

    private final void J() {
        C4283dd c4283ddJ = j();
        if (c4283ddJ != null) {
            f().e().a().f(c4283ddJ.c());
        }
        InterfaceC4629y2 interfaceC4629y2 = this.f45693x.get();
        if (interfaceC4629y2 != null) {
            interfaceC4629y2.a(this);
        }
    }

    private final void K() {
        C4283dd c4283ddJ = j();
        if (c4283ddJ != null) {
            f().e().a().c(c4283ddJ.c());
        }
        InterfaceC4629y2 interfaceC4629y2 = this.f45693x.get();
        if (interfaceC4629y2 != null) {
            interfaceC4629y2.b(this);
        }
    }

    private final void L() {
        C4283dd c4283ddJ = j();
        if (c4283ddJ != null) {
            f().e().a().h(c4283ddJ.c());
        }
        InterfaceC4629y2 interfaceC4629y2 = this.f45693x.get();
        if (interfaceC4629y2 != null) {
            interfaceC4629y2.c(this);
        }
    }

    public final void a(@NotNull final eg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        C4553tb.a(f(), new Runnable() { // from class: com.ironsource.in
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.a(this.f43386b, viewBinder);
            }
        }, 0L, 2, (Object) null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new Runnable() { // from class: com.ironsource.kn
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.b(this.f43494b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull final View adView, @NotNull final FrameLayout.LayoutParams frameLayoutParams, @NotNull Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        C4553tb.a(f(), new Runnable() { // from class: com.ironsource.ln
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.a(this.f43606b, adView, frameLayoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess(extraData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new Runnable() { // from class: com.ironsource.en
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.c(this.f43028b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new Runnable() { // from class: com.ironsource.gn
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.d(this.f43203b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C4595w2 this$0, eg viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.f45694y;
        if (view == null || (layoutParams = this$0.f45695z) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(C4441n0.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().d(new Runnable() { // from class: com.ironsource.hn
            @Override // java.lang.Runnable
            public final void run() {
                C4595w2.e(this.f43295b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4595w2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4595w2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f45694y = null;
        this$0.f45695z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4595w2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4595w2 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.f45694y = adView;
        this$0.f45695z = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4595w2 this$0) {
        String strC;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        M mA = this$0.f().e().a();
        C4283dd c4283ddJ = this$0.j();
        if (c4283ddJ == null || (strC = c4283ddJ.c()) == null) {
            strC = "";
        }
        mA.j(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4595w2 this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.l().putAll(extraData);
    }
}
