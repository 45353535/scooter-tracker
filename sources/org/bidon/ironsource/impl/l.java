package org.bidon.ironsource.impl;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import eg.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.bidon.ironsource.impl.g;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.impl.AdEventFlow;
import org.bidon.sdk.adapter.impl.AdEventFlowImpl;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97363a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97364b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f97365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Job f97366d;

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f97367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f97368c;

        /* JADX INFO: renamed from: org.bidon.ironsource.impl.l$a$a, reason: collision with other inner class name */
        public static final class C1130a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector f97369b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f97370c;

            /* JADX INFO: renamed from: org.bidon.ironsource.impl.l$a$a$a, reason: collision with other inner class name */
            public static final class C1131a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f97371r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f97372s;

                public C1131a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f97371r = obj;
                    this.f97372s |= Integer.MIN_VALUE;
                    return C1130a.this.emit(null, this);
                }
            }

            public C1130a(FlowCollector flowCollector, String str) {
                this.f97369b = flowCollector;
                this.f97370c = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof org.bidon.ironsource.impl.l.a.C1130a.C1131a
                    if (r0 == 0) goto L13
                    r0 = r7
                    org.bidon.ironsource.impl.l$a$a$a r0 = (org.bidon.ironsource.impl.l.a.C1130a.C1131a) r0
                    int r1 = r0.f97372s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97372s = r1
                    goto L18
                L13:
                    org.bidon.ironsource.impl.l$a$a$a r0 = new org.bidon.ironsource.impl.l$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f97371r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f97372s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r7)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.d.b(r7)
                    kotlinx.coroutines.flow.FlowCollector r7 = r5.f97369b
                    r2 = r6
                    org.bidon.ironsource.impl.g r2 = (org.bidon.ironsource.impl.g) r2
                    java.lang.String r2 = r2.a()
                    java.lang.String r4 = r5.f97370c
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                    if (r2 == 0) goto L4e
                    r0.f97372s = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.Unit r6 = kotlin.Unit.f93236a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: org.bidon.ironsource.impl.l.a.C1130a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Flow flow, String str) {
            this.f97367b = flow;
            this.f97368c = str;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f97367b.collect(new C1130a(flowCollector, this.f97368c), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f97374r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f97375s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f97377u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ h f97378v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, h hVar, Continuation continuation) {
            super(2, continuation);
            this.f97377u = str;
            this.f97378v = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, Continuation continuation) {
            return ((b) create(gVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = l.this.new b(this.f97377u, this.f97378v, continuation);
            bVar.f97375s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f97374r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            g gVar = (g) this.f97375s;
            Ad ad2 = l.this.getAd();
            if (ad2 == null) {
                return Unit.f93236a;
            }
            if (gVar instanceof g.d) {
                LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdLoaded: " + this.f97377u + ", " + l.this);
                l.this.emitEvent(new AdEvent.Fill(ad2));
            } else if (gVar instanceof g.c) {
                LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdLoadFailed: " + this.f97377u + ", " + l.this);
                l.this.emitEvent(new AdEvent.LoadFailed(((g.c) gVar).b()));
                Job job = l.this.f97366d;
                if (job != null) {
                    Job.a.a(job, null, 1, null);
                }
                l.this.f97366d = null;
            } else if (gVar instanceof g.e) {
                LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdOpened: " + this.f97377u + ", " + l.this);
                l.this.emitEvent(new AdEvent.Shown(ad2));
                l.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97378v.getPrice() / 1000.0d, "USD", Precision.Precise)));
            } else if (gVar instanceof g.C1127g) {
                LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdShowFailed: " + this.f97377u + ", " + l.this);
                l.this.emitEvent(new AdEvent.ShowFailed(((g.C1127g) gVar).b()));
            } else if (gVar instanceof g.a) {
                LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdClicked: " + this.f97377u + ", " + l.this);
                l.this.emitEvent(new AdEvent.Clicked(ad2));
            } else if (gVar instanceof g.b) {
                LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdClosed: " + this.f97377u + ", " + l.this);
                l.this.emitEvent(new AdEvent.Closed(ad2));
                Job job2 = l.this.f97366d;
                if (job2 != null) {
                    Job.a.a(job2, null, 1, null);
                }
                l.this.f97366d = null;
            } else {
                if (!(gVar instanceof g.f)) {
                    throw new lf.m();
                }
                LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdRewarded: " + this.f97377u + ", " + l.this);
                l.this.emitEvent(new AdEvent.OnReward(ad2, null));
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h d(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new h(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    private final CoroutineScope e() {
        return kotlinx.coroutines.i.a(o0.c());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97364b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97364b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97364b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97364b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97364b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97364b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        this.f97365c = null;
        Job job = this.f97366d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f97366d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97363a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(h adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strB = adParams.b();
        this.f97365c = strB;
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "instanceId")));
            return;
        }
        if (!IronSource.isISDemandOnlyRewardedVideoAvailable(strB)) {
            LogExtKt.logInfo("IronSourceRewardedAdImpl", "loadISDemandOnlyRewardedVideo: " + strB + ", " + this);
            this.f97366d = hg.i.F(hg.i.K(new a(q.b().b(), strB), new b(strB, adParams, null)), e());
            IronSource.loadISDemandOnlyRewardedVideo(adParams.a(), strB);
            return;
        }
        LogExtKt.logInfo("IronSourceRewardedAdImpl", "onAdLoaded: " + strB + ", " + this);
        Ad ad2 = getAd();
        if (ad2 == null) {
            return;
        }
        emitEvent(new AdEvent.Fill(ad2));
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97364b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97363a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97364b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.ironsource.impl.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.d((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97364b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97364b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97364b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        String str = this.f97365c;
        if (str != null) {
            return IronSource.isISDemandOnlyRewardedVideoAvailable(str);
        }
        return false;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97364b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97364b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97364b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97364b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97364b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97364b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97364b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97364b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97364b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97364b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97364b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97364b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97364b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97364b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97364b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (getIsAdReadyToShow()) {
            IronSource.showISDemandOnlyRewardedVideo(this.f97365c);
        } else {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        }
    }
}
