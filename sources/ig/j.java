package ig;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Iterable f74793e;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74794r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Flow f74795s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ z f74796t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Flow flow, z zVar, Continuation continuation) {
            super(2, continuation);
            this.f74795s = flow;
            this.f74796t = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f74795s, this.f74796t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f74794r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow flow = this.f74795s;
                z zVar = this.f74796t;
                this.f74794r = 1;
                if (flow.collect(zVar, this) == objG) {
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

    public /* synthetic */ j(Iterable iterable, CoroutineContext coroutineContext, int i10, gg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? kotlin.coroutines.e.f93267b : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? gg.a.f72765b : aVar);
    }

    @Override // ig.e
    protected Object f(gg.v vVar, Continuation continuation) {
        z zVar = new z(vVar);
        Iterator it = this.f74793e.iterator();
        while (it.hasNext()) {
            eg.i.d(vVar, null, null, new a((Flow) it.next(), zVar, null), 3, null);
        }
        return Unit.f93236a;
    }

    @Override // ig.e
    protected e i(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return new j(this.f74793e, coroutineContext, i10, aVar);
    }

    @Override // ig.e
    public gg.x m(CoroutineScope coroutineScope) {
        return gg.t.f(coroutineScope, this.f74760b, this.f74761c, k());
    }

    public j(Iterable iterable, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f74793e = iterable;
    }
}
