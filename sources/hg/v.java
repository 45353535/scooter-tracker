package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class v {

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73432r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ g0 f73433s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Flow f73434t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ MutableSharedFlow f73435u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Object f73436v;

        /* JADX INFO: renamed from: hg.v$a$a, reason: collision with other inner class name */
        static final class C0902a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f73437r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ int f73438s;

            C0902a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C0902a c0902a = new C0902a(continuation);
                c0902a.f73438s = ((Number) obj).intValue();
                return c0902a;
            }

            public final Object invoke(int i10, Continuation continuation) {
                return ((C0902a) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f73437r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f73438s > 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation) obj2);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f73439r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f73440s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Flow f73441t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ MutableSharedFlow f73442u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Object f73443v;

            /* JADX INFO: renamed from: hg.v$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0903a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[e0.values().length];
                    try {
                        iArr[e0.f73207b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[e0.f73208c.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[e0.f73209d.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, Continuation continuation) {
                super(2, continuation);
                this.f73441t = flow;
                this.f73442u = mutableSharedFlow;
                this.f73443v = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e0 e0Var, Continuation continuation) {
                return ((b) create(e0Var, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(this.f73441t, this.f73442u, this.f73443v, continuation);
                bVar.f73440s = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f73439r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    int i11 = C0903a.$EnumSwitchMapping$0[((e0) this.f73440s).ordinal()];
                    if (i11 == 1) {
                        Flow flow = this.f73441t;
                        MutableSharedFlow mutableSharedFlow = this.f73442u;
                        this.f73439r = 1;
                        if (flow.collect(mutableSharedFlow, this) == objG) {
                            return objG;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new lf.m();
                        }
                        Object obj2 = this.f73443v;
                        if (obj2 == c0.f73196a) {
                            this.f73442u.d();
                        } else {
                            kotlin.coroutines.jvm.internal.b.a(this.f73442u.g(obj2));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0 g0Var, Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f73433s = g0Var;
            this.f73434t = flow;
            this.f73435u = mutableSharedFlow;
            this.f73436v = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f73433s, this.f73434t, this.f73435u, this.f73436v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (hg.i.l(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r7.f73432r
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.d.b(r8)
                goto L5c
            L21:
                kotlin.d.b(r8)
                goto L8d
            L25:
                kotlin.d.b(r8)
                hg.g0 r8 = r7.f73433s
                hg.g0$a r1 = hg.g0.f73226a
                hg.g0 r6 = r1.c()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.Flow r8 = r7.f73434t
                kotlinx.coroutines.flow.MutableSharedFlow r1 = r7.f73435u
                r7.f73432r = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                hg.g0 r8 = r7.f73433s
                hg.g0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.MutableSharedFlow r8 = r7.f73435u
                kotlinx.coroutines.flow.StateFlow r8 = r8.h()
                hg.v$a$a r1 = new hg.v$a$a
                r1.<init>(r5)
                r7.f73432r = r4
                java.lang.Object r8 = hg.i.y(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                kotlinx.coroutines.flow.Flow r8 = r7.f73434t
                kotlinx.coroutines.flow.MutableSharedFlow r1 = r7.f73435u
                r7.f73432r = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                hg.g0 r8 = r7.f73433s
                kotlinx.coroutines.flow.MutableSharedFlow r1 = r7.f73435u
                kotlinx.coroutines.flow.StateFlow r1 = r1.h()
                kotlinx.coroutines.flow.Flow r8 = r8.a(r1)
                kotlinx.coroutines.flow.Flow r8 = hg.i.p(r8)
                hg.v$a$b r1 = new hg.v$a$b
                kotlinx.coroutines.flow.Flow r3 = r7.f73434t
                kotlinx.coroutines.flow.MutableSharedFlow r4 = r7.f73435u
                java.lang.Object r6 = r7.f73436v
                r1.<init>(r3, r4, r6, r5)
                r7.f73432r = r2
                java.lang.Object r8 = hg.i.l(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final SharedFlow a(MutableSharedFlow mutableSharedFlow) {
        return new y(mutableSharedFlow, null);
    }

    public static final StateFlow b(MutableStateFlow mutableStateFlow) {
        return new z(mutableStateFlow, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final hg.f0 c(kotlinx.coroutines.flow.Flow r7, int r8) {
        /*
            gg.g$a r0 = gg.g.L8
            int r0 = r0.a()
            int r0 = kotlin.ranges.g.e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof ig.e
            if (r1 == 0) goto L3c
            r1 = r7
            ig.e r1 = (ig.e) r1
            kotlinx.coroutines.flow.Flow r2 = r1.j()
            if (r2 == 0) goto L3c
            hg.f0 r7 = new hg.f0
            int r3 = r1.f74761c
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            gg.a r4 = r1.f74762d
            gg.a r5 = gg.a.f72765b
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            gg.a r8 = r1.f74762d
            kotlin.coroutines.CoroutineContext r1 = r1.f74760b
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            hg.f0 r8 = new hg.f0
            gg.a r1 = gg.a.f72765b
            kotlin.coroutines.e r2 = kotlin.coroutines.e.f93267b
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.v.c(kotlinx.coroutines.flow.Flow, int):hg.f0");
    }

    private static final Job d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, MutableSharedFlow mutableSharedFlow, g0 g0Var, Object obj) {
        return eg.g.c(coroutineScope, coroutineContext, Intrinsics.areEqual(g0Var, g0.f73226a.c()) ? eg.f0.f69146b : eg.f0.f69149e, new a(g0Var, flow, mutableSharedFlow, obj, null));
    }

    public static final SharedFlow e(SharedFlow sharedFlow, Function2 function2) {
        return new o0(sharedFlow, function2);
    }

    public static final SharedFlow f(Flow flow, CoroutineScope coroutineScope, g0 g0Var, int i10) {
        f0 f0VarC = c(flow, i10);
        MutableSharedFlow mutableSharedFlowA = c0.a(i10, f0VarC.f73214b, f0VarC.f73215c);
        return new y(mutableSharedFlowA, d(coroutineScope, f0VarC.f73216d, f0VarC.f73213a, mutableSharedFlowA, g0Var, c0.f73196a));
    }

    public static final StateFlow g(Flow flow, CoroutineScope coroutineScope, g0 g0Var, Object obj) {
        f0 f0VarC = c(flow, 1);
        MutableStateFlow mutableStateFlowA = l0.a(obj);
        return new z(mutableStateFlowA, d(coroutineScope, f0VarC.f73216d, f0VarC.f73213a, mutableStateFlowA, g0Var, obj));
    }
}
