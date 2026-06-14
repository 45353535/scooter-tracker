package hg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
final class e extends ig.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f73204g = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gg.x f73205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f73206f;

    public /* synthetic */ e(gg.x xVar, boolean z10, CoroutineContext coroutineContext, int i10, gg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, z10, (i11 & 4) != 0 ? kotlin.coroutines.e.f93267b : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? gg.a.f72765b : aVar);
    }

    private final void o() {
        if (this.f73206f && f73204g.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // ig.e
    protected String c() {
        return "channel=" + this.f73205e;
    }

    @Override // ig.e, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        if (this.f74761c != -3) {
            Object objCollect = super.collect(flowCollector, continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
        o();
        Object objD = k.d(flowCollector, this.f73205e, this.f73206f, continuation);
        return objD == pf.b.g() ? objD : Unit.f93236a;
    }

    @Override // ig.e
    protected Object f(gg.v vVar, Continuation continuation) {
        Object objD = k.d(new ig.z(vVar), this.f73205e, this.f73206f, continuation);
        return objD == pf.b.g() ? objD : Unit.f93236a;
    }

    @Override // ig.e
    protected ig.e i(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return new e(this.f73205e, this.f73206f, coroutineContext, i10, aVar);
    }

    @Override // ig.e
    public Flow j() {
        return new e(this.f73205e, this.f73206f, null, 0, null, 28, null);
    }

    @Override // ig.e
    public gg.x m(CoroutineScope coroutineScope) {
        o();
        return this.f74761c == -3 ? this.f73205e : super.m(coroutineScope);
    }

    public e(gg.x xVar, boolean z10, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f73205e = xVar;
        this.f73206f = z10;
    }
}
