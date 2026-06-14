package ig;

import gg.y;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {
        final /* synthetic */ FlowCollector A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f74797r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f74798s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f74799t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f74800u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f74801v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f74802w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Flow[] f74803x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ Function0 f74804y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ Function3 f74805z;

        /* JADX INFO: renamed from: ig.l$a$a, reason: collision with other inner class name */
        static final class C0928a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f74806r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Flow[] f74807s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f74808t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f74809u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ gg.g f74810v;

            /* JADX INFO: renamed from: ig.l$a$a$a, reason: collision with other inner class name */
            static final class C0929a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ gg.g f74811b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f74812c;

                /* JADX INFO: renamed from: ig.l$a$a$a$a, reason: collision with other inner class name */
                static final class C0930a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f74813r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f74815t;

                    C0930a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f74813r = obj;
                        this.f74815t |= Integer.MIN_VALUE;
                        return C0929a.this.emit(null, this);
                    }
                }

                C0929a(gg.g gVar, int i10) {
                    this.f74811b = gVar;
                    this.f74812c = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (eg.b2.a(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof ig.l.a.C0928a.C0929a.C0930a
                        if (r0 == 0) goto L13
                        r0 = r8
                        ig.l$a$a$a$a r0 = (ig.l.a.C0928a.C0929a.C0930a) r0
                        int r1 = r0.f74815t
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f74815t = r1
                        goto L18
                    L13:
                        ig.l$a$a$a$a r0 = new ig.l$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f74813r
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.f74815t
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.d.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.d.b(r8)
                        goto L4d
                    L38:
                        kotlin.d.b(r8)
                        gg.g r8 = r6.f74811b
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.f74812c
                        r2.<init>(r5, r7)
                        r0.f74815t = r4
                        java.lang.Object r7 = r8.w(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f74815t = r3
                        java.lang.Object r7 = eg.b2.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f93236a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ig.l.a.C0928a.C0929a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0928a(Flow[] flowArr, int i10, AtomicInteger atomicInteger, gg.g gVar, Continuation continuation) {
                super(2, continuation);
                this.f74807s = flowArr;
                this.f74808t = i10;
                this.f74809u = atomicInteger;
                this.f74810v = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0928a(this.f74807s, this.f74808t, this.f74809u, this.f74810v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object objG = pf.b.g();
                int i10 = this.f74806r;
                try {
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        Flow[] flowArr = this.f74807s;
                        int i11 = this.f74808t;
                        Flow flow = flowArr[i11];
                        C0929a c0929a = new C0929a(this.f74810v, i11);
                        this.f74806r = 1;
                        if (flow.collect(c0929a, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        y.a.a(this.f74810v, null, 1, null);
                    }
                    return Unit.f93236a;
                } finally {
                    if (this.f74809u.decrementAndGet() == 0) {
                        y.a.a(this.f74810v, null, 1, null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0928a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Flow[] flowArr, Function0 function0, Function3 function3, FlowCollector flowCollector, Continuation continuation) {
            super(2, continuation);
            this.f74803x = flowArr;
            this.f74804y = function0;
            this.f74805z = function3;
            this.A = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f74803x, this.f74804y, this.f74805z, this.A, continuation);
            aVar.f74802w = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_START, PHI: r6 r10
  0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v12 kotlin.collections.IndexedValue) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ig.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final Object a(FlowCollector flowCollector, Flow[] flowArr, Function0 function0, Function3 function3, Continuation continuation) {
        Object objA = o.a(new a(flowArr, function0, function3, flowCollector, null), continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
