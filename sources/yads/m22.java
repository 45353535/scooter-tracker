package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class m22 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f113297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg2 f113298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m22(Flow flow, hg2 hg2Var, Continuation continuation) {
        super(2, continuation);
        this.f113297c = flow;
        this.f113298d = hg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m22(this.f113297c, this.f113298d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m22(this.f113297c, this.f113298d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f113296b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Flow flow = this.f113297c;
            l22 l22Var = new l22(this.f113298d);
            this.f113296b = 1;
            if (flow.collect(l22Var, this) == objG) {
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
