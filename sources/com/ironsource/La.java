package com.ironsource;

import com.ironsource.AbstractC4341h3;
import com.ironsource.InterfaceC4433mb;
import com.ironsource.InterfaceC4439mf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class La implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ea f41278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final K2 f41279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final K2 f41280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private InterfaceC4433mb<LevelPlayAdInfo> f41282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private InterfaceC4439mf.a f41283f;

    static final class a extends Lambda implements Function1<La, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41284a = new a();

        a() {
            super(1);
        }

        public final void a(@NotNull La weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            weak.e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(La la2) {
            a(la2);
            return Unit.f93236a;
        }
    }

    public La(@NotNull Ea strategy, @NotNull K2 currentAdUnit, @NotNull K2 reloadingAdUnit, long j10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f41278a = strategy;
        this.f41279b = currentAdUnit;
        this.f41280c = reloadingAdUnit;
        this.f41281d = j10;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC4433mb<LevelPlayAdInfo> interfaceC4433mb = this.f41282e;
        if (interfaceC4433mb == null) {
            Ea ea2 = this.f41278a;
            ea2.a((Oa) new Na(ea2, this.f41279b, this.f41280c, this.f41281d));
        } else if (interfaceC4433mb instanceof InterfaceC4433mb.b) {
            a((LevelPlayAdInfo) ((InterfaceC4433mb.b) interfaceC4433mb).b());
        } else if (interfaceC4433mb instanceof InterfaceC4433mb.a) {
            b(((InterfaceC4433mb.a) interfaceC4433mb).b());
        }
    }

    private final void g() {
        InterfaceC4439mf interfaceC4439mfO = this.f41278a.o();
        InterfaceC4439mf.b bVarA = U6.a(this, a.f41284a);
        b.a aVar = kotlin.time.b.f93560c;
        this.f41283f = interfaceC4439mfO.a(bVarA, kotlin.time.c.t(this.f41278a.l(), cg.b.f6838e));
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void a() {
        li.a(this);
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void b(C4525s0 c4525s0) {
        li.b(this, c4525s0);
    }

    @Override // com.ironsource.Oa
    public void c() {
        InterfaceC4439mf.a aVar = this.f41283f;
        if (aVar != null) {
            aVar.a();
        }
        this.f41279b.a(true);
        this.f41280c.a(true);
        Ea ea2 = this.f41278a;
        ea2.a((Oa) new Ha(ea2));
    }

    @Override // com.ironsource.Oa
    public void d() {
        InterfaceC4439mf.a aVar = this.f41283f;
        if (aVar != null) {
            aVar.a();
        }
        Ea ea2 = this.f41278a;
        ea2.a((Oa) new Ka(ea2, this.f41279b));
    }

    @Override // com.ironsource.Oa
    public void f() {
        Ea ea2 = this.f41278a;
        ea2.a((Oa) new La(ea2, this.f41279b, this.f41280c, ea2.p().a()));
    }

    @Override // com.ironsource.Oa
    public void b() {
        this.f41278a.a("Loading an ad while reloading");
    }

    private final void b(IronSourceError ironSourceError) {
        this.f41278a.a(ironSourceError, this.f41279b, (AbstractC4341h3) new AbstractC4341h3.c(this.f41278a.p().a() - this.f41281d, AbstractC4341h3.d.g.f43223a), true, false, Long.valueOf(this.f41281d));
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            a(new InterfaceC4433mb.b(levelPlayAdInfoC));
        } else {
            a(new InterfaceC4433mb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC4433mb.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long jA = this.f41278a.p().a() - this.f41281d;
        this.f41278a.a(new C4525s0(this.f41280c, levelPlayAdInfo), this.f41280c, this.f41279b, (AbstractC4341h3) new AbstractC4341h3.c(jA, AbstractC4341h3.d.h.f43224a), false, Long.valueOf(this.f41281d));
    }

    private final void a(InterfaceC4433mb<LevelPlayAdInfo> interfaceC4433mb) {
        if (this.f41282e != null) {
            this.f41278a.a("Received excessive load " + Ma.b(interfaceC4433mb) + " while reloading");
            return;
        }
        this.f41282e = interfaceC4433mb;
    }
}
