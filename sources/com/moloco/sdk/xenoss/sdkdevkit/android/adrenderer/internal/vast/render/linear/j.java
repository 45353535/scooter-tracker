package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f58276b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c f58279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f58280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f58281g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58277c = "LinearGoNextActionImpl";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f58278d = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f58282h = l0.a(d.a.c.f58160a);

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58283r;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j$a$a, reason: collision with other inner class name */
        public static final class C0770a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58285r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ int f58286s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ j f58287t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0770a(j jVar, Continuation continuation) {
                super(2, continuation);
                this.f58287t = jVar;
            }

            public final Object c(int i10, Continuation continuation) {
                return ((C0770a) create(lf.t.a(i10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C0770a c0770a = new C0770a(this.f58287t, continuation);
                c0770a.f58286s = ((lf.t) obj).g();
                return c0770a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return c(((lf.t) obj).g(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f58285r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                int i10 = this.f58286s;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, this.f58287t.f58277c, "Updating countdown to " + ((Object) lf.t.f(i10)), null, false, 12, null);
                this.f58287t.f58281g = i10;
                MolocoLogger.info$default(molocoLogger, this.f58287t.f58277c, "Propagating state: " + k.h(i10), null, false, 12, null);
                this.f58287t.l().setValue(k.h(i10));
                return Unit.f93236a;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            StateFlow stateFlowB;
            Object objG = pf.b.g();
            int i10 = this.f58283r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                if (j.this.f58279e == null) {
                    j.this.f58279e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c(j.this.f58281g, j.this.f58278d, null);
                } else {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c cVar = j.this.f58279e;
                    if (cVar != null) {
                        cVar.c(j.this.f58281g);
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c cVar2 = j.this.f58279e;
                if (cVar2 != null && (stateFlowB = cVar2.b()) != null) {
                    C0770a c0770a = new C0770a(j.this, null);
                    this.f58283r = 1;
                    if (hg.i.l(stateFlowB, c0770a, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public j(t tVar) {
        this.f58276b = tVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i
    public void I() {
        l().setValue(d.a.c.f58160a);
    }

    public final void b(long j10) {
        if (k.i(this.f58280f)) {
            this.f58281g = lf.t.c((int) j10);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58277c, "Start timer for duration: " + j10 + " seconds", null, false, 12, null);
            this.f58280f = eg.i.d(this.f58278d, null, null, new a(null), 3, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow l() {
        return this.f58282h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i
    public void pause() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58277c, "Canceling timer", null, false, 12, null);
        Job job = this.f58280f;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i
    public void s() {
        if (Integer.compare(this.f58281g ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0) {
            b(((long) this.f58281g) & 4294967295L);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i
    public void a(int i10, int i11) {
        double d10 = (((double) i10) / ((double) i11)) * ((double) 100);
        if (i10 >= i11) {
            l().setValue(d.a.C0768a.f58158a);
            return;
        }
        if (this.f58276b == null) {
            l().setValue(d.a.c.f58160a);
            return;
        }
        if (this.f58280f == null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, this.f58277c, "Starting timer", null, false, 12, null);
            t tVar = this.f58276b;
            if (tVar instanceof t.a) {
                MolocoLogger.info$default(molocoLogger, this.f58277c, "Offset Percents detected", null, false, 12, null);
                b(((long) k.f(new IntRange((int) d10, ((t.a) this.f58276b).a()), i11)) & 4294967295L);
            } else {
                if (!(tVar instanceof t.b)) {
                    throw new lf.m();
                }
                MolocoLogger.info$default(molocoLogger, this.f58277c, "Offset Millis detected", null, false, 12, null);
                b(k.g(((t.b) this.f58276b).a()));
            }
        }
    }
}
