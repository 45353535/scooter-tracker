package com.ironsource;

import android.app.Activity;
import com.ironsource.C4406l1;
import com.ironsource.InterfaceC4356i1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4551t9 implements InterfaceC4276d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private L9 f45479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC4218a0 f45480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private W1 f45481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC4476p1 f45482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private InterfaceC4367ic f45483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Kf f45484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private M8 f45485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private M8.a f45486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, C4551t9> f45487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private InterstitialAdInfo f45488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private InterfaceC4568u9 f45489k;

    public C4551t9(@NotNull L9 adInstance, @NotNull InterfaceC4218a0 adNetworkShow, @NotNull W1 auctionDataReporter, @NotNull InterfaceC4476p1 analytics, @NotNull InterfaceC4367ic networkDestroyAPI, @NotNull Kf threadManager, @NotNull M8 sessionDepthService, @NotNull M8.a sessionDepthServiceEditor, @NotNull Map<String, C4551t9> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f45479a = adInstance;
        this.f45480b = adNetworkShow;
        this.f45481c = auctionDataReporter;
        this.f45482d = analytics;
        this.f45483e = networkDestroyAPI;
        this.f45484f = threadManager;
        this.f45485g = sessionDepthService;
        this.f45486h = sessionDepthServiceEditor;
        this.f45487i = retainer;
        String strF = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = this.f45479a.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        this.f45488j = new InterstitialAdInfo(strF, strE);
        C4242b6 c4242b6 = new C4242b6();
        this.f45479a.a(c4242b6);
        c4242b6.a(this);
    }

    public final void a(@NotNull InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.f45488j = interstitialAdInfo;
    }

    @NotNull
    public final InterstitialAdInfo b() {
        return this.f45488j;
    }

    @Nullable
    public final InterfaceC4568u9 c() {
        return this.f45489k;
    }

    public final boolean d() {
        boolean zA = this.f45480b.a(this.f45479a);
        InterfaceC4356i1.a.f43302a.a(zA).a(this.f45482d);
        return zA;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4356i1.a.f43302a.f(new InterfaceC4423m1[0]).a(this.f45482d);
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidClick() {
        InterfaceC4356i1.a.f43302a.a().a(this.f45482d);
        this.f45484f.a(new Runnable() { // from class: com.ironsource.pm
            @Override // java.lang.Runnable
            public final void run() {
                C4551t9.b(this.f44666b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidDismiss() {
        this.f45487i.remove(this.f45488j.getAdId());
        InterfaceC4356i1.a.f43302a.a(new InterfaceC4423m1[0]).a(this.f45482d);
        this.f45484f.a(new Runnable() { // from class: com.ironsource.rm
            @Override // java.lang.Runnable
            public final void run() {
                C4551t9.c(this.f44850b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidReward(@Nullable String str, int i10) {
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void onAdInstanceDidShow() {
        M8 m82 = this.f45485g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4356i1.a.f43302a.b(new C4406l1.w(m82.a(aVar))).a(this.f45482d);
        this.f45486h.b(aVar);
        this.f45481c.b("onAdInstanceDidShow");
        this.f45484f.a(new Runnable() { // from class: com.ironsource.qm
            @Override // java.lang.Runnable
            public final void run() {
                C4551t9.d(this.f44759b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4551t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4568u9 interfaceC4568u9 = this$0.f45489k;
        if (interfaceC4568u9 != null) {
            interfaceC4568u9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4551t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4568u9 interfaceC4568u9 = this$0.f45489k;
        if (interfaceC4568u9 != null) {
            interfaceC4568u9.onAdInstanceDidDismiss();
        }
    }

    public final void a(@Nullable InterfaceC4568u9 interfaceC4568u9) {
        this.f45489k = interfaceC4568u9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4551t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4568u9 interfaceC4568u9 = this$0.f45489k;
        if (interfaceC4568u9 != null) {
            interfaceC4568u9.onAdInstanceDidShow();
        }
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45487i.put(this.f45488j.getAdId(), this);
        if (!this.f45480b.a(this.f45479a)) {
            a(C4598w5.f45712a.t());
        } else {
            InterfaceC4356i1.a.f43302a.d(new InterfaceC4423m1[0]).a(this.f45482d);
            this.f45480b.a(activity, this.f45479a);
        }
    }

    @Override // com.ironsource.InterfaceC4276d6
    public void a(@Nullable String str) {
        a(C4598w5.f45712a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f45487i.remove(this.f45488j.getAdId());
        InterfaceC4356i1.a.f43302a.a(new C4406l1.j(ironSourceError.getErrorCode()), new C4406l1.k(ironSourceError.getErrorMessage())).a(this.f45482d);
        this.f45484f.a(new Runnable() { // from class: com.ironsource.sm
            @Override // java.lang.Runnable
            public final void run() {
                C4551t9.a(this.f45425b, ironSourceError);
            }
        });
    }

    public /* synthetic */ C4551t9(L9 l92, InterfaceC4218a0 interfaceC4218a0, W1 w12, InterfaceC4476p1 interfaceC4476p1, InterfaceC4367ic interfaceC4367ic, Kf kf2, M8 m82, M8.a aVar, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l92, interfaceC4218a0, w12, interfaceC4476p1, (i10 & 16) != 0 ? new C4383jc() : interfaceC4367ic, (i10 & 32) != 0 ? S7.f41731a : kf2, (i10 & 64) != 0 ? Ib.f41088s.d().s() : m82, (i10 & 128) != 0 ? Ib.f41088s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4551t9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC4568u9 interfaceC4568u9 = this$0.f45489k;
        if (interfaceC4568u9 != null) {
            interfaceC4568u9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        ki.a(this.f45484f, new Runnable() { // from class: com.ironsource.tm
            @Override // java.lang.Runnable
            public final void run() {
                C4551t9.a(this.f45524b);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4551t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4356i1.d.f43325a.b().a(this$0.f45482d);
        this$0.f45483e.a(this$0.f45479a);
    }
}
