package ig;

import eg.f0;
import eg.h0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f74760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gg.a f74762d;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74763r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f74764s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FlowCollector f74765t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ e f74766u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FlowCollector flowCollector, e eVar, Continuation continuation) {
            super(2, continuation);
            this.f74765t = flowCollector;
            this.f74766u = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f74765t, this.f74766u, continuation);
            aVar.f74764s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f74763r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f74764s;
                FlowCollector flowCollector = this.f74765t;
                gg.x xVarM = this.f74766u.m(coroutineScope);
                this.f74763r = 1;
                if (hg.i.s(flowCollector, xVarM, this) == objG) {
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

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74767r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f74768s;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = e.this.new b(continuation);
            bVar.f74768s = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(gg.v vVar, Continuation continuation) {
            return ((b) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f74767r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                gg.v vVar = (gg.v) this.f74768s;
                e eVar = e.this;
                this.f74767r = 1;
                if (eVar.f(vVar, this) == objG) {
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

    public e(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        this.f74760b = coroutineContext;
        this.f74761c = i10;
        this.f74762d = aVar;
    }

    static /* synthetic */ Object e(e eVar, FlowCollector flowCollector, Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new a(flowCollector, eVar, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // ig.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlinx.coroutines.flow.Flow a(kotlin.coroutines.CoroutineContext r2, int r3, gg.a r4) {
        /*
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.f74760b
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r0)
            gg.a r0 = gg.a.f72765b
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f74761c
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            gg.a r4 = r1.f74762d
        L25:
            kotlin.coroutines.CoroutineContext r0 = r1.f74760b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f74761c
            if (r3 != r0) goto L36
            gg.a r0 = r1.f74762d
            if (r4 != r0) goto L36
            return r1
        L36:
            ig.e r2 = r1.i(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.e.a(kotlin.coroutines.CoroutineContext, int, gg.a):kotlinx.coroutines.flow.Flow");
    }

    protected String c() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return e(this, flowCollector, continuation);
    }

    protected abstract Object f(gg.v vVar, Continuation continuation);

    protected abstract e i(CoroutineContext coroutineContext, int i10, gg.a aVar);

    public Flow j() {
        return null;
    }

    public final Function2 k() {
        return new b(null);
    }

    public final int l() {
        int i10 = this.f74761c;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public gg.x m(CoroutineScope coroutineScope) {
        return gg.t.g(coroutineScope, this.f74760b, l(), this.f74762d, f0.f69148d, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.f74760b != kotlin.coroutines.e.f93267b) {
            arrayList.add("context=" + this.f74760b);
        }
        if (this.f74761c != -3) {
            arrayList.add("capacity=" + this.f74761c);
        }
        if (this.f74762d != gg.a.f72765b) {
            arrayList.add("onBufferOverflow=" + this.f74762d);
        }
        return h0.a(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
