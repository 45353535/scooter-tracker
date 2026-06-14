package com.ironsource;

import android.app.Activity;
import com.ironsource.C4406l1;
import com.ironsource.InterfaceC4356i1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Fd implements InterfaceC4276d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private L9 f40913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC4218a0 f40914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private W1 f40915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC4476p1 f40916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private InterfaceC4367ic f40917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Kf f40918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private M8 f40919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private M8.a f40920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, Fd> f40921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private RewardedAdInfo f40922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Gd f40923k;

    public Fd(@NotNull L9 adInstance, @NotNull InterfaceC4218a0 adNetworkShow, @NotNull W1 auctionDataReporter, @NotNull InterfaceC4476p1 analytics, @NotNull InterfaceC4367ic networkDestroyAPI, @NotNull Kf threadManager, @NotNull M8 sessionDepthService, @NotNull M8.a sessionDepthServiceEditor, @NotNull Map<String, Fd> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f40913a = adInstance;
        this.f40914b = adNetworkShow;
        this.f40915c = auctionDataReporter;
        this.f40916d = analytics;
        this.f40917e = networkDestroyAPI;
        this.f40918f = threadManager;
        this.f40919g = sessionDepthService;
        this.f40920h = sessionDepthServiceEditor;
        this.f40921i = retainer;
        String strF = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = this.f40913a.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        this.f40922j = new RewardedAdInfo(strF, strE);
        C4242b6 c4242b6 = new C4242b6();
        this.f40913a.a(c4242b6);
        c4242b6.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Fd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Gd gd2 = this$0.f40923k;
        if (gd2 != null) {
            gd2.onRewardedAdShown();
        }
    }

    public final void a(@NotNull RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.f40922j = rewardedAdInfo;
    }

    @NotNull
    public final RewardedAdInfo b() {
        return this.f40922j;
    }

    @Nullable
    public final Gd c() {
        return this.f40923k;
    }

    public final boolean d() {
        boolean zA = this.f40914b.a(this.f40913a);
        InterfaceC4356i1.a.f43302a.a(zA).a(this.f40916d);
        return zA;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4356i1.a.f43302a.f(new InterfaceC4423m1[0]).a(this.f40916d);
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidClick() {
        InterfaceC4356i1.a.f43302a.a().a(this.f40916d);
        this.f40918f.a(new Runnable() { // from class: com.ironsource.sh
            @Override // java.lang.Runnable
            public final void run() {
                Fd.b(this.f45417b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidDismiss() {
        this.f40921i.remove(this.f40922j.getAdId());
        InterfaceC4356i1.a.f43302a.a(new InterfaceC4423m1[0]).a(this.f40916d);
        this.f40918f.a(new Runnable() { // from class: com.ironsource.th
            @Override // java.lang.Runnable
            public final void run() {
                Fd.c(this.f45516b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidReward(@Nullable String str, int i10) {
        C4406l1.u uVar = new C4406l1.u("Virtual Item");
        C4406l1.t tVar = new C4406l1.t(1);
        C4406l1.q qVar = new C4406l1.q("DefaultRewardedVideo");
        String strA = IronSourceUtils.a(System.currentTimeMillis(), this.f40913a.g());
        Intrinsics.checkNotNullExpressionValue(strA, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC4356i1.a.f43302a.c(uVar, tVar, qVar, new C4406l1.y(strA)).a(this.f40916d);
        this.f40918f.a(new Runnable() { // from class: com.ironsource.rh
            @Override // java.lang.Runnable
            public final void run() {
                Fd.d(this.f44843b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidShow() {
        M8 m82 = this.f40919g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC4356i1.a.f43302a.b(new C4406l1.w(m82.a(aVar))).a(this.f40916d);
        this.f40920h.b(aVar);
        this.f40915c.b("onAdInstanceDidShow");
        this.f40918f.a(new Runnable() { // from class: com.ironsource.vh
            @Override // java.lang.Runnable
            public final void run() {
                Fd.e(this.f45675b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Fd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Gd gd2 = this$0.f40923k;
        if (gd2 != null) {
            gd2.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Fd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Gd gd2 = this$0.f40923k;
        if (gd2 != null) {
            gd2.onRewardedAdDismissed();
        }
    }

    public final void a(@Nullable Gd gd2) {
        this.f40923k = gd2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Fd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Gd gd2 = this$0.f40923k;
        if (gd2 != null) {
            gd2.onUserEarnedReward();
        }
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40921i.put(this.f40922j.getAdId(), this);
        if (!this.f40914b.a(this.f40913a)) {
            a(C4598w5.f45712a.t());
        } else {
            InterfaceC4356i1.a.f43302a.d(new InterfaceC4423m1[0]).a(this.f40916d);
            this.f40914b.a(activity, this.f40913a);
        }
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void a(@Nullable String str) {
        a(C4598w5.f45712a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f40921i.remove(this.f40922j.getAdId());
        InterfaceC4356i1.a.f43302a.a(new C4406l1.j(ironSourceError.getErrorCode()), new C4406l1.k(ironSourceError.getErrorMessage())).a(this.f40916d);
        this.f40918f.a(new Runnable() { // from class: com.ironsource.uh
            @Override // java.lang.Runnable
            public final void run() {
                Fd.a(this.f45583b, ironSourceError);
            }
        });
    }

    public /* synthetic */ Fd(L9 l92, InterfaceC4218a0 interfaceC4218a0, W1 w12, InterfaceC4476p1 interfaceC4476p1, InterfaceC4367ic interfaceC4367ic, Kf kf2, M8 m82, M8.a aVar, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l92, interfaceC4218a0, w12, interfaceC4476p1, (i10 & 16) != 0 ? new C4383jc() : interfaceC4367ic, (i10 & 32) != 0 ? S7.f41731a : kf2, (i10 & 64) != 0 ? Ib.f41088s.d().s() : m82, (i10 & 128) != 0 ? Ib.f41088s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Fd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Gd gd2 = this$0.f40923k;
        if (gd2 != null) {
            gd2.onRewardedAdFailedToShow(error);
        }
    }

    public final void a() {
        ki.a(this.f40918f, new Runnable() { // from class: com.ironsource.qh
            @Override // java.lang.Runnable
            public final void run() {
                Fd.a(this.f44755b);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Fd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4356i1.d.f43325a.b().a(this$0.f40916d);
        this$0.f40917e.a(this$0.f40913a);
    }
}
