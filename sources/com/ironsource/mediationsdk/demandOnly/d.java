package com.ironsource.mediationsdk.demandOnly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C4237b1;
import com.ironsource.C4255c2;
import com.ironsource.C4360i5;
import com.ironsource.C4424m2;
import com.ironsource.C4446n5;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.G9;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4220a2;
import com.ironsource.M8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.b;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d extends m implements BannerSmashListener, InterfaceC4220a2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4360i5 f43898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C4360i5 f43899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f43900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f43901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C4255c2 f43902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f43903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ISDemandOnlyBannerLayout f43904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final M8 f43905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final M8.a f43906v;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.i f43907a;

        a(com.ironsource.mediationsdk.i iVar) {
            this.f43907a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f43907a.r());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f43907a.r()}});
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            d dVar = d.this;
            dVar.f43903s.a(applicationContext, this.f43907a, dVar);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C4237b1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f43905u = Ib.U().s();
        this.f43906v = Ib.O().h();
        this.f43976f = j10;
        this.f43900p = str;
        this.f43901q = str2;
        this.f43902r = new C4255c2();
        this.f43971a.initBannerForBidding(str, str2, this.f43973c, this);
        this.f43903s = eVar;
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f43904t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.f43977g = null;
        this.f43978h = null;
        this.f43902r = new C4255c2();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f43889e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.f43889e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.f43889e, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f43904t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            d.a aVar2 = (d.a) oVar.a(new C4446n5());
            C4424m2 c4424m2A = new a.C0470a(aVar2.h()).a(h());
            if (c4424m2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError2);
                return;
            }
            String strK = c4424m2A.k();
            if (strK == null) {
                ironLog.error("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (Object[][]) null);
            this.f43902r.a(c4424m2A.b());
            this.f43898n = new C4360i5();
            w();
            this.f43971a.initBannerForBidding(this.f43900p, this.f43901q, this.f43973c, this);
            this.f43971a.loadBannerForDemandOnlyForBidding(this.f43973c, strK, iSDemandOnlyBannerLayout, this);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            if (t()) {
                map.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.l.a(map, this.f43904t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f43971a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f43971a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f43972b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f43972b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.f43972b.d()));
            if (!TextUtils.isEmpty(this.f43977g)) {
                map.put("auctionId", this.f43977g);
            }
            JSONObject jSONObject = this.f43978h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f43978h);
            }
            if (!TextUtils.isEmpty(this.f43980j)) {
                map.put("dynamicDemandSource", this.f43980j);
                return map;
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("Instance: " + h() + " " + e10.getMessage());
        }
        return map;
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
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
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

    com.ironsource.mediationsdk.i q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(IronSource.a.BANNER);
        iVar.a(arrayList);
        iVar.d(str);
        iVar.c(l());
        iVar.b(IronSourceUtils.g());
        iVar.a(true);
        iVar.c(true);
        iVar.a(this.f43904t.getSize());
        return iVar;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f43904t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.f43904t = null;
        AbstractAdapter abstractAdapter = this.f43971a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f43973c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.f43972b.h().isMultipleInstances() ? this.f43972b.h().getProviderTypeForReflection() : this.f43972b.h().getProviderName();
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (Object[][]) null);
                this.f43899o = new C4360i5();
                this.f43971a.initBannerForBidding(this.f43900p, this.f43901q, this.f43973c, this);
                this.f43971a.loadBannerForDemandOnlyForBidding(this.f43973c, str, this.f43904t, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f43904t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(b.C0471b.f43882g, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f43904t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43899o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        M8 m82 = this.f43905u;
        IronSource.a aVar = IronSource.a.BANNER;
        int iA = m82.a(aVar);
        a(b.c.f43888d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43899o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.f43904t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43898n))}});
            this.f43906v.b(aVar);
            a(this.f43902r.c(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f43904t.getListener().c(l());
        }
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
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.f43902r.a(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f43904t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f43889e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA != aVar && aVarA != m.a.SHOW_IN_PROGRESS) {
            v();
            a(3002, (Object[][]) null);
            if (!o()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                a(new IronSourceError(1063, "Missing configuration settings"));
                return;
            }
            this.f43904t = iSDemandOnlyBannerLayout;
            this.f43898n = new C4360i5();
            w();
            if (this.f43903s.a()) {
                u();
                return;
            } else {
                ironLog.verbose("can't load the banner the auction isn't enabled");
                a(new IronSourceError(1063, "Missing server configuration"));
                return;
            }
        }
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(b.c.f43889e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
            return;
        }
        String str = "banner layout in blocking state | state: " + k();
        iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
        a(b.c.f43889e, new Object[][]{new Object[]{"reason", str}});
    }

    @Override // com.ironsource.R1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f43977g = null;
        this.f43978h = null;
        a(b.c.f43891g, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.R1
    public void a(List<C4424m2> list, String str, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, C4360i5.a(this.f43898n));
            a(this.f43902r.b(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f43904t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 606) {
            a(b.C0471b.f43884i, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a(3300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapJ.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        G9.i().a(new C4649z5(i10, new JSONObject(mapJ)));
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f43980j, str);
    }

    @Override // com.ironsource.InterfaceC4220a2
    public void a(@Nullable d.a aVar, int i10, long j10, int i11, @Nullable String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f43977g = aVar.a();
        this.f43978h = aVar.f();
        a.C0470a c0470a = new a.C0470a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(b.c.f43892h, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        a(b.c.f43894j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0470a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0470a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(b.C0471b.f43884i, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            C4424m2 c4424m2 = c0470a.get(0);
            this.f43902r.a(c4424m2.b());
            this.f43902r.c(c4424m2.h());
            this.f43902r.b(c4424m2.g());
            String strK = c4424m2.k();
            b(strK);
            c(strK);
        }
    }
}
