package com.ironsource;

import android.os.Bundle;
import com.ironsource.C4240b4;
import com.ironsource.C4406l1;
import com.ironsource.InterfaceC4356i1;
import com.ironsource.Lf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4585v9 implements InterfaceC4655zb, InterfaceC4259c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f45634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ab f45635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final T<InterstitialAd> f45636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4407l2 f45637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4520rc f45638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f45639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4253c0<InterstitialAd> f45640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Lf.c f45641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Executor f45642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C4360i5 f45643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Lf f45644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private V1 f45645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f45646m;

    /* JADX INFO: renamed from: com.ironsource.v9$a */
    public static final class a implements Lf.a {
        a() {
        }

        @Override // com.ironsource.Lf.a
        public void a() {
            C4585v9.this.a(C4598w5.f45712a.s());
        }
    }

    public C4585v9(@NotNull InterstitialAdRequest adRequest, @NotNull Ab loadTaskConfig, @NotNull T<InterstitialAd> adLoadTaskListener, @NotNull InterfaceC4407l2 auctionResponseFetcher, @NotNull InterfaceC4520rc networkLoadApi, @NotNull InterfaceC4476p1 analytics, @NotNull InterfaceC4253c0<InterstitialAd> adObjectFactory, @NotNull Lf.c timerFactory, @NotNull Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f45634a = adRequest;
        this.f45635b = loadTaskConfig;
        this.f45636c = adLoadTaskListener;
        this.f45637d = auctionResponseFetcher;
        this.f45638e = networkLoadApi;
        this.f45639f = analytics;
        this.f45640g = adObjectFactory;
        this.f45641h = timerFactory;
        this.f45642i = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = R5.f41661a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC4356i1.c.f43316a.a(new C4406l1.l(str + C4240b4.j.f42668b + strValueOf)).a(this.f45639f);
        }
    }

    @Override // com.ironsource.InterfaceC4655zb
    public void start() {
        this.f45643j = new C4360i5();
        this.f45639f.a(new C4406l1.s(this.f45635b.f()), new C4406l1.n(this.f45635b.g().b()), new C4406l1.b(this.f45634a.getAdId$mediationsdk_release()));
        InterfaceC4356i1.c.f43316a.a().a(this.f45639f);
        a(this.f45634a.getExtraParams());
        long jH = this.f45635b.h();
        Lf.c cVar = this.f45641h;
        Lf.b bVar = new Lf.b();
        bVar.b(jH);
        Unit unit = Unit.f93236a;
        Lf lfA = cVar.a(bVar);
        this.f45644k = lfA;
        if (lfA != null) {
            lfA.a(new a());
        }
        Object objA = this.f45637d.a();
        Throwable thG = Result.g(objA);
        if (thG != null) {
            Intrinsics.checkNotNull(thG, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((C4261c8) thG).a());
            objA = null;
        }
        C4357i2 c4357i2 = (C4357i2) objA;
        if (c4357i2 == null) {
            return;
        }
        InterfaceC4476p1 interfaceC4476p1 = this.f45639f;
        String strB = c4357i2.b();
        if (strB != null) {
            interfaceC4476p1.a(new C4406l1.d(strB));
        }
        JSONObject jSONObjectF = c4357i2.f();
        if (jSONObjectF != null) {
            interfaceC4476p1.a(new C4406l1.m(jSONObjectF));
        }
        String strA = c4357i2.a();
        if (strA != null) {
            interfaceC4476p1.a(new C4406l1.g(strA));
        }
        EnumC4431m9 enumC4431m9G = this.f45635b.g();
        C4242b6 c4242b6 = new C4242b6();
        c4242b6.a(this);
        L9 adInstance = new M9(this.f45634a.getProviderName$mediationsdk_release().value(), c4242b6).a(enumC4431m9G.b(EnumC4431m9.Bidder)).b(this.f45635b.i()).a(this.f45634a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C4400kc().a(), R5.f41661a.a(this.f45634a.getExtraParams()))).a();
        InterfaceC4476p1 interfaceC4476p12 = this.f45639f;
        String strE = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        interfaceC4476p12.a(new C4406l1.b(strE));
        C4554tc c4554tc = new C4554tc(c4357i2, this.f45635b.j());
        this.f45645l = new V1(new C4414l9(this.f45634a.getInstanceId(), enumC4431m9G.b(), c4357i2.a()), new com.ironsource.mediationsdk.d(), c4357i2.c());
        InterfaceC4356i1.d.f43325a.c().a(this.f45639f);
        InterfaceC4520rc interfaceC4520rc = this.f45638e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC4520rc.a(adInstance, c4554tc);
    }

    @Override // com.ironsource.InterfaceC4259c6
    public void a(@NotNull final L9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f45642i.execute(new Runnable() { // from class: com.ironsource.dn
            @Override // java.lang.Runnable
            public final void run() {
                C4585v9.a(this.f42939b, adInstance);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4585v9 this$0, L9 adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.f45646m) {
            return;
        }
        this$0.f45646m = true;
        Lf lf2 = this$0.f45644k;
        if (lf2 != null) {
            lf2.cancel();
        }
        C4360i5 c4360i5 = this$0.f45643j;
        if (c4360i5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4360i5 = null;
        }
        InterfaceC4356i1.c.f43316a.a(new C4406l1.f(C4360i5.a(c4360i5))).a(this$0.f45639f);
        V1 v12 = this$0.f45645l;
        if (v12 != null) {
            v12.c("onAdInstanceDidLoad");
        }
        InterfaceC4253c0<InterstitialAd> interfaceC4253c0 = this$0.f45640g;
        V1 v13 = this$0.f45645l;
        Intrinsics.checkNotNull(v13);
        this$0.f45636c.a(interfaceC4253c0.a(adInstance, v13));
    }

    public /* synthetic */ C4585v9(InterstitialAdRequest interstitialAdRequest, Ab ab2, T t10, InterfaceC4407l2 interfaceC4407l2, InterfaceC4520rc interfaceC4520rc, InterfaceC4476p1 interfaceC4476p1, InterfaceC4253c0 interfaceC4253c0, Lf.c cVar, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, ab2, t10, interfaceC4407l2, interfaceC4520rc, interfaceC4476p1, interfaceC4253c0, (i10 & 128) != 0 ? new Lf.d() : cVar, (i10 & 256) != 0 ? S7.f41731a.c() : executor);
    }

    @Override // com.ironsource.InterfaceC4259c6
    public void a(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C4598w5.f45712a.c(description));
    }

    public final void a(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f45642i.execute(new Runnable() { // from class: com.ironsource.cn
            @Override // java.lang.Runnable
            public final void run() {
                C4585v9.a(this.f42845b, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4585v9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.f45646m) {
            return;
        }
        this$0.f45646m = true;
        Lf lf2 = this$0.f45644k;
        if (lf2 != null) {
            lf2.cancel();
        }
        InterfaceC4356i1.c.a aVar = InterfaceC4356i1.c.f43316a;
        C4406l1.j jVar = new C4406l1.j(error.getErrorCode());
        C4406l1.k kVar = new C4406l1.k(error.getErrorMessage());
        C4360i5 c4360i5 = this$0.f45643j;
        if (c4360i5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4360i5 = null;
        }
        aVar.a(jVar, kVar, new C4406l1.f(C4360i5.a(c4360i5))).a(this$0.f45639f);
        V1 v12 = this$0.f45645l;
        if (v12 != null) {
            v12.a("onAdInstanceDidFailToLoad");
        }
        this$0.f45636c.b(error);
    }
}
