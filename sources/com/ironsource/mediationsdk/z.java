package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.A5;
import com.ironsource.C4237b1;
import com.ironsource.C4324g3;
import com.ironsource.C4360i5;
import com.ironsource.C4365ia;
import com.ironsource.C4386jf;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.G9;
import com.ironsource.InterfaceC4471od;
import com.ironsource.InterfaceC4630y3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class z extends A implements BannerSmashListener, C4386jf.a, InterfaceC4630y3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f44389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4386jf f44390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f44391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC4471od f44392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f44393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f44394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f44395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f44396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f44397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C4324g3 f44398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f44399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C4360i5 f44400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f44401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f44402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f44403v;

    protected enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    z(k kVar, InterfaceC4471od interfaceC4471od, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, boolean z10) {
        this(kVar, interfaceC4471od, networkSettings, abstractAdapter, i10, "", null, 0, "", z10);
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f43735a != null) {
                if (p()) {
                    this.f43735a.initBannerForBidding(this.f44389h.a(), this.f44389h.i(), this.f43738d, this);
                } else {
                    this.f43735a.initBanners(this.f44389h.a(), this.f44389h.i(), this.f43738d, this);
                }
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f43735a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(612, th2.getLocalizedMessage()));
            a(A5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z10;
        synchronized (this.f44399r) {
            z10 = this.f44391j == a.DESTROYED;
        }
        return z10;
    }

    private boolean C() {
        boolean z10;
        synchronized (this.f44399r) {
            z10 = this.f44391j == a.LOADED;
        }
        return z10;
    }

    private void F() {
        if (this.f43735a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f43735a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f43735a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(A5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean b(A5 a52) {
        return a52 == A5.BN_INSTANCE_LOAD_SUCCESS || a52 == A5.BN_INSTANCE_LOAD || a52 == A5.BN_INSTANCE_RELOAD || a52 == A5.BN_INSTANCE_RELOAD_SUCCESS || a52 == A5.BN_INSTANCE_CLICK || a52 == A5.BN_INSTANCE_DESTROY || a52 == A5.BN_INSTANCE_LOAD_ERROR || a52 == A5.BN_INSTANCE_LOAD_NO_FILL || a52 == A5.BN_INSTANCE_RELOAD_NO_FILL || a52 == A5.BN_INSTANCE_PRESENT_SCREEN || a52 == A5.BN_INSTANCE_DISMISS_SCREEN || a52 == A5.BN_INSTANCE_LEAVE_APP || a52 == A5.BN_INSTANCE_SHOW;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f44402u = true;
        A();
    }

    public void D() {
        this.f43735a.onBannerViewBound(this.f43736b.h().getBannerSettings());
    }

    public void E() {
        this.f43735a.onBannerViewWillBind(this.f43736b.h().getBannerSettings());
    }

    public void a(q qVar, C4324g3 c4324g3, String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.f44398q = c4324g3;
        this.f44403v = jSONObject;
        if (!l.c(qVar)) {
            String str2 = qVar == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            this.f44392k.a(new IronSourceError(610, str2), this, false);
            return;
        }
        if (this.f43735a == null) {
            ironLog.verbose("mAdapter is null");
            this.f44392k.a(new IronSourceError(611, "mAdapter is null"), this, false);
            return;
        }
        this.f44393l = qVar;
        this.f44390i.a((C4386jf.a) this);
        try {
            if (p()) {
                a(str, this.f44403v);
            } else {
                A();
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error("exception = " + th2.getLocalizedMessage());
            onBannerAdLoadFailed(new IronSourceError(605, th2.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.InterfaceC4630y3
    public void collectBiddingData(AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        a(A5.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f43735a.collectBannerBiddingData(this.f43738d, adData != null ? C4365ia.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f43735a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(Map map) {
        r4.a.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(Map map) {
        r4.a.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.a.c(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map map) {
        r4.a.d(this, view, layoutParams, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(Map map) {
        r4.a.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(Map map) {
        r4.a.f(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdShown(Map map) {
        r4.a.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(IronSourceError ironSourceError, Map map) {
        r4.a.h(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(Map map) {
        r4.a.i(this, map);
    }

    @Override // com.ironsource.mediationsdk.A
    public void q() {
        this.f44390i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(A5.BN_INSTANCE_DESTROY);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f43735a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f43736b.h().getBannerSettings());
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f43735a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(A5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f43736b.h().getAdSourceNameForEvents()) ? this.f43736b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f43735a;
    }

    public String x() {
        return this.f44394m;
    }

    public String y() {
        return String.format("%s - ", f());
    }

    public String z() {
        return this.f43736b.i();
    }

    z(k kVar, InterfaceC4471od interfaceC4471od, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new C4237b1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f44399r = new Object();
        this.f44391j = a.NONE;
        this.f44389h = kVar;
        this.f44390i = new C4386jf(kVar.e());
        this.f44392k = interfaceC4471od;
        this.f43740f = i10;
        this.f44394m = str;
        this.f44396o = i11;
        this.f44397p = str2;
        this.f44395n = jSONObject;
        this.f44401t = z10;
        this.f44403v = null;
        if (r()) {
            u();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(A5.BN_INSTANCE_CLICK);
        InterfaceC4471od interfaceC4471od = this.f44392k;
        if (interfaceC4471od != null) {
            interfaceC4471od.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(A5.BN_INSTANCE_LEAVE_APP);
        InterfaceC4471od interfaceC4471od = this.f44392k;
        if (interfaceC4471od != null) {
            interfaceC4471od.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.f44390i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f44390i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f44401t ? A5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : A5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.f44401t ? A5.BN_INSTANCE_RELOAD_SUCCESS : A5.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.f44400s))}});
        InterfaceC4471od interfaceC4471od = this.f44392k;
        if (interfaceC4471od != null) {
            interfaceC4471od.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(A5.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC4471od interfaceC4471od = this.f44392k;
        if (interfaceC4471od != null) {
            interfaceC4471od.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(A5.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC4471od interfaceC4471od = this.f44392k;
        if (interfaceC4471od != null) {
            interfaceC4471od.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(A5.BN_INSTANCE_SHOW);
            InterfaceC4471od interfaceC4471od = this.f44392k;
            if (interfaceC4471od != null) {
                interfaceC4471od.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f44391j);
        a(A5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.f44391j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f44390i.e();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            InterfaceC4471od interfaceC4471od = this.f44392k;
            if (interfaceC4471od != null) {
                interfaceC4471od.a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f44391j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f44402u) {
                this.f44402u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.f44393l)) {
                    a((String) null, this.f44403v);
                } else {
                    this.f44392k.a(new IronSourceError(605, this.f44393l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (a(a.READY_TO_LOAD, a.LOADING)) {
            this.f44400s = new C4360i5();
            a(this.f44401t ? A5.BN_INSTANCE_RELOAD : A5.BN_INSTANCE_LOAD);
            if (this.f43735a != null) {
                try {
                    try {
                        if (p()) {
                            this.f43735a.loadBannerForBidding(this.f43738d, this.f44403v, str, this.f44393l.getSize(), this);
                            return;
                        } else {
                            this.f43735a.loadBanner(this.f43738d, this.f44403v, this.f44393l.getSize(), this);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                Throwable th4 = th;
                C4462o4.d().a(th4);
                IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f43735a.getProviderName() + ", exception =  " + th4.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(605, th4.getLocalizedMessage()));
                a(A5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th4.getLocalizedMessage()}});
                return;
            }
            return;
        }
        ironLog.error("wrong state - state = " + this.f44391j);
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f44399r) {
            try {
                if (this.f44391j == aVar) {
                    IronLog.INTERNAL.verbose(y() + "set state from '" + this.f44391j + "' to '" + aVar2 + "'");
                    this.f44391j = aVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.f44399r) {
            this.f44391j = aVar;
        }
    }

    @Override // com.ironsource.C4386jf.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (a(a.LOADING, aVar2)) {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        } else {
            ironLog.error("unexpected state - " + this.f44391j);
            return;
        }
        a(ironSourceError);
    }

    private void a(IronSourceError ironSourceError) {
        boolean z10 = ironSourceError.getErrorCode() == 606;
        if (z10) {
            a(this.f44401t ? A5.BN_INSTANCE_RELOAD_NO_FILL : A5.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.f44400s))}});
        } else {
            a(this.f44401t ? A5.BN_INSTANCE_RELOAD_ERROR : A5.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.f44400s))}});
        }
        InterfaceC4471od interfaceC4471od = this.f44392k;
        if (interfaceC4471od != null) {
            interfaceC4471od.a(ironSourceError, this, z10);
        }
    }

    public void a(A5 a52) {
        a(a52, (Object[][]) null);
    }

    public void a(A5 a52, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            q qVar = this.f44393l;
            if (qVar != null) {
                l.a(mapM, qVar.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f44394m)) {
            mapM.put("auctionId", this.f44394m);
        }
        JSONObject jSONObject = this.f44395n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f44395n);
        }
        C4324g3 c4324g3 = this.f44398q;
        if (c4324g3 != null) {
            mapM.put("placement", c4324g3.c());
        }
        if (b(a52)) {
            G9.i().a(mapM, this.f44396o, this.f44397p);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f43740f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        G9.i().a(new C4649z5(a52, new JSONObject(mapM)));
    }
}
