package hg;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
final class j0 implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f73246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73247c;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73248r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f73249s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ int f73250t;

        a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(FlowCollector flowCollector, int i10, Continuation continuation) {
            a aVar = j0.this.new a(continuation);
            aVar.f73249s = flowCollector;
            aVar.f73250t = i10;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((FlowCollector) obj, ((Number) obj2).intValue(), (Continuation) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.emit(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r1
  0x008e: PHI (r1v5 kotlinx.coroutines.flow.FlowCollector) = 
  (r1v3 kotlinx.coroutines.flow.FlowCollector)
  (r1v4 kotlinx.coroutines.flow.FlowCollector)
  (r1v11 kotlinx.coroutines.flow.FlowCollector)
 binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r9.f73248r
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f73249s
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.d.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f73249s
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.d.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f73249s
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.d.b(r10)
                goto L64
            L38:
                kotlin.d.b(r10)
                goto L9c
            L3c:
                kotlin.d.b(r10)
                java.lang.Object r10 = r9.f73249s
                r1 = r10
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                int r10 = r9.f73250t
                if (r10 <= 0) goto L53
                hg.e0 r10 = hg.e0.f73207b
                r9.f73248r = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                goto L9b
            L53:
                hg.j0 r10 = hg.j0.this
                long r6 = hg.j0.c(r10)
                r9.f73249s = r1
                r9.f73248r = r5
                java.lang.Object r10 = eg.k0.a(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                hg.j0 r10 = hg.j0.this
                long r5 = hg.j0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                hg.e0 r10 = hg.e0.f73208c
                r9.f73249s = r1
                r9.f73248r = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                hg.j0 r10 = hg.j0.this
                long r4 = hg.j0.b(r10)
                r9.f73249s = r1
                r9.f73248r = r3
                java.lang.Object r10 = eg.k0.a(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                hg.e0 r10 = hg.e0.f73209d
                r3 = 0
                r9.f73249s = r3
                r9.f73248r = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
            L9b:
                return r0
            L9c:
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.j0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73252r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f73253s;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e0 e0Var, Continuation continuation) {
            return ((b) create(e0Var, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f73253s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f73252r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((e0) this.f73253s) != e0.f73207b);
        }
    }

    public j0(long j10, long j11) {
        this.f73246b = j10;
        this.f73247c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // hg.g0
    public Flow a(StateFlow stateFlow) {
        return i.p(i.r(i.W(stateFlow, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f73246b == j0Var.f73246b && this.f73247c == j0Var.f73247c;
    }

    public int hashCode() {
        return (androidx.collection.b.a(this.f73246b) * 31) + androidx.collection.b.a(this.f73247c);
    }

    public String toString() {
        List listCreateListBuilder = CollectionsKt.createListBuilder(2);
        if (this.f73246b > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.f73246b + "ms");
        }
        if (this.f73247c < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.f73247c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }
}
