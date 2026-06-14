package com.ironsource;

import com.ironsource.D0;
import com.ironsource.InterfaceC4355i0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4458o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f44506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T6 f44507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final V0 f44508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private L0 f44509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private InterfaceC4610x0 f44510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kg f44511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final WeakReference<J0> f44512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private C4360i5 f44513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final B5 f44514i;

    /* JADX INFO: renamed from: com.ironsource.o0$b */
    public static final class b implements sg {
        b() {
        }

        @Override // com.ironsource.sg
        public void a(int i10, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC4458o0.this.a(i10, errorReason);
        }

        @Override // com.ironsource.sg
        public void b(@NotNull AbstractC4643z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4458o0.this.f44514i.e().a(C4360i5.a(AbstractC4458o0.this.f44513h), AbstractC4458o0.this.e().u());
            L0 l0J = AbstractC4458o0.this.j();
            if (l0J != null) {
                l0J.a(new C4525s0(AbstractC4458o0.this, instance.e()));
            }
        }

        @Override // com.ironsource.sg
        public void a(@NotNull AbstractC4643z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4458o0.this.f().e().a().e(AbstractC4458o0.this.h());
            L0 l0J = AbstractC4458o0.this.j();
            if (l0J != null) {
                l0J.b(new C4525s0(AbstractC4458o0.this, instance.e()));
            }
        }
    }

    public AbstractC4458o0(@NotNull C4441n0 adTools, @NotNull AbstractC4576v0 adUnitData, @NotNull J0 listener, @NotNull T6 taskScheduler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.f44506a = adUnitData;
        this.f44507b = taskScheduler;
        V0 v02 = new V0(adTools, adUnitData, D0.b.MEDIATION);
        this.f44508c = v02;
        this.f44511f = new kg(v02, adUnitData, c());
        this.f44512g = new WeakReference<>(listener);
        this.f44514i = v02.e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    @NotNull
    protected abstract C a();

    @NotNull
    public InterfaceC4355i0 d() {
        return this.f44511f.d() ? InterfaceC4355i0.b.f43300a : new InterfaceC4355i0.a(null, 1, null);
    }

    @NotNull
    protected final AbstractC4576v0 e() {
        return this.f44506a;
    }

    @NotNull
    protected final V0 f() {
        return this.f44508c;
    }

    @Nullable
    protected final C4283dd g() {
        return this.f44506a.b().f();
    }

    @NotNull
    protected final String h() {
        return this.f44506a.l();
    }

    @Nullable
    protected final InterfaceC4610x0 i() {
        return this.f44510e;
    }

    @Nullable
    protected final L0 j() {
        return this.f44509d;
    }

    @NotNull
    protected final kg k() {
        return this.f44511f;
    }

    private final b c() {
        return new b();
    }

    protected final void a(@Nullable InterfaceC4610x0 interfaceC4610x0) {
        this.f44510e = interfaceC4610x0;
    }

    protected final void b(@Nullable L0 l02) {
        this.f44509d = l02;
    }

    public void a(@NotNull L0 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44508c, (String) null, (String) null, 3, (Object) null));
        this.f44508c.a(b());
        this.f44509d = loadListener;
        this.f44514i.a(this.f44506a.u());
        this.f44513h = new C4360i5();
        this.f44511f.a(a());
    }

    @NotNull
    public C4492q0 b() {
        return new C4492q0(this.f44506a.b());
    }

    /* JADX INFO: renamed from: com.ironsource.o0$a */
    protected class a implements D {
        public a() {
        }

        @Override // com.ironsource.D
        public void a(@NotNull AbstractC4643z instance, @NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.INTERNAL.verbose(AbstractC4458o0.this.a(instance.q()));
            AbstractC4458o0.this.f44514i.a().a(AbstractC4458o0.this.h(), error.getErrorCode(), error.getErrorMessage(), "");
            InterfaceC4610x0 interfaceC4610x0I = AbstractC4458o0.this.i();
            if (interfaceC4610x0I != null) {
                interfaceC4610x0I.c(error);
            }
        }

        @Override // com.ironsource.D
        public void b(@NotNull AbstractC4643z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC4458o0.this.a(instance.q()));
            AbstractC4458o0.this.k().b(instance);
            AbstractC4458o0.this.f44514i.a().g(AbstractC4458o0.this.h());
            AbstractC4458o0.this.f().l().b(AbstractC4458o0.this.e().b().a());
        }

        @Override // com.ironsource.D
        public void a(@NotNull AbstractC4643z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4458o0.this.f44514i.a().a(AbstractC4458o0.this.h());
            J0 j02 = (J0) AbstractC4458o0.this.f44512g.get();
            if (j02 != null) {
                j02.e();
            }
        }
    }

    public final void a(@NotNull I adInstancePresenter, @NotNull InterfaceC4610x0 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.f44510e = displayListener;
        this.f44511f.a(adInstancePresenter);
    }

    public /* synthetic */ AbstractC4458o0(C4441n0 c4441n0, AbstractC4576v0 abstractC4576v0, J0 j02, T6 t62, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4441n0, abstractC4576v0, j02, (i10 & 8) != 0 ? new T6(U6.a(c4441n0.a())) : t62);
    }

    public final void a(boolean z10) {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44508c, (String) null, (String) null, 3, (Object) null));
        this.f44511f.a();
        if (z10) {
            this.f44508c.e().e().a(this.f44508c.f());
        }
    }

    protected final void a(int i10, @NotNull String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i10 + ", errorReason = " + errorReason));
        this.f44514i.e().a(C4360i5.a(this.f44513h), i10, errorReason, this.f44506a.u());
        L0 l02 = this.f44509d;
        if (l02 != null) {
            l02.a(new IronSourceError(i10, errorReason));
        }
    }

    @NotNull
    protected final String a(@Nullable String str) {
        return C4441n0.a(this.f44508c, str, (String) null, 2, (Object) null);
    }
}
