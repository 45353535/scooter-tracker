package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
final class i0 implements g0 {

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73231r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f73232s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ StateFlow f73233t;

        /* JADX INFO: renamed from: hg.i0$a$a, reason: collision with other inner class name */
        static final class C0897a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref$BooleanRef f73234b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FlowCollector f73235c;

            /* JADX INFO: renamed from: hg.i0$a$a$a, reason: collision with other inner class name */
            static final class C0898a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f73236r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f73238t;

                C0898a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f73236r = obj;
                    this.f73238t |= Integer.MIN_VALUE;
                    return C0897a.this.a(0, this);
                }
            }

            C0897a(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector) {
                this.f73234b = ref$BooleanRef;
                this.f73235c = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hg.i0.a.C0897a.C0898a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hg.i0$a$a$a r0 = (hg.i0.a.C0897a.C0898a) r0
                    int r1 = r0.f73238t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f73238t = r1
                    goto L18
                L13:
                    hg.i0$a$a$a r0 = new hg.i0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f73236r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f73238t
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.d.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f73234b
                    boolean r6 = r5.f93279b
                    if (r6 != 0) goto L4e
                    r5.f93279b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f73235c
                    hg.e0 r6 = hg.e0.f73207b
                    r0.f73238t = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.i0.a.C0897a.a(int, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(StateFlow stateFlow, Continuation continuation) {
            super(2, continuation);
            this.f73233t = stateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f73233t, continuation);
            aVar.f73232s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f73231r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f73232s;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                StateFlow stateFlow = this.f73233t;
                C0897a c0897a = new C0897a(ref$BooleanRef, flowCollector);
                this.f73231r = 1;
                if (stateFlow.collect(c0897a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            throw new lf.g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Override // hg.g0
    public Flow a(StateFlow stateFlow) {
        return i.B(new a(stateFlow, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
