package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ea implements Aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f40696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final V2 f40697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f40699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final I2 f40700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Ba f40701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final M2 f40702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4439mf f40703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f40704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private L0 f40705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private InterfaceC4610x0 f40706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private N2 f40707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private Oa f40708m;

    public static final class a implements N2 {
        a() {
        }

        public void a() {
            Ea.this.n().onAdLeftApplication();
        }

        public void b() {
            Ea.this.n().k();
        }

        public void c() {
            Ea.this.n().i();
        }

        @Override // com.ironsource.J0
        public void e() {
            Ea.this.n().onAdClicked();
        }

        @Override // com.ironsource.N2
        public /* bridge */ /* synthetic */ Unit g() {
            a();
            return Unit.f93236a;
        }

        @Override // com.ironsource.N2
        public /* bridge */ /* synthetic */ Unit h() {
            c();
            return Unit.f93236a;
        }

        @Override // com.ironsource.N2
        public /* bridge */ /* synthetic */ Unit j() {
            b();
            return Unit.f93236a;
        }
    }

    public static final class b implements L0 {
        b() {
        }

        @Override // com.ironsource.L0
        public /* synthetic */ void a() {
            li.a(this);
        }

        @Override // com.ironsource.L0
        public /* synthetic */ void b(C4525s0 c4525s0) {
            li.b(this, c4525s0);
        }

        @Override // com.ironsource.L0
        public void a(@NotNull C4525s0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            Ea.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void a(@Nullable IronSourceError ironSourceError) {
            Ea.this.m().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4610x0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC4610x0
        public void a(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            Ea.this.n().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC4610x0
        public void c(@Nullable IronSourceError ironSourceError) {
            Ea.this.n().d(ironSourceError);
        }
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ K2 f40713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4341h3 f40714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K2 k22, AbstractC4341h3 abstractC4341h3) {
            super(0);
            this.f40713b = k22;
            this.f40714c = abstractC4341h3;
        }

        public final void a() {
            Ea.this.a(this.f40713b, this.f40714c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f93236a;
        }
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ K2 f40716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f40717c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K2 k22, Long l10) {
            super(0);
            this.f40716b = k22;
            this.f40717c = l10;
        }

        public final void a() {
            Ea ea2 = Ea.this;
            ea2.a((Oa) new Ia(ea2, this.f40716b, this.f40717c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ K2 f40719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4341h3 f40720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f40721d;

        static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ea f40722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ K2 f40723b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC4341h3 f40724c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ea ea2, K2 k22, AbstractC4341h3 abstractC4341h3) {
                super(0);
                this.f40722a = ea2;
                this.f40723b = k22;
                this.f40724c = abstractC4341h3;
            }

            public final void a() {
                this.f40722a.a(this.f40723b, this.f40724c);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f93236a;
            }
        }

        static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ea f40725a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ K2 f40726b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Long f40727c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ea ea2, K2 k22, Long l10) {
                super(0);
                this.f40725a = ea2;
                this.f40726b = k22;
                this.f40727c = l10;
            }

            public final void a() {
                Ea ea2 = this.f40725a;
                ea2.a((Oa) new Ia(ea2, this.f40726b, this.f40727c));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f93236a;
            }
        }

        f(K2 k22, AbstractC4341h3 abstractC4341h3, Long l10) {
            this.f40719b = k22;
            this.f40720c = abstractC4341h3;
            this.f40721d = l10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ea.this.k().getViewTreeObserver().isAlive()) {
                Ea.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (ig.a(Ea.this.k(), new Rect())) {
                C4553tb.a((C4553tb) Ea.this.a(), AbstractRunnableC4232ae.f42430a.a(new a(Ea.this, this.f40719b, this.f40720c)), 0L, 2, (Object) null);
            } else {
                C4553tb.a((C4553tb) Ea.this.a(), AbstractRunnableC4232ae.f42430a.a(new b(Ea.this, this.f40719b, this.f40721d)), 0L, 2, (Object) null);
            }
        }
    }

    public Ea(@NotNull C4441n0 adTools, @NotNull V2 bannerContainer, long j10, long j11, @NotNull I2 bannerAdProperties, @NotNull Ba strategyListener, @NotNull M2 bannerAdUnitFactory, @NotNull InterfaceC4439mf taskScheduler, @NotNull InterfaceC4496q4 timeProvider) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f40696a = adTools;
        this.f40697b = bannerContainer;
        this.f40698c = j10;
        this.f40699d = j11;
        this.f40700e = bannerAdProperties;
        this.f40701f = strategyListener;
        this.f40702g = bannerAdUnitFactory;
        this.f40703h = taskScheduler;
        this.f40704i = timeProvider;
        this.f40705j = new b();
        this.f40706k = new c();
        this.f40707l = new a();
        this.f40708m = new Ga(this, false, 2, null);
    }

    @NotNull
    public final C4441n0 a() {
        return this.f40696a;
    }

    @Override // com.ironsource.Aa
    public void c() {
        this.f40708m.c();
    }

    @Override // com.ironsource.Aa
    public void d() {
        this.f40708m.d();
    }

    @NotNull
    public final N2 e() {
        return this.f40707l;
    }

    @Override // com.ironsource.Aa
    public void f() {
        this.f40708m.f();
    }

    @NotNull
    public final L0 g() {
        return this.f40705j;
    }

    @NotNull
    public final InterfaceC4610x0 h() {
        return this.f40706k;
    }

    @NotNull
    public final I2 i() {
        return this.f40700e;
    }

    @NotNull
    public final M2 j() {
        return this.f40702g;
    }

    @NotNull
    public final V2 k() {
        return this.f40697b;
    }

    public final long l() {
        return this.f40698c;
    }

    @NotNull
    public final Oa m() {
        return this.f40708m;
    }

    @NotNull
    public final Ba n() {
        return this.f40701f;
    }

    @NotNull
    public final InterfaceC4439mf o() {
        return this.f40703h;
    }

    @NotNull
    public final InterfaceC4496q4 p() {
        return this.f40704i;
    }

    public final long q() {
        return this.f40699d;
    }

    public final void r() {
        this.f40696a.e().h().h("Banner view is not visible");
    }

    public final void a(@NotNull L0 l02) {
        Intrinsics.checkNotNullParameter(l02, "<set-?>");
        this.f40705j = l02;
    }

    public final void b(@NotNull Ba ba2) {
        Intrinsics.checkNotNullParameter(ba2, "<set-?>");
        this.f40701f = ba2;
    }

    public final void a(@NotNull InterfaceC4610x0 interfaceC4610x0) {
        Intrinsics.checkNotNullParameter(interfaceC4610x0, "<set-?>");
        this.f40706k = interfaceC4610x0;
    }

    @Override // com.ironsource.Aa
    public void b() {
        this.f40708m.b();
    }

    public final void a(@NotNull N2 n22) {
        Intrinsics.checkNotNullParameter(n22, "<set-?>");
        this.f40707l = n22;
    }

    public final void a(@NotNull Oa oa2) {
        Intrinsics.checkNotNullParameter(oa2, "<set-?>");
        this.f40708m = oa2;
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f40696a.e().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(@NotNull C4525s0 adUnitCallback, @NotNull K2 currentAdUnit, @Nullable K2 k22, @NotNull AbstractC4341h3 reloadReason, boolean z10, @Nullable Long l10) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.f40697b.getViewBinder(), this.f40706k);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f40701f.onAdLoaded(levelPlayAdInfoC);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C4441n0.a(this.f40696a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (k22 != null) {
            k22.a(false);
        }
        if (z10) {
            this.f40708m = new Ka(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l10);
        }
    }

    public /* synthetic */ Ea(C4441n0 c4441n0, V2 v22, long j10, long j11, I2 i22, Ba ba2, M2 m22, InterfaceC4439mf interfaceC4439mf, InterfaceC4496q4 interfaceC4496q4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4441n0, v22, j10, j11, i22, ba2, m22, (i10 & 128) != 0 ? new T6(U6.a(c4441n0.a())) : interfaceC4439mf, interfaceC4496q4);
    }

    public final void a(@Nullable IronSourceError ironSourceError, @NotNull K2 currentAdUnit, @NotNull AbstractC4341h3 reloadReason, boolean z10, boolean z11, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f40701f.b(ironSourceError);
        if (z11) {
            this.f40708m = new Ka(this, currentAdUnit);
        } else if (z10) {
            a(currentAdUnit, reloadReason, l10);
        } else {
            a(currentAdUnit, reloadReason);
        }
    }

    public final void a(@NotNull final K2 currentAdUnit, @NotNull final AbstractC4341h3 reloadReason, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        C4553tb.a(this.f40696a, new Runnable() { // from class: com.ironsource.ph
            @Override // java.lang.Runnable
            public final void run() {
                Ea.a(this.f44657b, currentAdUnit, reloadReason, l10);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ea this$0, K2 currentAdUnit, AbstractC4341h3 reloadReason, Long l10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (ig.a(this$0.f40697b, new Rect())) {
            C4553tb.a((C4553tb) this$0.f40696a, AbstractRunnableC4232ae.f42430a.a(this$0.new d(currentAdUnit, reloadReason)), 0L, 2, (Object) null);
        } else if (!this$0.f40697b.getViewTreeObserver().isAlive()) {
            C4553tb.a((C4553tb) this$0.f40696a, AbstractRunnableC4232ae.f42430a.a(this$0.new e(currentAdUnit, l10)), 0L, 2, (Object) null);
        } else {
            this$0.f40697b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l10));
        }
    }

    public final void a(@NotNull K2 currentAdUnit, @NotNull AbstractC4341h3 reloadReason) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        K2 k2A = this.f40702g.a(false);
        La la2 = new La(this, currentAdUnit, k2A, this.f40704i.a());
        a(reloadReason);
        this.f40708m = la2;
        k2A.a(this.f40705j);
    }

    private final void a(AbstractC4341h3 abstractC4341h3) {
        this.f40696a.e().h().a(abstractC4341h3.c(), abstractC4341h3.b(), abstractC4341h3.a());
    }

    @Override // com.ironsource.Aa
    public void a(@NotNull Ba listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40701f = listener;
    }
}
