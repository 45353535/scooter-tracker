package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4240b4;
import com.ironsource.C4406l1;
import com.ironsource.InterfaceC4356i1;
import com.ironsource.Lf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
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

/* JADX INFO: renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4239b3 implements InterfaceC4655zb, InterfaceC4646z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BannerAdRequest f42457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AdSize f42458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4407l2 f42459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Ab f42460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4520rc f42461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f42462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final T<BannerAdView> f42463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2 f42464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Lf.c f42465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Executor f42466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C4360i5 f42467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Lf f42468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private V1 f42469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42470n;

    /* JADX INFO: renamed from: com.ironsource.b3$a */
    public static final class a implements Lf.a {
        a() {
        }

        @Override // com.ironsource.Lf.a
        public void a() {
            C4239b3.this.a(C4598w5.f45712a.s());
        }
    }

    public C4239b3(@NotNull BannerAdRequest adRequest, @NotNull AdSize size, @NotNull InterfaceC4407l2 auctionResponseFetcher, @NotNull Ab loadTaskConfig, @NotNull InterfaceC4520rc networkLoadApi, @NotNull InterfaceC4476p1 analytics, @NotNull T<BannerAdView> adLoadTaskListener, @NotNull C2 adLayoutFactory, @NotNull Lf.c timerFactory, @NotNull Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f42457a = adRequest;
        this.f42458b = size;
        this.f42459c = auctionResponseFetcher;
        this.f42460d = loadTaskConfig;
        this.f42461e = networkLoadApi;
        this.f42462f = analytics;
        this.f42463g = adLoadTaskListener;
        this.f42464h = adLayoutFactory;
        this.f42465i = timerFactory;
        this.f42466j = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = R5.f41661a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC4356i1.c.f43316a.a(new C4406l1.l(str + C4240b4.j.f42668b + strValueOf)).a(this.f42462f);
        }
    }

    @Override // com.ironsource.InterfaceC4646z2
    public void onBannerLoadFail(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C4598w5.f45712a.c(description));
    }

    @Override // com.ironsource.InterfaceC4646z2
    public void onBannerLoadSuccess(@NotNull final L9 adInstance, @NotNull final C4346h8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        this.f42466j.execute(new Runnable() { // from class: com.ironsource.hk
            @Override // java.lang.Runnable
            public final void run() {
                C4239b3.a(this.f43288b, adInstance, adContainer);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4655zb
    public void start() {
        this.f42467k = new C4360i5();
        this.f42462f.a(new C4406l1.s(this.f42460d.f()), new C4406l1.n(this.f42460d.g().b()), new C4406l1.c(this.f42458b), new C4406l1.b(this.f42457a.getAdId$mediationsdk_release()));
        InterfaceC4356i1.c.f43316a.a().a(this.f42462f);
        a(this.f42457a.getExtraParams());
        long jH = this.f42460d.h();
        Lf.c cVar = this.f42465i;
        Lf.b bVar = new Lf.b();
        bVar.b(jH);
        Unit unit = Unit.f93236a;
        Lf lfA = cVar.a(bVar);
        this.f42468l = lfA;
        if (lfA != null) {
            lfA.a(new a());
        }
        Object objA = this.f42459c.a();
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
        InterfaceC4476p1 interfaceC4476p1 = this.f42462f;
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
        EnumC4431m9 enumC4431m9G = this.f42460d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C4312f8 c4312f8 = new C4312f8(AdapterUtils.dpToPixels(applicationContext, this.f42458b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f42458b.getHeight()), this.f42458b.getSizeDescription());
        Gc gc2 = new Gc();
        gc2.a(this);
        L9 adInstance = new M9(this.f42457a.getProviderName$mediationsdk_release().value(), gc2).a(enumC4431m9G.b(EnumC4431m9.Bidder)).a(c4312f8).b(this.f42460d.i()).a(this.f42457a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C4400kc().a(), R5.f41661a.a(this.f42457a.getExtraParams()))).a();
        C4554tc c4554tc = new C4554tc(c4357i2, this.f42460d.j());
        this.f42469m = new V1(new C4414l9(this.f42457a.getInstanceId(), enumC4431m9G.b(), c4357i2.a()), new com.ironsource.mediationsdk.d(), c4357i2.c());
        InterfaceC4356i1.d.f43325a.c().a(this.f42462f);
        InterfaceC4520rc interfaceC4520rc = this.f42461e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC4520rc.a(adInstance, c4554tc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4239b3 this$0, L9 adInstance, C4346h8 adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.f42470n) {
            return;
        }
        this$0.f42470n = true;
        Lf lf2 = this$0.f42468l;
        if (lf2 != null) {
            lf2.cancel();
        }
        C4360i5 c4360i5 = this$0.f42467k;
        if (c4360i5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4360i5 = null;
        }
        InterfaceC4356i1.c.f43316a.a(new C4406l1.f(C4360i5.a(c4360i5))).a(this$0.f42462f);
        V1 v12 = this$0.f42469m;
        if (v12 != null) {
            v12.c("onBannerLoadSuccess");
        }
        C2 c22 = this$0.f42464h;
        V1 v13 = this$0.f42469m;
        Intrinsics.checkNotNull(v13);
        this$0.f42463g.a(c22.a(adInstance, adContainer, v13));
    }

    public /* synthetic */ C4239b3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC4407l2 interfaceC4407l2, Ab ab2, InterfaceC4520rc interfaceC4520rc, InterfaceC4476p1 interfaceC4476p1, T t10, C2 c22, Lf.c cVar, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC4407l2, ab2, interfaceC4520rc, interfaceC4476p1, t10, c22, (i10 & 256) != 0 ? new Lf.d() : cVar, (i10 & 512) != 0 ? S7.f41731a.c() : executor);
    }

    public final void a(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f42466j.execute(new Runnable() { // from class: com.ironsource.ik
            @Override // java.lang.Runnable
            public final void run() {
                C4239b3.a(this.f43381b, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4239b3 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.f42470n) {
            return;
        }
        this$0.f42470n = true;
        Lf lf2 = this$0.f42468l;
        if (lf2 != null) {
            lf2.cancel();
        }
        InterfaceC4356i1.c.a aVar = InterfaceC4356i1.c.f43316a;
        C4406l1.j jVar = new C4406l1.j(error.getErrorCode());
        C4406l1.k kVar = new C4406l1.k(error.getErrorMessage());
        C4360i5 c4360i5 = this$0.f42467k;
        if (c4360i5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4360i5 = null;
        }
        aVar.a(jVar, kVar, new C4406l1.f(C4360i5.a(c4360i5))).a(this$0.f42462f);
        V1 v12 = this$0.f42469m;
        if (v12 != null) {
            v12.a("onBannerLoadFail");
        }
        this$0.f42463g.b(error);
    }
}
