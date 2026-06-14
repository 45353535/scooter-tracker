package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A5;
import com.ironsource.C4237b1;
import com.ironsource.C4255c2;
import com.ironsource.C4283dd;
import com.ironsource.C4306f2;
import com.ironsource.C4360i5;
import com.ironsource.C4424m2;
import com.ironsource.C4446n5;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4220a2;
import com.ironsource.M8;
import com.ironsource.Td;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, InterfaceC4220a2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4360i5 f43962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C4360i5 f43963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ISDemandOnlyRewardedVideoListener f43964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C4255c2 f43965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f43966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p f43967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final M8 f43968t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final M8.a f43969u;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C4237b1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.f43967s = new p.b();
        this.f43968t = Ib.U().s();
        this.f43969u = Ib.O().h();
        this.f43964p = iSDemandOnlyRewardedVideoListener;
        this.f43976f = j10;
        this.f43966r = eVar;
        this.f43971a.initRewardedVideoForDemandOnly(str, str2, this.f43973c, this);
    }

    private void c(o oVar) {
        this.f43962n = new C4360i5();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.f43958k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new C4446n5());
            C4424m2 c4424m2A = new a.C0470a(aVar.h()).a(h());
            if (c4424m2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(A5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strK = c4424m2A.k();
            if (strK == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(A5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f43965q.a(c4424m2A.b());
            this.f43963o = new C4360i5();
            this.f43971a.loadRewardedVideoForBidding(this.f43973c, null, strK, this);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e10.getMessage()));
        }
    }

    private IronSourceError q() {
        return a(m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.i r() {
        String str = i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f43983m);
        iVar.b(IronSourceUtils.g());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.f43968t.a(this.f43983m));
        C4306f2 c4306f2 = new C4306f2(h(), false);
        c4306f2.a(this.f43967s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f43971a.getRewardedVideoBiddingData(this.f43973c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c4306f2.b(rewardedVideoBiddingData);
        }
        iVar.a(c4306f2);
        return iVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.f43963o = new C4360i5();
        this.f43971a.loadRewardedVideo(this.f43973c, null, this);
    }

    private void u() {
        if (!this.f43966r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(A5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.i iVarR = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + iVarR.r());
        a(A5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, iVarR.r()}});
        this.f43966r.a(ContextProvider.getInstance().getApplicationContext(), iVarR, this);
    }

    private void v() {
        this.f43977g = null;
        this.f43978h = null;
        this.f43980j = null;
        this.f43965q = new C4255c2();
    }

    private void w() {
        this.f43962n = new C4360i5();
        a(s());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(A5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!a(m.a.LOADED)) {
            a(A5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f43971a.isRewardedVideoAvailable(this.f43973c);
            a(zIsRewardedVideoAvailable ? A5.RV_INSTANCE_READY_TRUE : A5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsRewardedVideoAvailable;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("exception=" + e10.getMessage());
            return zIsRewardedVideoAvailable;
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(A5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(A5.RV_INSTANCE_SHOW, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f43971a.showRewardedVideo(this.f43973c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClicked(Map map) {
        r4.c.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClosed(Map map) {
        r4.c.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdOpened(Map map) {
        r4.c.d(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdRewarded(Map map) {
        r4.c.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map map) {
        r4.c.f(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(Map map) {
        r4.c.h(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.c.l(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadSuccess(Map map) {
        r4.c.m(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.f43964p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f43968t.a(this.f43983m))}});
        this.f43969u.b(this.f43983m);
        this.f43964p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdEnded(Map map) {
        r4.c.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        a(this.f43965q.a(), IronSourceUtils.a());
        this.f43964p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> mapJ = j();
        if (!TextUtils.isEmpty(r.m().l())) {
            mapJ.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, r.m().l());
        }
        if (r.m().r() != null) {
            for (String str : r.m().r().keySet()) {
                mapJ.put("custom_" + str, r.m().r().get(str));
            }
        }
        C4283dd c4283ddA = r.m().h().c().f().a();
        if (c4283ddA != null) {
            mapJ.put("placement", c4283ddA.c());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_NAME, c4283ddA.f());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(c4283ddA.e()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C4649z5 c4649z5 = new C4649z5(A5.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(mapJ));
        c4649z5.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c4649z5.d(), h()));
        Td.i().a(c4649z5);
        this.f43964p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(A5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f43964p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdStarted(Map map) {
        r4.c.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(A5.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z10, Map map) {
        r4.c.i(this, z10, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map map) {
        r4.c.j(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitSuccess(Map map) {
        r4.c.k(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(A5.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43963o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(A5.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43963o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(A5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.f43962n))}});
            a(this.f43965q.c(), IronSourceUtils.a());
            this.f43964p.onRewardedVideoAdLoadSuccess(l());
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C4360i5.a(this.f43962n));
            a(this.f43965q.b(), IronSourceUtils.a());
            this.f43964p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
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
        Td.i().a(new C4649z5(a52, new JSONObject(mapJ)));
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(A5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(A5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void c() {
        String str;
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            if (aVarA == aVar3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.f43964p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, str));
            return;
        }
        v();
        a(A5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        w();
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
        this.f43967s = aVar.a(l());
        a.C0470a c0470a = new a.C0470a(aVar.h());
        if (!c0470a.isEmpty()) {
            C4424m2 c4424m2 = c0470a.get(0);
            this.f43965q.a(c4424m2.b());
            this.f43965q.c(c4424m2.h());
            this.f43965q.b(c4424m2.g());
            strK = c4424m2.k();
            b(strK);
        } else {
            strK = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a(A5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(A5.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        a(A5.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0470a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0470a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
                ironLog.error("rewardedVideo - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(strK);
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(A5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f43971a.loadRewardedVideoForBidding(this.f43973c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.R1
    public void a(List<C4424m2> list, String str, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.R1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f43977g = null;
        this.f43978h = null;
        a(A5.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.f43957j, "No available ad to load"));
        }
    }
}
