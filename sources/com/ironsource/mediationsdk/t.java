package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A5;
import com.ironsource.C4237b1;
import com.ironsource.C4283dd;
import com.ironsource.C4365ia;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4586va;
import com.ironsource.InterfaceC4630y3;
import com.ironsource.M8;
import com.ironsource.Td;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class t extends A implements RewardedVideoSmashListener, InterfaceC4630y3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f44232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC4586va f44233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Timer f44234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f44235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f44236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f44237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4283dd f44238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f44239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f44240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f44241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f44242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f44243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f44244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f44245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f44246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final M8.a f44247w;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            boolean z10;
            t tVar = t.this;
            b bVar = tVar.f44232h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || bVar == b.INIT_IN_PROGRESS) {
                if (bVar == bVar2) {
                    i10 = 1025;
                } else {
                    i10 = 1032;
                    str = "Rewarded Video - init instance time out";
                }
                tVar.a(b.NOT_LOADED);
                i11 = i10;
                z10 = true;
            } else {
                i11 = 510;
                z10 = false;
            }
            t.this.a(str);
            if (!z10) {
                t.this.a(A5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", 1025}, new Object[]{"duration", Long.valueOf(t.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, t.this.f44232h.name()}});
                return;
            }
            t.this.a(A5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i11)}, new Object[]{"duration", Long.valueOf(t.this.v())}});
            t.this.a(A5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i11)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(t.this.v())}});
            t tVar2 = t.this;
            tVar2.f44233i.d(tVar2);
        }
    }

    protected enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public t(String str, String str2, NetworkSettings networkSettings, InterfaceC4586va interfaceC4586va, int i10, AbstractAdapter abstractAdapter, int i11) {
        super(new C4237b1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.f44244t = new Object();
        this.f44245u = new Object();
        this.f44247w = Ib.O().h();
        this.f44236l = str;
        this.f44237m = str2;
        this.f44233i = interfaceC4586va;
        this.f44234j = null;
        this.f44235k = i10;
        this.f43740f = i11;
        this.f44232h = b.NO_INIT;
        this.f44246v = 0L;
        if (r()) {
            t();
        }
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f43735a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            a("setCustomParams() " + th2.getMessage());
        }
    }

    private void D() {
        synchronized (this.f44245u) {
            Timer timer = new Timer();
            this.f44234j = timer;
            timer.schedule(new a(), this.f44235k * 1000);
        }
    }

    private void E() {
        synchronized (this.f44245u) {
            try {
                Timer timer = this.f44234j;
                if (timer != null) {
                    timer.cancel();
                    this.f44234j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(A5 a52) {
        return a52 == A5.RV_BUSINESS_INSTANCE_LOAD || a52 == A5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS || a52 == A5.RV_INSTANCE_LOAD_FAILED || a52 == A5.RV_INSTANCE_LOAD_FAILED_REASON || a52 == A5.RV_INSTANCE_LOAD_NO_FILL || a52 == A5.RV_BUSINESS_INSTANCE_OPENED || a52 == A5.RV_INSTANCE_CLOSED || a52 == A5.RV_INSTANCE_SHOW || a52 == A5.RV_INSTANCE_SHOW_FAILED || a52 == A5.RV_BUSINESS_INSTANCE_CLICKED || a52 == A5.RV_BUSINESS_INSTANCE_REWARDED;
    }

    public boolean A() {
        if (this.f44232h != b.LOADED) {
            return false;
        }
        try {
            return this.f43735a.isRewardedVideoAvailable(this.f43738d);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            b("isReadyToShow exception: " + th2.getLocalizedMessage());
            a(A5.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", 5002}, new Object[]{"reason", th2.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(A5.RV_CAP_SESSION);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:46:0x011d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(java.lang.String r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.t.a(java.lang.String, org.json.JSONObject):void");
    }

    public void b(boolean z10) {
        b(A5.RV_INSTANCE_SHOW_CHANCE, new Object[][]{new Object[]{"status", z10 ? "true" : "false"}});
    }

    @Override // com.ironsource.InterfaceC4630y3
    public void collectBiddingData(AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        a(A5.RV_INSTANCE_COLLECT_TOKEN);
        try {
            this.f43735a.collectRewardedVideoBiddingData(this.f43738d, adData != null ? C4365ia.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            b("collectBiddingData exception: " + th2.getLocalizedMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.A
    public int l() {
        return 2;
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
    public /* synthetic */ void onRewardedVideoAdEnded(Map map) {
        r4.c.c(this, map);
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
    public /* synthetic */ void onRewardedVideoAdStarted(Map map) {
        r4.c.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(Map map) {
        r4.c.h(this, map);
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
    public /* synthetic */ void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.c.l(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public C4283dd x() {
        return this.f44238n;
    }

    public boolean y() {
        return this.f44232h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.f44232h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f43735a.initRewardedVideoWithCallback(this.f44236l, this.f44237m, this.f43738d, this);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            b("initForBidding exception: " + th2.getLocalizedMessage());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return new Date().getTime() - this.f44239o;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f44233i.b(this, this.f44238n);
        b(A5.RV_BUSINESS_INSTANCE_CLICKED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.f44244t) {
            try {
                if (this.f44232h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.f44246v = new Date().getTime();
                    this.f44233i.c(this);
                    return;
                }
                b(A5.RV_INSTANCE_CLOSED);
                a(A5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f44232h}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f44233i.e(this);
        b(A5.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f44233i.f(this);
        b(A5.RV_BUSINESS_INSTANCE_OPENED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f44233i.a(this, this.f44238n);
        Map<String, Object> mapM = m();
        C4283dd c4283dd = this.f44238n;
        if (c4283dd != null) {
            mapM.put("placement", c4283dd.c());
            mapM.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f44238n.f());
            mapM.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f44238n.e()));
        }
        if (!TextUtils.isEmpty(r.m().l())) {
            mapM.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, r.m().l());
        }
        if (r.m().r() != null) {
            for (String str : r.m().r().keySet()) {
                mapM.put("custom_" + str, r.m().r().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f44240p)) {
            mapM.put("auctionId", this.f44240p);
        }
        JSONObject jSONObject = this.f44241q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f44241q);
        }
        A5 a52 = A5.RV_BUSINESS_INSTANCE_REWARDED;
        if (c(a52)) {
            Td.i().a(mapM, this.f44242r, this.f44243s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f43740f));
        C4649z5 c4649z5 = new C4649z5(a52, new JSONObject(mapM));
        c4649z5.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c4649z5.d(), c()));
        long j10 = this.f44246v;
        if (j10 != 0) {
            long j11 = time - j10;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j11);
            c4649z5.a("duration", Long.valueOf(j11));
        }
        Td.i().a(c4649z5);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(A5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f44244t) {
            try {
                if (this.f44232h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.f44233i.a(ironSourceError, this);
                    return;
                }
                a(A5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f44232h}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f44233i.b(this);
        b(A5.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(A5.RV_INSTANCE_VISIBLE);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        a("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f44232h.name());
        synchronized (this.f44244t) {
            try {
                if (this.f44232h == b.LOAD_IN_PROGRESS) {
                    a(z10 ? b.LOADED : b.NOT_LOADED);
                    z11 = false;
                } else {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            if (z10) {
                a(A5.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f44232h.name()}});
                return;
            } else {
                a(A5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f44232h.name()}});
                return;
            }
        }
        E();
        a(z10 ? A5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS : A5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(v())}});
        if (z10) {
            this.f44233i.a(this);
        } else {
            this.f44233i.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(A5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(v())}});
        a(A5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
        synchronized (this.f44244t) {
            try {
                if (this.f44232h == b.INIT_IN_PROGRESS) {
                    a(b.NO_INIT);
                    this.f44233i.d(this);
                    return;
                }
                a(A5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f44232h}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.f44244t) {
            try {
                if (this.f44232h == b.INIT_IN_PROGRESS) {
                    a(b.NOT_LOADED);
                    return;
                }
                a(A5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f44232h}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(A5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f43741g = Long.valueOf(System.currentTimeMillis());
        }
        a(A5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadSuccess(Map map) {
        r4.c.m(this, map);
    }

    public String u() {
        return this.f44240p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f43735a.getLoadWhileShowSupportState(this.f43738d);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th2.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    private void b(A5 a52) {
        b(a52, null);
    }

    public void b(A5 a52, Object[][] objArr) {
        a(a52, objArr, true);
    }

    public t(t tVar, InterfaceC4586va interfaceC4586va, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2) {
        this(tVar.f44236l, tVar.f44237m, tVar.f43736b.h(), interfaceC4586va, tVar.f44235k, abstractAdapter, i10);
        this.f44240p = str;
        this.f44241q = jSONObject;
        this.f44242r = i11;
        this.f44243s = str2;
    }

    public void a(C4283dd c4283dd) {
        E();
        a("showVideo()");
        this.f44238n = c4283dd;
        a(b.SHOW_IN_PROGRESS);
        b(A5.RV_INSTANCE_SHOW);
        try {
            this.f43735a.showRewardedVideo(this.f43738d, this);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            b("showVideo exception: " + th2.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.f44232h + ", new state=" + bVar);
        synchronized (this.f44244t) {
            this.f44232h = bVar;
        }
    }

    public void a(A5 a52) {
        a(a52, null, false);
    }

    public void a(A5 a52, Object[][] objArr) {
        a(a52, objArr, false);
    }

    private void a(A5 a52, Object[][] objArr, boolean z10) {
        C4283dd c4283dd;
        Map<String, Object> mapM = m();
        if (!TextUtils.isEmpty(this.f44240p)) {
            mapM.put("auctionId", this.f44240p);
        }
        JSONObject jSONObject = this.f44241q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f44241q);
        }
        if (z10 && (c4283dd = this.f44238n) != null && !TextUtils.isEmpty(c4283dd.c())) {
            mapM.put("placement", this.f44238n.c());
        }
        if (c(a52)) {
            Td.i().a(mapM, this.f44242r, this.f44243s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f43740f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        Td.i().a(new C4649z5(a52, new JSONObject(mapM)));
        if (a52 == A5.RV_INSTANCE_CLOSED) {
            this.f44247w.b(IronSource.a.REWARDED_VIDEO);
        }
    }
}
