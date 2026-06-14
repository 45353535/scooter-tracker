package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC4425m3;
import com.ironsource.N0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class F2 extends AbstractC4425m3<J2, AdapterAdViewListener> implements InterfaceC4508r0, E2 {
    private Z2 K;
    private boolean L;
    private com.ironsource.mediationsdk.q M;
    private View N;
    private AbstractC4478p3<?> O;
    private FrameLayout.LayoutParams P;
    private final AtomicBoolean Q;
    private final AtomicBoolean R;

    class a implements B3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4478p3 f40853a;

        a(AbstractC4478p3 abstractC4478p3) {
            this.f40853a = abstractC4478p3;
        }

        @Override // com.ironsource.B3
        public void a() {
            ((J2) this.f40853a).Q();
        }
    }

    class b implements B3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4478p3 f40855a;

        b(AbstractC4478p3 abstractC4478p3) {
            this.f40855a = abstractC4478p3;
        }

        @Override // com.ironsource.B3
        public void a() {
            ((J2) this.f40855a).Q();
            F2 f22 = F2.this;
            f22.f43660s.f40515i.j(f22.n());
            F2.this.Q.set(false);
            F2.this.W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + F2.this.f43656o.h().b() + ", current timestamp = " + System.currentTimeMillis());
            F2.this.O().h();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40857a;

        static {
            int[] iArr = new int[N0.a.values().length];
            f40857a = iArr;
            try {
                iArr[N0.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40857a[N0.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public F2(List<NetworkSettings> list, T2 t22, String str, C4432ma c4432ma, C4246ba c4246ba) {
        super(new G2(str, list, t22), c4432ma, c4246ba);
        this.L = false;
        this.Q = new AtomicBoolean(true);
        this.R = new AtomicBoolean(false);
        this.K = N();
    }

    private C4307f3 P() {
        return (C4307f3) this.f43658q;
    }

    private ISBannerSize Q() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        return this.M.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : this.M.getSize();
    }

    private boolean S() {
        IronLog.INTERNAL.verbose(b(this.N + ", " + this.P + ", " + this.O));
        return (this.N == null || this.P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i10 = c.f40857a[this.f43658q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i10 = c.f40857a[this.f43658q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.N = null;
        this.P = null;
    }

    boolean R() {
        if (!this.M.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.M.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.M.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void T() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar != null) {
            a(qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC4425m3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public J2 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i10, String str, C4424m2 c4424m2) {
        return new J2(this, new C4405l0(IronSource.a.BANNER, this.f43656o.o(), i10, this.f43648g, str, this.f43646e, this.f43647f, networkSettings, this.f43656o.n()), baseAdAdapter, this.M, this.f43650i, v(), c4424m2, this);
    }

    @Override // com.ironsource.E2
    public void c() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.f43660s.f40512f.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else {
            if (!S()) {
                IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
                this.Q.set(true);
                return;
            }
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.O, this.N, this.P);
        }
    }

    @Override // com.ironsource.E2
    public void d() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.f43660s.f40516j.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.T0
    public void f(AbstractC4478p3<?> abstractC4478p3) {
        IronLog.INTERNAL.verbose(b(abstractC4478p3.k()));
        this.f43661t.f(abstractC4478p3.f());
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void g(AbstractC4478p3<?> abstractC4478p3) {
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void h(AbstractC4478p3<?> abstractC4478p3) {
    }

    @Override // com.ironsource.AbstractC4425m3
    protected String l() {
        return "BN";
    }

    @Override // com.ironsource.AbstractC4425m3
    protected String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected boolean v() {
        return this.L;
    }

    private void M() {
        int i10 = c.f40857a[this.f43658q.b().a().ordinal()];
        if (i10 == 1) {
            P().a();
        } else {
            if (i10 != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private Z2 N() {
        return new Z2(this.f43656o.h(), this.f43656o.g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Z2 O() {
        return this.K;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void a(Context context, com.ironsource.mediationsdk.i iVar, R1 r12) {
        if (this.f43644c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.f43644c.a(context, iVar, r12);
        }
    }

    @Override // com.ironsource.AbstractC4425m3
    protected K0 g() {
        return new C4221a3();
    }

    @Override // com.ironsource.AbstractC4425m3
    protected P0 h() {
        return new C4307f3(this.f43656o.h(), this);
    }

    @Override // com.ironsource.AbstractC4425m3
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC4425m3, com.ironsource.Db
    public void b() {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.f43660s.f40512f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            if (R()) {
                synchronized (this.f43665x) {
                    try {
                        if (a(AbstractC4425m3.f.SHOWING, AbstractC4425m3.f.READY_TO_LOAD)) {
                            ironLog.verbose("start reload");
                            z10 = true;
                            this.L = true;
                        } else {
                            ironLog.error("wrong state = " + this.f43657p);
                            z10 = false;
                        }
                    } finally {
                    }
                }
                if (z10) {
                    a(this.M, this.f43650i);
                    return;
                }
                return;
            }
            if (this.f43656o.h().a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                ironLog.verbose("banner is not visible, reload skipped");
                this.f43660s.f40512f.b(613);
            }
            U();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            this.f43660s.f40516j.c(th2.getMessage());
        }
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void a(int i10, String str, boolean z10) {
        if (v()) {
            if (!z10) {
                this.f43660s.f40512f.a(C4360i5.a(this.f43655n), i10, str);
                com.ironsource.mediationsdk.n.a().b(this.f43656o.b(), new IronSourceError(i10, str));
            }
            if (v()) {
                a(AbstractC4425m3.f.SHOWING);
                V();
                return;
            }
            return;
        }
        super.a(i10, str, z10);
    }

    private void c(AbstractC4478p3<?> abstractC4478p3, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(AbstractC4425m3.f.READY_TO_SHOW, AbstractC4425m3.f.SHOWING)) {
            this.R.set(false);
            O().e();
            ((J2) abstractC4478p3).R();
            com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new b(abstractC4478p3));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.f43657p);
    }

    public void a(com.ironsource.mediationsdk.q qVar, C4283dd c4283dd) {
        String str;
        IronLog.INTERNAL.verbose("placement = " + c4283dd);
        int iB = 510;
        if (!b(qVar)) {
            str = String.format("can't load banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
        } else if (c4283dd != null && !TextUtils.isEmpty(c4283dd.c())) {
            if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4283dd, this.f43656o.b())) {
                str = String.format("placement %s is capped", c4283dd.c());
                iB = C4644z0.f(this.f43656o.b());
            } else {
                str = null;
            }
        } else {
            str = String.format("can't load banner - %s", c4283dd == null ? "placement is null" : "placement name is empty");
            iB = C4644z0.b(this.f43656o.b());
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.API.error(b(str));
            a(iB, str, false);
        } else {
            com.ironsource.mediationsdk.l.b(qVar);
            this.M = qVar;
            this.f43650i = c4283dd;
            A();
        }
    }

    @Override // com.ironsource.T0
    public void c(AbstractC4478p3<?> abstractC4478p3) {
        IronLog.INTERNAL.verbose(b(abstractC4478p3.k()));
        this.f43661t.b(abstractC4478p3.f());
    }

    boolean b(com.ironsource.mediationsdk.q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }

    private void b(AbstractC4478p3<?> abstractC4478p3, View view, FrameLayout.LayoutParams layoutParams) {
        ((J2) abstractC4478p3).R();
        com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new a(abstractC4478p3));
    }

    @Override // com.ironsource.T0
    public void b(AbstractC4478p3<?> abstractC4478p3) {
        IronLog.INTERNAL.verbose(b(abstractC4478p3.k()));
        this.f43661t.e(abstractC4478p3.f());
    }

    @Override // com.ironsource.AbstractC4425m3
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    public void a(com.ironsource.mediationsdk.q qVar) {
        int iA;
        try {
            if (!b(qVar)) {
                String str = String.format("can't destroy banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
                IronLog.API.error("destroy banner failed - errorMessage = " + str);
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            J2 j22 = (J2) this.f43642a.d();
            if (j22 != null) {
                if (j22.r() != null) {
                    iA = j22.r().intValue();
                } else {
                    iA = this.C.a(this.f43656o.b());
                }
                this.f43660s.f40512f.a(iA);
                j22.P();
                this.f43642a.a(null);
                this.f43642a.b(null);
            }
            com.ironsource.mediationsdk.l.a(qVar);
            this.M = null;
            this.f43650i = null;
            this.L = false;
            if (P().o()) {
                this.Q.set(true);
                this.R.set(false);
                W();
            }
            a(AbstractC4425m3.f.READY_TO_LOAD);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str2 = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f43657p;
            IronLog.INTERNAL.error(b(str2));
            D0 d02 = this.f43660s;
            if (d02 != null) {
                d02.f40516j.g(str2);
            }
        }
    }

    @Override // com.ironsource.AbstractC4425m3, com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        Map<String, Object> mapA = super.a(a02);
        if (b(this.M)) {
            com.ironsource.mediationsdk.l.a(mapA, this.M.getSize());
        }
        if (this.f43650i != null) {
            mapA.put("placement", n());
        }
        return mapA;
    }

    @Override // com.ironsource.InterfaceC4508r0
    public void a(AbstractC4478p3<?> abstractC4478p3, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("mState = " + this.f43657p);
        super.d(abstractC4478p3);
        if (this.f43656o.h().a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (a(AbstractC4425m3.f.READY_TO_SHOW, AbstractC4425m3.f.SHOWING)) {
                this.f43642a.a(abstractC4478p3);
                this.f43642a.b(abstractC4478p3);
                b(abstractC4478p3, view, layoutParams);
                P().k();
                this.f43661t.c(abstractC4478p3.f());
                return;
            }
            return;
        }
        if (P().o()) {
            this.f43642a.b(abstractC4478p3);
            if (this.Q.get()) {
                c(abstractC4478p3, view, layoutParams);
            } else {
                this.O = abstractC4478p3;
                this.N = view;
                this.P = layoutParams;
            }
            this.f43661t.c(abstractC4478p3.f());
        }
    }

    @Override // com.ironsource.AbstractC4425m3, com.ironsource.Q0
    public void a(AbstractC4478p3<?> abstractC4478p3) {
        super.a(abstractC4478p3);
        if (P().o()) {
            if (this.R.compareAndSet(false, true)) {
                O().b();
                U();
            } else {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            }
        }
    }

    @Override // com.ironsource.AbstractC4425m3
    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f43656o.b(), str, this.M);
    }
}
