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
public final class j implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97347a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97348b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f97349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Job f97350d;

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f97351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f97352c;

        /* JADX INFO: renamed from: org.bidon.ironsource.impl.j$a$a, reason: collision with other inner class name */
        public static final class C1128a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector f97353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f97354c;

            /* JADX INFO: renamed from: org.bidon.ironsource.impl.j$a$a$a, reason: collision with other inner class name */
            public static final class C1129a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f97355r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f97356s;

                public C1129a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f97355r = obj;
                    this.f97356s |= Integer.MIN_VALUE;
                    return C1128a.this.emit(null, this);
                }
            }

            public C1128a(FlowCollector flowCollector, String str) {
                this.f97353b = flowCollector;
                this.f97354c = str;
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
                    boolean r0 = r7 instanceof org.bidon.ironsource.impl.j.a.C1128a.C1129a
                    if (r0 == 0) goto L13
                    r0 = r7
                    org.bidon.ironsource.impl.j$a$a$a r0 = (org.bidon.ironsource.impl.j.a.C1128a.C1129a) r0
                    int r1 = r0.f97356s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97356s = r1
                    goto L18
                L13:
                    org.bidon.ironsource.impl.j$a$a$a r0 = new org.bidon.ironsource.impl.j$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f97355r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f97356s
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
                    kotlinx.coroutines.flow.FlowCollector r7 = r5.f97353b
                    r2 = r6
                    org.bidon.ironsource.impl.g r2 = (org.bidon.ironsource.impl.g) r2
                    java.lang.String r2 = r2.a()
                    java.lang.String r4 = r5.f97354c
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                    if (r2 == 0) goto L4e
                    r0.f97356s = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.Unit r6 = kotlin.Unit.f93236a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: org.bidon.ironsource.impl.j.a.C1128a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Flow flow, String str) {
            this.f97351b = flow;
            this.f97352c = str;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f97351b.collect(new C1128a(flowCollector, this.f97352c), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f97358r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f97359s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f97361u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ h f97362v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, h hVar, Continuation continuation) {
            super(2, continuation);
            this.f97361u = str;
            this.f97362v = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, Continuation continuation) {
            return ((b) create(gVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = j.this.new b(this.f97361u, this.f97362v, continuation);
            bVar.f97359s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f97358r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            g gVar = (g) this.f97359s;
            Ad ad2 = j.this.getAd();
            if (ad2 == null) {
                return Unit.f93236a;
            }
            if (gVar instanceof g.d) {
                LogExtKt.logInfo("IronSourceInterstitialImpl", "onAdLoaded: " + this.f97361u + ", " + j.this);
                j.this.emitEvent(new AdEvent.Fill(ad2));
            } else if (gVar instanceof g.c) {
                LogExtKt.logInfo("IronSourceInterstitialImpl", "onAdLoadFailed: " + this.f97361u + ", " + j.this);
                j.this.emitEvent(new AdEvent.LoadFailed(((g.c) gVar).b()));
                Job job = j.this.f97350d;
                if (job != null) {
                    Job.a.a(job, null, 1, null);
                }
                j.this.f97350d = null;
            } else if (gVar instanceof g.e) {
                LogExtKt.logInfo("IronSourceInterstitialImpl", "onAdOpened: " + this.f97361u + ", " + j.this);
                j.this.emitEvent(new AdEvent.Shown(ad2));
                j.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97362v.getPrice() / 1000.0d, "USD", Precision.Precise)));
            } else if (gVar instanceof g.C1127g) {
                LogExtKt.logInfo("IronSourceInterstitialImpl", "onAdShowFailed: " + this.f97361u + ", " + j.this);
                j.this.emitEvent(new AdEvent.ShowFailed(((g.C1127g) gVar).b()));
            } else if (gVar instanceof g.a) {
                LogExtKt.logInfo("IronSourceInterstitialImpl", "onAdClicked: " + this.f97361u + ", " + j.this);
                j.this.emitEvent(new AdEvent.Clicked(ad2));
            } else if (gVar instanceof g.b) {
                LogExtKt.logInfo("IronSourceInterstitialImpl", "onAdClosed: " + this.f97361u + ", " + j.this);
                j.this.emitEvent(new AdEvent.Closed(ad2));
                Job job2 = j.this.f97350d;
                if (job2 != null) {
                    Job.a.a(job2, null, 1, null);
                }
                j.this.f97350d = null;
            } else if (!(gVar instanceof g.f)) {
                throw new lf.m();
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
        this.f97348b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97348b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97348b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97348b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97348b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97348b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        this.f97349c = null;
        Job job = this.f97350d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f97350d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97347a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(h adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strB = adParams.b();
        this.f97349c = strB;
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "instanceId")));
            return;
        }
        if (!IronSource.isISDemandOnlyInterstitialReady(strB)) {
            LogExtKt.logInfo("IronSourceInterstitialImpl", "loadISDemandOnlyInterstitial: " + strB + ", " + this);
            this.f97350d = hg.i.F(hg.i.K(new a(q.b().b(), strB), new b(strB, adParams, null)), e());
            IronSource.loadISDemandOnlyInterstitial(adParams.a(), strB);
            return;
        }
        LogExtKt.logInfo("IronSourceInterstitialImpl", "onAdLoaded: " + strB + ", " + this);
        Ad ad2 = getAd();
        if (ad2 == null) {
            return;
        }
        emitEvent(new AdEvent.Fill(ad2));
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97348b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97347a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97348b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.ironsource.impl.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.d((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97348b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97348b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97348b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        String str = this.f97349c;
        if (str != null) {
            return IronSource.isISDemandOnlyInterstitialReady(str);
        }
        return false;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97348b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97348b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97348b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97348b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97348b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97348b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97348b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97348b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97348b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97348b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97348b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97348b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97348b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97348b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97348b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (getIsAdReadyToShow()) {
            IronSource.showISDemandOnlyInterstitial(this.f97349c);
        } else {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        }
    }
}
