package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC4478p3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class J2 extends AbstractC4478p3<InterfaceC4508r0> implements BannerAdListener, C0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f41153t = "bannerLayout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f41154u = "bannerSize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.ironsource.mediationsdk.q f41155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f41156s;

    class a extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f41157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f41158c;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f41157b = view;
            this.f41158c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            J2.this.a(this.f41157b, this.f41158c);
        }
    }

    class b extends AbstractRunnableC4232ae {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            J2.this.J();
        }
    }

    public J2(InterfaceC4435md interfaceC4435md, C4405l0 c4405l0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.q qVar, C4283dd c4283dd, boolean z10, C4424m2 c4424m2, InterfaceC4508r0 interfaceC4508r0) {
        super(interfaceC4435md, c4405l0, baseAdAdapter, new C4237b1(c4405l0.g(), c4405l0.g().getBannerSettings(), IronSource.a.BANNER), c4424m2, interfaceC4508r0);
        this.f41155r = qVar;
        this.f44610g = c4283dd;
        this.f41156s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
        } else {
            if (this.f44608e == AbstractC4478p3.h.FAILED) {
                return;
            }
            ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", k(), this.f44608e));
            if (this.f44607d != null) {
                this.f44607d.f40516j.q(String.format("unexpected onAdOpened, state - %s", this.f44608e));
            }
        }
    }

    @Override // com.ironsource.AbstractC4478p3
    protected void G() {
        Object obj = this.f44606c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f44614k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f41155r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC4478p3
    protected boolean O() {
        return false;
    }

    public void R() {
        Object obj = this.f44606c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f44614k);
        }
    }

    @Override // com.ironsource.AbstractC4478p3
    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLeftApplication(Map map) {
        p4.d.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams, Map map) {
        p4.d.b(this, view, layoutParams, map);
    }

    @Override // com.ironsource.AbstractC4478p3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().e()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenDismissed(Map map) {
        p4.d.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenPresented(Map map) {
        p4.d.d(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
    }

    @Override // com.ironsource.AbstractC4478p3
    protected boolean v() {
        return this.f41156s;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4478p3.h.NONE);
        Object obj = this.f44606c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f44614k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f44608e;
            IronLog.INTERNAL.error(a(str));
            D0 d02 = this.f44607d;
            if (d02 != null) {
                d02.f40516j.g(str);
            }
        }
        D0 d03 = this.f44607d;
        if (d03 != null) {
            d03.f40512f.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.f44606c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f44614k);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        D0 d02;
        C4283dd c4283dd = this.f44610g;
        if (c4283dd != null && (d02 = this.f44607d) != null) {
            d02.f40515i.f(c4283dd.c());
        }
        Listener listener = this.f44605b;
        if (listener != 0) {
            ((InterfaceC4508r0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        if (u().e()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        D0 d02;
        C4283dd c4283dd = this.f44610g;
        if (c4283dd != null && (d02 = this.f44607d) != null) {
            d02.f40515i.c(c4283dd.c());
        }
        Listener listener = this.f44605b;
        if (listener != 0) {
            ((InterfaceC4508r0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        D0 d02;
        C4283dd c4283dd = this.f44610g;
        if (c4283dd != null && (d02 = this.f44607d) != null) {
            d02.f40515i.h(c4283dd.c());
        }
        Listener listener = this.f44605b;
        if (listener != 0) {
            ((InterfaceC4508r0) listener).f(this);
        }
    }

    @Override // com.ironsource.AbstractC4478p3
    protected Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> mapA = super.a(map);
        C4405l0 c4405l0 = this.f44604a;
        if (c4405l0 != null && this.f41155r != null && TextUtils.isEmpty(c4405l0.g().getCustomNetwork())) {
            mapA.put(f41153t, this.f41155r);
        }
        return mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f44605b) == 0) {
            return;
        }
        ((InterfaceC4508r0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC4478p3, com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        Map<String, Object> mapA = super.a(a02);
        com.ironsource.mediationsdk.q qVar = this.f41155r;
        if (qVar != null && !qVar.b()) {
            com.ironsource.mediationsdk.l.a(mapA, this.f41155r.getSize());
        }
        if (this.f44610g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }
}
