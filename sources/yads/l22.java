package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class l22 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg2 f112931a;

    public l22(hg2 hg2Var) {
        this.f112931a = hg2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        b21 b21Var = (b21) obj;
        hg2 hg2Var = this.f112931a;
        hg2Var.f111585b.put(b21Var.f108892a, b21Var.f108893b);
        return Unit.f93236a;
    }
}
