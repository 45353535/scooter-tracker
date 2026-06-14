package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import hg.c0;
import hg.g0;
import hg.l0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h f57690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f57691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f57692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateFlow f57693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlow f57694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Flow f57695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StateFlow f57696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c f57697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final MutableSharedFlow f57698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Flow f57699l;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57700r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57701s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k f57703u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, Continuation continuation) {
            super(2, continuation);
            this.f57703u = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, Continuation continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = f.this.new a(this.f57703u, continuation);
            aVar.f57701s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f57700r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b) this.f57701s;
            if (bVar instanceof b.d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.f57690c;
                if (hVar != null) {
                    hVar.b(z.f57660k);
                }
                f.this.J(new b.f(((b.d) bVar).a()));
            } else if (bVar instanceof b.a) {
                f.this.J(b.a.f57676a);
            } else if (bVar instanceof b.c) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.f57690c;
                if (hVar2 != null) {
                    kotlin.coroutines.jvm.internal.b.a(hVar2.c());
                }
                f.this.J(b.C0745b.f57677a);
            } else {
                if (!(bVar instanceof b.C0752b)) {
                    throw new m();
                }
                ((k.a) this.f57703u).a().destroy();
                Unit unit = Unit.f93236a;
            }
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57704r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57705s;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar, Continuation continuation) {
            return ((b) create(dVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f57705s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f57704r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) this.f57705s;
            if (dVar instanceof d.C0769d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.f57690c;
                if (hVar != null) {
                    hVar.b(z.f57657h);
                }
                f.this.J(new b.f(((d.C0769d) dVar).a()));
            } else if (Intrinsics.areEqual(dVar, d.a.f58234a)) {
                f.this.J(b.a.f57676a);
            } else if (Intrinsics.areEqual(dVar, d.e.f58238a)) {
                f.this.J(b.i.f57684a);
                f.this.H();
                Unit unit = Unit.f93236a;
            } else if (Intrinsics.areEqual(dVar, d.b.f58235a)) {
                f.this.J(b.c.f57678a);
                kotlin.coroutines.jvm.internal.b.a(f.this.E());
            } else {
                if (!Intrinsics.areEqual(dVar, d.c.f58236a)) {
                    throw new m();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.f57690c;
                if (hVar2 != null) {
                    kotlin.coroutines.jvm.internal.b.a(hVar2.c());
                }
                f.this.J(b.g.f57682a);
            }
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57707r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57708s;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57710a;

            static {
                int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.values().length];
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.f58162c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.f58161b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57710a = iArr;
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar, Continuation continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = f.this.new c(continuation);
            cVar.f57708s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f57707r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            int i10 = a.f57710a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.f57708s).ordinal()];
            if (i10 == 1) {
                f.this.J(b.a.f57676a);
            } else {
                if (i10 != 2) {
                    throw new m();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.f57690c;
                if (hVar != null) {
                    kotlin.coroutines.jvm.internal.b.a(hVar.c());
                }
                f.this.J(b.d.f57679a);
            }
            return Unit.f93236a;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57711r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57712s;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57714a;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.f56511b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t.f56512c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57714a = iArr;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, Continuation continuation) {
            return ((d) create(tVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = f.this.new d(continuation);
            dVar.f57712s = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f57711r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            int i10 = a.f57714a[((t) this.f57712s).ordinal()];
            if (i10 == 1) {
                f.this.J(b.i.f57684a);
                f.this.H();
            } else {
                if (i10 != 2) {
                    throw new m();
                }
                f.this.J(b.a.f57676a);
            }
            return Unit.f93236a;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57715r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57716s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f57717t;

        public e(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Boolean bool, Continuation continuation) {
            e eVar = f.this.new e(continuation);
            eVar.f57716s = kVar;
            eVar.f57717t = bool;
            return eVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                pf.b.g()
                int r0 = r2.f57715r
                if (r0 != 0) goto L36
                kotlin.d.b(r3)
                java.lang.Object r3 = r2.f57716s
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k r3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) r3
                java.lang.Object r0 = r2.f57717t
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                if (r3 == 0) goto L30
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.this
                java.util.List r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.M(r1)
                java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r1)
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r3 == 0) goto L30
                r3 = 1
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 != 0) goto L30
                goto L31
            L30:
                r3 = 0
            L31:
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r3)
                return r3
            L36:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$f, reason: collision with other inner class name */
    public static final class C0746f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57719r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b f57721t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0746f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f57721t = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0746f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return f.this.new C0746f(this.f57721t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57719r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = f.this.f57698k;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = this.f57721t;
                this.f57719r = 1;
                if (mutableSharedFlow.emit(bVar, this) == objG) {
                    return objG;
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

    public static final class g implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f57722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f57723c;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f57724b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f57725c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a, reason: collision with other inner class name */
            public static final class C0747a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f57726r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f57727s;

                public C0747a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f57726r = obj;
                    this.f57727s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, f fVar) {
                this.f57724b = flowCollector;
                this.f57725c = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.g.a.C0747a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.g.a.C0747a) r0
                    int r1 = r0.f57727s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f57727s = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f57726r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f57727s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r7)
                    goto L92
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.d.b(r7)
                    kotlinx.coroutines.flow.FlowCollector r7 = r5.f57724b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f r2 = r5.f57725c
                    java.util.List r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.M(r2)
                    java.lang.Object r2 = kotlin.collections.CollectionsKt.lastOrNull(r2)
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a
                    if (r4 == 0) goto L56
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$a r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L56:
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c
                    if (r4 == 0) goto L66
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$c r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$c
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$c r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L66:
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b
                    if (r4 == 0) goto L76
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$b r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$b r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L76:
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d
                    if (r4 == 0) goto L86
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$d r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$d
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$d r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L86:
                    if (r6 != 0) goto L95
                    r4 = 0
                L89:
                    r0.f57727s = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L92
                    return r1
                L92:
                    kotlin.Unit r6 = kotlin.Unit.f93236a
                    return r6
                L95:
                    lf.m r6 = new lf.m
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(Flow flow, f fVar) {
            this.f57722b = flow;
            this.f57723c = fVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f57722b.collect(new a(flowCollector, this.f57723c), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public static final class h implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f57729b;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f57730b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a, reason: collision with other inner class name */
            public static final class C0748a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f57731r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f57732s;

                public C0748a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f57731r = obj;
                    this.f57732s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f57730b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.C0748a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.C0748a) r0
                    int r1 = r0.f57732s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f57732s = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f57731r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f57732s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r6)
                    goto L70
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.d.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f57730b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) r5
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a
                    if (r2 == 0) goto L47
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$a r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a r5 = r5.a()
                    boolean r5 = r5.J()
                    goto L63
                L47:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c
                    if (r2 == 0) goto L56
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$c r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c r5 = r5.a()
                    boolean r5 = r5.J()
                    goto L63
                L56:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b
                    if (r2 == 0) goto L5b
                    goto L62
                L5b:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d
                    if (r2 == 0) goto L60
                    goto L62
                L60:
                    if (r5 != 0) goto L73
                L62:
                    r5 = 0
                L63:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f57732s = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L70
                    return r1
                L70:
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                L73:
                    lf.m r5 = new lf.m
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public h(Flow flow) {
            this.f57729b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f57729b.collect(new a(flowCollector), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public f(List playlist, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar) {
        Flow flowK;
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        this.f57689b = playlist;
        this.f57690c = hVar;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f57691d = coroutineScopeA;
        MutableStateFlow mutableStateFlowA = l0.a(null);
        this.f57692e = mutableStateFlowA;
        g gVar = new g(mutableStateFlowA, this);
        g0.a aVar = g0.f73226a;
        this.f57693f = hg.i.T(gVar, coroutineScopeA, g0.a.b(aVar, 0L, 0L, 3, null), null);
        h hVar2 = new h(mutableStateFlowA);
        g0 g0VarB = g0.a.b(aVar, 0L, 0L, 3, null);
        Boolean bool = Boolean.FALSE;
        this.f57694g = hg.i.T(hVar2, coroutineScopeA, g0VarB, bool);
        Flow flowJ = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.j(mutableStateFlowA, coroutineScopeA);
        this.f57695h = flowJ;
        this.f57696i = hg.i.T(hg.i.m(mutableStateFlowA, flowJ, new e(null)), coroutineScopeA, g0.a.b(aVar, 0L, 0L, 3, null), bool);
        this.f57697j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e.a(mutableStateFlowA, coroutineScopeA);
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this.f57698k = mutableSharedFlowB;
        this.f57699l = mutableSharedFlowB;
        Iterator it = playlist.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar instanceof k.a) {
                flowK = hg.i.K(((k.a) kVar).a().a(), new a(kVar, null));
            } else if (kVar instanceof k.c) {
                flowK = hg.i.K(((k.c) kVar).a().a(), new b(null));
            } else if (kVar instanceof k.b) {
                flowK = hg.i.K(((k.b) kVar).a().a(), new c(null));
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new m();
                }
                flowK = hg.i.K(((k.d) kVar).a().a(), new d(null));
            }
            hg.i.F(flowK, this.f57691d);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void A() {
        k kVar = (k) this.f57692e.getValue();
        if (kVar instanceof k.a) {
            ((k.a) kVar).a().k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a());
            return;
        }
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a());
            return;
        }
        if (kVar instanceof k.b) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA DEC playlist item reached", null, false, 12, null);
        } else if (kVar instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA Mraid playlist item reached", null, false, 12, null);
        } else {
            if (kVar != null) {
                throw new m();
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA playlist item reached", null, false, 12, null);
        }
    }

    public final void C() {
        k kVar = (k) CollectionsKt.firstOrNull(this.f57689b);
        if (kVar == null) {
            return;
        }
        L(kVar);
    }

    public final boolean E() {
        List list = this.f57689b;
        k kVar = (k) CollectionsKt.getOrNull(list, CollectionsKt.indexOf((List<? extends Object>) list, this.f57692e.getValue()) + 1);
        if (kVar == null) {
            return false;
        }
        L(kVar);
        return true;
    }

    public final void H() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a aVarG = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.g(this.f57689b, (k) this.f57692e.getValue());
        if (aVarG != null) {
            aVarG.t();
        }
        if (E()) {
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = this.f57690c;
        if (hVar != null) {
            hVar.a();
        }
        J(b.e.f57680a);
    }

    public final Job J(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
        return eg.i.d(this.f57691d, null, null, new C0746f(bVar, null), 3, null);
    }

    public final void L(k kVar) {
        this.f57692e.setValue(kVar);
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().r();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public Flow a() {
        return this.f57699l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public void d() {
        C();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f57691d, null, 1, null);
        for (k kVar : this.f57689b) {
            if (kVar instanceof k.a) {
                ((k.a) kVar).a().destroy();
            } else if (kVar instanceof k.c) {
                ((k.c) kVar).a().destroy();
            } else if (kVar instanceof k.b) {
                ((k.b) kVar).a().destroy();
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new m();
                }
                ((k.d) kVar).a().destroy();
            }
        }
        L(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public StateFlow k() {
        return this.f57693f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow l() {
        return this.f57697j.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void m(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        a.AbstractC0780a.c cVarI = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.i(this.f57689b, (k) this.f57692e.getValue(), button);
        k kVar = (k) this.f57692e.getValue();
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().m(cVarI);
            return;
        }
        if (kVar instanceof k.a) {
            ((k.a) kVar).a().m(cVarI);
            return;
        }
        if (kVar instanceof k.b) {
            ((k.b) kVar).a().m(cVarI);
            return;
        }
        if (kVar instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty onButtonRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (kVar != null) {
            throw new m();
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Displaying " + cVarI.c() + " at position: " + cVarI.d() + " of size: " + cVarI.e() + " in unknown playlist item type", null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public StateFlow n() {
        return this.f57694g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void p(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        a.AbstractC0780a.c.EnumC0782a enumC0782aH = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.h(this.f57689b, (k) this.f57692e.getValue(), buttonType);
        k kVar = (k) this.f57692e.getValue();
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().p(enumC0782aH);
            return;
        }
        if (kVar instanceof k.a) {
            ((k.a) kVar).a().p(enumC0782aH);
            return;
        }
        if (kVar instanceof k.b) {
            ((k.b) kVar).a().p(enumC0782aH);
            return;
        }
        if (kVar instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty onButtonUnRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (kVar != null) {
            throw new m();
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Unrendering " + enumC0782aH + " in unknown playlist item type", null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void x() {
        if (l().getValue() instanceof d.a.C0768a) {
            Object value = this.f57692e.getValue();
            k.c cVar = value instanceof k.c ? (k.c) value : null;
            if (cVar != null) {
                cVar.a().h();
            } else {
                H();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void z() {
        C();
        J(b.h.f57683a);
    }
}
