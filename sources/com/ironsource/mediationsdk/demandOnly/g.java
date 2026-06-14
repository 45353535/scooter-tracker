package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A5;
import com.ironsource.C4237b1;
import com.ironsource.C4255c2;
import com.ironsource.C4306f2;
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
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class g extends m implements n.a, InterstitialSmashListener, InterfaceC4220a2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4360i5 f43924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C4360i5 f43925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ISDemandOnlyInterstitialListener f43926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C4255c2 f43927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f43928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p f43929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final M8 f43930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final M8.a f43931u;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C4237b1(networkSettings, networkSettings.getInterstitialSettings(), IronSource.a.INTERSTITIAL), abstractAdapter);
        this.f43929s = new p.b();
        this.f43930t = Ib.U().s();
        this.f43931u = Ib.O().h();
        this.f43926p = iSDemandOnlyInterstitialListener;
        this.f43976f = j10;
        this.f43928r = eVar;
        this.f43971a.initInterstitial(str, str2, this.f43973c, this);
    }

    private void c(o oVar) {
        this.f43924n = new C4360i5();
        a(new a());
        if (!n()) {
            a(new IronSourceError(e.a.f43920k, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new C4446n5());
            C4424m2 c4424m2A = new a.C0470a(aVar.h()).a(h());
            if (c4424m2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(A5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strK = c4424m2A.k();
            if (strK == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(e.a.f43918i, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(A5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f43927q.a(c4424m2A.b());
            this.f43925o = new C4360i5();
            this.f43971a.loadInterstitialForBidding(this.f43973c, null, strK, this);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e10.getMessage()));
        }
    }

    private com.ironsource.mediationsdk.i q() {
        String str = i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f43983m);
        iVar.b(IronSourceUtils.g());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.f43930t.a(this.f43983m));
        C4306f2 c4306f2 = new C4306f2(h(), false);
        c4306f2.a(this.f43929s.value());
        Map<String, Object> interstitialBiddingData = this.f43971a.getInterstitialBiddingData(this.f43973c, new JSONObject());
        if (interstitialBiddingData != null) {
            c4306f2.b(interstitialBiddingData);
        }
        iVar.a(c4306f2);
        return iVar;
    }

    private void r() {
        this.f43925o = new C4360i5();
        this.f43971a.loadInterstitial(this.f43973c, null, this);
    }

    private void s() {
        if (!this.f43928r.a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(A5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.i iVarQ = q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + iVarQ.r());
        a(A5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, iVarQ.r()}});
        this.f43928r.a(ContextProvider.getInstance().getApplicationContext(), iVarQ, this);
    }

    private void t() {
        this.f43977g = null;
        this.f43978h = null;
        this.f43980j = null;
        this.f43927q = new C4255c2();
    }

    private void u() {
        this.f43924n = new C4360i5();
        a(new b());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(A5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(A5.IS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.f43926p.onInterstitialAdLoadFailed(l(), new IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(A5.IS_INSTANCE_LOAD, (Object[][]) null);
        u();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void e() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(A5.IS_INSTANCE_SHOW, (Object[][]) null);
        m.a aVar = m.a.LOADED;
        m.a aVar2 = m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f43971a.showInterstitial(this.f43973c, this);
        } else {
            onInterstitialAdShowFailed(a(aVar2) ? new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(Map map) {
        r4.b.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(Map map) {
        r4.b.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.b.c(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdOpened(Map map) {
        r4.b.d(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdReady(Map map) {
        r4.b.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map map) {
        r4.b.f(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdVisible(Map map) {
        r4.b.h(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.IS_INSTANCE_CLICKED, new Object[0][]);
        this.f43926p.onInterstitialAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f43930t.a(this.f43983m))}});
        this.f43931u.b(this.f43983m);
        this.f43926p.onInterstitialAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(A5.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43925o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.IS_INSTANCE_OPENED, new Object[0][]);
        a(this.f43927q.a(), IronSourceUtils.a());
        this.f43926p.onInterstitialAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(A5.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43925o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(A5.IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43924n))}});
            a(this.f43927q.c(), IronSourceUtils.a());
            this.f43926p.onInterstitialAdReady(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(A5.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f43926p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowSucceeded(Map map) {
        r4.b.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(IronSourceError ironSourceError, Map map) {
        r4.b.i(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(Map map) {
        r4.b.j(this, map);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        A5 a52;
        boolean zIsInterstitialReady = false;
        if (!a(m.a.LOADED)) {
            a(A5.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsInterstitialReady = this.f43971a.isInterstitialReady(this.f43973c);
            if (zIsInterstitialReady) {
                a52 = A5.IS_INSTANCE_READY_TRUE;
            } else {
                a52 = A5.IS_INSTANCE_READY_FALSE;
            }
            a(a52, (Object[][]) null);
            return zIsInterstitialReady;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("exception=" + e10.getMessage());
            return zIsInterstitialReady;
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C4360i5.a(this.f43924n));
            a(this.f43927q.b(), IronSourceUtils.a());
            this.f43926p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(A5 a52, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapJ.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e10));
            }
        }
        G9.i().a(new C4649z5(a52, new JSONObject(mapJ)));
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(e.a.f43918i, "No available ad to load"));
            } else {
                a(A5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f43971a.loadInterstitialForBidding(this.f43973c, null, str, this);
            }
        }
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(A5.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(A5.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f43980j, str);
    }

    @Override // com.ironsource.InterfaceC4220a2
    public void a(d.a aVar, int i10, long j10, int i11, String str) {
        String strK;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f43977g = aVar.a();
        this.f43978h = aVar.f();
        this.f43929s = aVar.a(l());
        a.C0470a c0470a = new a.C0470a(aVar.h());
        if (!c0470a.isEmpty()) {
            C4424m2 c4424m2 = c0470a.get(0);
            this.f43927q.a(c4424m2.b());
            this.f43927q.c(c4424m2.h());
            this.f43927q.b(c4424m2.g());
            strK = c4424m2.k();
            b(strK);
        } else {
            strK = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a(A5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(A5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        a(A5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0470a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0470a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
                ironLog.error("interstitial - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(strK);
        }
    }

    @Override // com.ironsource.R1
    public void a(List<C4424m2> list, String str, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.R1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("error " + i10 + " - " + str);
        this.f43977g = null;
        this.f43978h = null;
        a(A5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(e.a.f43919j, "No available ad to load"));
        }
    }
}
