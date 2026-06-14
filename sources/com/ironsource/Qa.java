package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Qa implements Aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f41625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final V2 f41626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final M2 f41627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Ba f41628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Va f41629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private K2 f41630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final L0 f41631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4610x0 f41632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final N2 f41633i;

    public static final class a implements N2 {
        a() {
        }

        public void a() {
            Ba baM = Qa.this.m();
            if (baM != null) {
                baM.onAdLeftApplication();
            }
        }

        public void b() {
            Ba baM = Qa.this.m();
            if (baM != null) {
                baM.k();
            }
        }

        public void c() {
            Ba baM = Qa.this.m();
            if (baM != null) {
                baM.i();
            }
        }

        @Override // com.ironsource.J0
        public void e() {
            Ba baM = Qa.this.m();
            if (baM != null) {
                baM.onAdClicked();
            }
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
            Qa.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void a(@Nullable IronSourceError ironSourceError) {
            Qa.this.l().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4610x0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC4610x0
        public void a(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            Ba baM = Qa.this.m();
            if (baM != null) {
                baM.onAdDisplayed(adInfo);
            }
        }

        @Override // com.ironsource.InterfaceC4610x0
        public void c(@Nullable IronSourceError ironSourceError) {
            Ba baM = Qa.this.m();
            if (baM != null) {
                baM.d(ironSourceError);
            }
        }
    }

    public Qa(@NotNull C4441n0 adTools, @NotNull V2 bannerContainer, @NotNull M2 bannerAdUnitFactory) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f41625a = adTools;
        this.f41626b = bannerContainer;
        this.f41627c = bannerAdUnitFactory;
        this.f41629e = new Ra(this);
        this.f41631g = new b();
        this.f41632h = new c();
        this.f41633i = new a();
    }

    @NotNull
    public final C4441n0 a() {
        return this.f41625a;
    }

    public final void b(@Nullable Ba ba2) {
        this.f41628d = ba2;
    }

    @Override // com.ironsource.Aa
    public void c() {
        this.f41629e.c();
    }

    @Override // com.ironsource.Aa
    public void d() {
    }

    @NotNull
    public final N2 e() {
        return this.f41633i;
    }

    @Override // com.ironsource.Aa
    public void f() {
    }

    @NotNull
    public final L0 g() {
        return this.f41631g;
    }

    @NotNull
    public final InterfaceC4610x0 h() {
        return this.f41632h;
    }

    @NotNull
    public final M2 i() {
        return this.f41627c;
    }

    @NotNull
    public final V2 j() {
        return this.f41626b;
    }

    @Nullable
    public final K2 k() {
        return this.f41630f;
    }

    @NotNull
    public final Va l() {
        return this.f41629e;
    }

    @Nullable
    public final Ba m() {
        return this.f41628d;
    }

    public final void a(@NotNull Va va2) {
        Intrinsics.checkNotNullParameter(va2, "<set-?>");
        this.f41629e = va2;
    }

    @Override // com.ironsource.Aa
    public void b() {
        this.f41629e.b();
    }

    public final void a(@Nullable K2 k22) {
        this.f41630f = k22;
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f41625a.e().h().f("Banner Single Ad Unit Strategy - " + message);
    }

    public final void a(@NotNull C4525s0 adUnitCallback, @NotNull K2 adUnit) {
        Ba ba2;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        adUnit.a(this.f41626b.getViewBinder(), this.f41632h);
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC == null || (ba2 = this.f41628d) == null) {
            return;
        }
        ba2.onAdLoaded(levelPlayAdInfoC);
    }

    public final void a(@Nullable IronSourceError ironSourceError) {
        Ba ba2 = this.f41628d;
        if (ba2 != null) {
            ba2.b(ironSourceError);
        }
    }

    @Override // com.ironsource.Aa
    public void a(@NotNull Ba listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f41628d = listener;
    }
}
