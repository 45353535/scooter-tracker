package com.ironsource;

import android.graphics.Rect;
import com.ironsource.AbstractC4341h3;
import com.ironsource.InterfaceC4439mf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ia implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ea f41080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final K2 f41081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Long f41082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private InterfaceC4439mf.a f41083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f41084e;

    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4341h3.c f41086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f41087c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC4341h3.c cVar, long j10) {
            super(0);
            this.f41086b = cVar;
            this.f41087c = j10;
        }

        public final void a() {
            Ia.this.f41080a.a(Ia.this.f41081b, this.f41086b, Long.valueOf(this.f41087c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public Ia(@NotNull Ea strategy, @NotNull K2 currentAdUnit, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f41080a = strategy;
        this.f41081b = currentAdUnit;
        this.f41082c = l10;
        this.f41084e = strategy.p().a();
        strategy.r();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Ia this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4553tb.a(this$0.f41080a.a(), new Runnable() { // from class: com.ironsource.fi
            @Override // java.lang.Runnable
            public final void run() {
                Ia.d(this.f43135b);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ia this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!ig.a(this$0.f41080a.k(), new Rect())) {
            this$0.e();
            return;
        }
        long jA = this$0.f41080a.p().a();
        long j10 = jA - this$0.f41084e;
        Long l10 = this$0.f41082c;
        C4553tb.a((C4553tb) this$0.f41080a.a(), AbstractRunnableC4232ae.f42430a.a(this$0.new a(new AbstractC4341h3.c(l10 != null ? jA - l10.longValue() : 0L, new AbstractC4341h3.d.f(j10)), jA)), 0L, 2, (Object) null);
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void a() {
        li.a(this);
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void b(C4525s0 c4525s0) {
        li.b(this, c4525s0);
    }

    private final void e() {
        long jQ = this.f41080a.q();
        InterfaceC4439mf interfaceC4439mfO = this.f41080a.o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.gi
            @Override // java.lang.Runnable
            public final void run() {
                Ia.c(this.f43197b);
            }
        };
        b.a aVar = kotlin.time.b.f93560c;
        this.f41083d = interfaceC4439mfO.a(runnable, kotlin.time.c.t(jQ, cg.b.f6838e));
    }

    @Override // com.ironsource.Oa
    public void c() {
        InterfaceC4439mf.a aVar = this.f41083d;
        if (aVar != null) {
            aVar.a();
        }
        this.f41081b.a(true);
        Ea ea2 = this.f41080a;
        ea2.a((Oa) new Ha(ea2));
    }

    @Override // com.ironsource.Oa
    public void f() {
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41080a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Oa
    public void b() {
        this.f41080a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41080a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Oa
    public void d() {
        InterfaceC4439mf.a aVar = this.f41083d;
        if (aVar != null) {
            aVar.a();
        }
        Ea ea2 = this.f41080a;
        ea2.a((Oa) new Ka(ea2, this.f41081b));
    }
}
