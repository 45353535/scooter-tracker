package com.ironsource;

import com.ironsource.N0;
import com.ironsource.Z2;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final N0 f42216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final H0 f42217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final E2 f42218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Lazy f42219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Lazy f42220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f42221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f42223h;

    public Z2(@NotNull N0 loadingData, @NotNull H0 interactionData, @NotNull E2 mListener) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f42216a = loadingData;
        this.f42217b = interactionData;
        this.f42218c = mListener;
        this.f42219d = lf.i.a(new a());
        this.f42220e = lf.i.a(new b());
        this.f42221f = loadingData.b() > 0;
        this.f42222g = interactionData.b() > 0;
        this.f42223h = loadingData.a() == N0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final C4570ub c() {
        return (C4570ub) this.f42219d.getValue();
    }

    private final C4570ub d() {
        return (C4570ub) this.f42220e.getValue();
    }

    private final void f() {
        if (this.f42223h) {
            c().b();
        }
    }

    private final void g() {
        if (this.f42223h) {
            d().b();
        }
    }

    public final void b() {
        IronLog.INTERNAL.verbose();
        g();
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(this.f42217b.b());
    }

    public final void h() {
        if (!this.f42221f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            IronLog.INTERNAL.verbose();
            a(this.f42216a.b());
        }
    }

    public final void a() {
        IronLog.INTERNAL.verbose();
        f();
    }

    private final void b(long j10) {
        if (this.f42223h && this.f42222g) {
            d().a(j10);
        }
    }

    private final void a(long j10) {
        if (this.f42223h && this.f42221f) {
            c().a(j10);
        }
    }

    static final class a extends Lambda implements Function0<C4570ub> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4570ub invoke() {
            final Z2 z22 = Z2.this;
            return new C4570ub(new Runnable() { // from class: com.ironsource.lj
                @Override // java.lang.Runnable
                public final void run() {
                    Z2.a.a(z22);
                }
            }, com.ironsource.lifecycle.b.d(), new Mf());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Z2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f42218c.c();
        }
    }

    static final class b extends Lambda implements Function0<C4570ub> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4570ub invoke() {
            final Z2 z22 = Z2.this;
            return new C4570ub(new Runnable() { // from class: com.ironsource.mj
                @Override // java.lang.Runnable
                public final void run() {
                    Z2.b.a(z22);
                }
            }, com.ironsource.lifecycle.b.d(), new Mf());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Z2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f42218c.d();
        }
    }
}
