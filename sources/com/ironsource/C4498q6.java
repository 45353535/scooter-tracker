package com.ironsource;

import android.app.Activity;
import com.ironsource.D0;
import com.ironsource.InterfaceC4433mb;
import com.ironsource.InterfaceC4439mf;
import com.ironsource.InterfaceC4496q4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4498q6 implements InterfaceC4377j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib f44683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final V0 f44684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f44685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC4548t6 f44686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function3<A, G, InterfaceC4377j6, C4361i6> f44687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4439mf f44688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f44689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private b f44690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private a f44691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kg f44692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private InterfaceC4439mf.a f44693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Long f44694l;

    /* JADX INFO: renamed from: com.ironsource.q6$a */
    public interface a {
        void a(@NotNull C4498q6 c4498q6, @Nullable IronSourceError ironSourceError);

        void a(@NotNull C4498q6 c4498q6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.q6$b */
    public interface b {
        void a(@NotNull C4498q6 c4498q6);

        void b(@NotNull C4498q6 c4498q6, @Nullable IronSourceError ironSourceError);

        void b(@NotNull C4498q6 c4498q6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

        void c(@NotNull C4498q6 c4498q6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.q6$d */
    /* synthetic */ class d extends kotlin.jvm.internal.y implements Function3<A, G, InterfaceC4377j6, C4361i6> {
        d(Object obj) {
            super(3, obj, C4498q6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4361i6 invoke(@NotNull A p02, @NotNull G p12, @NotNull InterfaceC4377j6 p22) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            return ((C4498q6) this.receiver).a(p02, p12, p22);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q6$e */
    static final class e extends Lambda implements Function1<C4498q6, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f44696a = new e();

        e() {
            super(1);
        }

        public final void a(@NotNull C4498q6 weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            b bVar = weak.f44690h;
            if (bVar != null) {
                bVar.a(weak);
            }
            weak.f44692j.b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4498q6 c4498q6) {
            a(c4498q6);
            return Unit.f93236a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4498q6(@NotNull Ib mediationServices, @NotNull V0 adUnitTools, @NotNull AbstractC4576v0 adUnitData, @NotNull InterfaceC4548t6 fullscreenListener, @Nullable mg mgVar, @Nullable Function3<? super A, ? super G, ? super InterfaceC4377j6, C4361i6> function3, @NotNull InterfaceC4439mf taskScheduler, @NotNull InterfaceC4496q4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f44683a = mediationServices;
        this.f44684b = adUnitTools;
        this.f44685c = adUnitData;
        this.f44686d = fullscreenListener;
        this.f44687e = function3;
        this.f44688f = taskScheduler;
        this.f44689g = currentTimeProvider;
        this.f44692j = a(mgVar);
    }

    protected final void finalize() {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44684b, "finalizing ad unit", (String) null, 2, (Object) null));
        InterfaceC4439mf.a aVar = this.f44693k;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.f44685c.l();
    }

    private final InterfaceC4433mb<Unit> f() {
        if (!this.f44692j.d()) {
            return new InterfaceC4433mb.a(new IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.f44683a.p().a(c(), b()).d()) {
            return new InterfaceC4433mb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.f44683a.f().a(this.f44685c.b().c()).d()) {
            return new InterfaceC4433mb.b(Unit.f93236a);
        }
        return new InterfaceC4433mb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.f44685c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        InterfaceC4439mf.a aVar = this.f44693k;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.f44684b.b(b());
        InterfaceC4439mf interfaceC4439mf = this.f44688f;
        InterfaceC4439mf.b bVarA = U6.a(this, e.f44696a);
        b.a aVar2 = kotlin.time.b.f93560c;
        this.f44693k = interfaceC4439mf.a(bVarA, kotlin.time.c.t(jB, cg.b.f6838e));
    }

    private final void h() {
        String strC = c();
        if (strC.length() > 0) {
            this.f44683a.a().b(strC, b());
            L3 l3A = this.f44683a.p().a(strC, b());
            if (l3A.d()) {
                this.f44684b.e().a().b(strC, l3A.e());
            }
        }
    }

    @NotNull
    public final InterfaceC4548t6 d() {
        return this.f44686d;
    }

    @Nullable
    public final LevelPlayAdInfo e() {
        AbstractC4643z abstractC4643zC = this.f44692j.c();
        if (abstractC4643zC != null) {
            return abstractC4643zC.e();
        }
        return null;
    }

    public final void a(@NotNull InterfaceC4548t6 interfaceC4548t6) {
        Intrinsics.checkNotNullParameter(interfaceC4548t6, "<set-?>");
        this.f44686d = interfaceC4548t6;
    }

    @Override // com.ironsource.D
    public void b(@NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f44692j.b(instance);
        this.f44684b.e().a().g(c());
        this.f44683a.h().b(com.unity3d.mediation.a.a(b()));
    }

    public final void a(@NotNull b loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44684b, (String) null, (String) null, 3, (Object) null));
        this.f44690h = loadListener;
        this.f44694l = Long.valueOf(this.f44689g.a());
        this.f44684b.a(new C4492q0(this.f44685c.b()));
        C c10 = new C() { // from class: com.ironsource.ol
            @Override // com.ironsource.C
            public final AbstractC4643z a(A a10, G g10) {
                return C4498q6.a(this.f44584a, a10, g10);
            }
        };
        this.f44684b.e().e().a(this.f44685c.u());
        this.f44692j.a(c10);
    }

    /* JADX INFO: renamed from: com.ironsource.q6$c */
    public static final class c implements sg {
        c() {
        }

        @Override // com.ironsource.sg
        public void a(int i10, @NotNull String errorReason) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l10 = C4498q6.this.f44694l;
            if (l10 != null) {
                lValueOf = Long.valueOf(C4498q6.this.f44689g.a() - l10.longValue());
            } else {
                lValueOf = null;
            }
            C4498q6.this.f44684b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, i10, errorReason, C4498q6.this.f44685c.u());
            b bVar = C4498q6.this.f44690h;
            if (bVar != null) {
                bVar.b(C4498q6.this, new IronSourceError(i10, errorReason));
            }
        }

        @Override // com.ironsource.sg
        public void b(@NotNull AbstractC4643z instance) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l10 = C4498q6.this.f44694l;
            if (l10 != null) {
                lValueOf = Long.valueOf(C4498q6.this.f44689g.a() - l10.longValue());
            } else {
                lValueOf = null;
            }
            C4498q6.this.f44684b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, C4498q6.this.f44685c.u());
            C4498q6.this.g();
            b bVar = C4498q6.this.f44690h;
            if (bVar != null) {
                bVar.b(C4498q6.this, instance.e());
            }
        }

        @Override // com.ironsource.sg
        public void a(@NotNull AbstractC4643z instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            C4498q6.this.f44684b.e().a().e(C4498q6.this.c());
            C4498q6.this.g();
            b bVar = C4498q6.this.f44690h;
            if (bVar != null) {
                bVar.c(C4498q6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC4377j6
    public void b(@NotNull C4361i6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.f44684b.e().a().b(c());
        this.f44686d.onClosed();
    }

    private final LevelPlay.AdFormat b() {
        return this.f44685c.b().e();
    }

    public /* synthetic */ C4498q6(Ib ib2, V0 v02, AbstractC4576v0 abstractC4576v0, InterfaceC4548t6 interfaceC4548t6, mg mgVar, Function3 function3, InterfaceC4439mf interfaceC4439mf, InterfaceC4496q4 interfaceC4496q4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(ib2, v02, abstractC4576v0, interfaceC4548t6, (i10 & 16) != 0 ? null : mgVar, (i10 & 32) != 0 ? null : function3, (i10 & 64) != 0 ? new T6(U6.a(v02.a())) : interfaceC4439mf, (i10 & 128) != 0 ? new InterfaceC4496q4.a() : interfaceC4496q4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4643z a(C4498q6 this$0, A instanceData, G adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Function3 dVar = this$0.f44687e;
        if (dVar == null) {
            dVar = new d(this$0);
        }
        return (AbstractC4643z) dVar.invoke(instanceData, adInstancePayload, this$0);
    }

    public final void a(@NotNull Activity activity, @NotNull a displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C4441n0.a(this.f44684b, (String) null, (String) null, 3, (Object) null));
        this.f44691i = displayListener;
        this.f44684b.e().a().a(activity, c());
        InterfaceC4433mb<Unit> interfaceC4433mbF = f();
        if (interfaceC4433mbF instanceof InterfaceC4433mb.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC4433mb.a) interfaceC4433mbF).b();
            ironLog.verbose(C4441n0.a(this.f44684b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.f44684b.e().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), "");
            displayListener.a(this, ironSourceErrorB);
            return;
        }
        InterfaceC4439mf.a aVar = this.f44693k;
        if (aVar != null) {
            aVar.a();
        }
        this.f44692j.a(new C4394k6(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4361i6 a(A a10, G g10, InterfaceC4377j6 interfaceC4377j6) {
        return new C4361i6(new V0(this.f44684b, D0.b.PROVIDER), a10, g10, interfaceC4377j6);
    }

    private final kg a(mg mgVar) {
        sg sgVarA = a();
        if (mgVar != null) {
            return mgVar.a(sgVarA);
        }
        return new kg(this.f44684b, this.f44685c, sgVarA);
    }

    private final sg a() {
        return new c();
    }

    @Override // com.ironsource.InterfaceC4377j6
    public void a(@NotNull C4361i6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        a aVar = this.f44691i;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        h();
        this.f44683a.l().b(this.f44685c.b().c());
    }

    @Override // com.ironsource.D
    public void a(@NotNull AbstractC4643z instance, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44684b, error.toString(), (String) null, 2, (Object) null));
        this.f44684b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), "");
        a aVar = this.f44691i;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC4377j6
    public void a(@NotNull C4361i6 fullscreenInstance, @NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44684b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.f44686d.a(reward);
    }

    @Override // com.ironsource.D
    public void a(@NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f44684b.e().a().a(c());
        this.f44686d.e();
    }
}
