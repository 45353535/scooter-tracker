package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function3 f74774f;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74775r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f74776s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ FlowCollector f74778u;

        /* JADX INFO: renamed from: ig.i$a$a, reason: collision with other inner class name */
        static final class C0926a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f74779b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f74780c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f74781d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ FlowCollector f74782e;

            /* JADX INFO: renamed from: ig.i$a$a$a, reason: collision with other inner class name */
            static final class C0927a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f74783r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ i f74784s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ FlowCollector f74785t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ Object f74786u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0927a(i iVar, FlowCollector flowCollector, Object obj, Continuation continuation) {
                    super(2, continuation);
                    this.f74784s = iVar;
                    this.f74785t = flowCollector;
                    this.f74786u = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0927a(this.f74784s, this.f74785t, this.f74786u, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.f74783r;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        Function3 function3 = this.f74784s.f74774f;
                        FlowCollector flowCollector = this.f74785t;
                        Object obj2 = this.f74786u;
                        this.f74783r = 1;
                        if (function3.invoke(flowCollector, obj2, this) == objG) {
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

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0927a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: ig.i$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f74787r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f74788s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f74789t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                /* synthetic */ Object f74790u;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                int f74792w;

                b(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f74790u = obj;
                    this.f74792w |= Integer.MIN_VALUE;
                    return C0926a.this.emit(null, this);
                }
            }

            C0926a(Ref$ObjectRef ref$ObjectRef, CoroutineScope coroutineScope, i iVar, FlowCollector flowCollector) {
                this.f74779b = ref$ObjectRef;
                this.f74780c = coroutineScope;
                this.f74781d = iVar;
                this.f74782e = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ig.i.a.C0926a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    ig.i$a$a$b r0 = (ig.i.a.C0926a.b) r0
                    int r1 = r0.f74792w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f74792w = r1
                    goto L18
                L13:
                    ig.i$a$a$b r0 = new ig.i$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f74790u
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f74792w
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f74789t
                    kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                    java.lang.Object r8 = r0.f74788s
                    java.lang.Object r0 = r0.f74787r
                    ig.i$a$a r0 = (ig.i.a.C0926a) r0
                    kotlin.d.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.d.b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f74779b
                    java.lang.Object r9 = r9.f93280b
                    kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
                    if (r9 == 0) goto L5d
                    ig.k r2 = new ig.k
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f74787r = r7
                    r0.f74788s = r8
                    r0.f74789t = r9
                    r0.f74792w = r3
                    java.lang.Object r9 = r9.i0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f74779b
                    kotlinx.coroutines.CoroutineScope r1 = r0.f74780c
                    eg.f0 r3 = eg.f0.f69149e
                    ig.i$a$a$a r4 = new ig.i$a$a$a
                    ig.i r2 = r0.f74781d
                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f74782e
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    kotlinx.coroutines.Job r8 = eg.g.d(r1, r2, r3, r4, r5, r6)
                    r9.f93280b = r8
                    kotlin.Unit r8 = kotlin.Unit.f93236a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.i.a.C0926a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FlowCollector flowCollector, Continuation continuation) {
            super(2, continuation);
            this.f74778u = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = i.this.new a(this.f74778u, continuation);
            aVar.f74776s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f74775r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f74776s;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                i iVar = i.this;
                Flow flow = iVar.f74770e;
                C0926a c0926a = new C0926a(ref$ObjectRef, coroutineScope, iVar, this.f74778u);
                this.f74775r = 1;
                if (flow.collect(c0926a, this) == objG) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public /* synthetic */ i(Function3 function3, Flow flow, CoroutineContext coroutineContext, int i10, gg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, flow, (i11 & 4) != 0 ? kotlin.coroutines.e.f93267b : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? gg.a.f72765b : aVar);
    }

    @Override // ig.e
    protected e i(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return new i(this.f74774f, this.f74770e, coroutineContext, i10, aVar);
    }

    @Override // ig.g
    protected Object q(FlowCollector flowCollector, Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new a(flowCollector, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public i(Function3 function3, Flow flow, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        super(flow, coroutineContext, i10, aVar);
        this.f74774f = function3;
    }
}
