package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn f115094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e83 f115095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(rn rnVar, e83 e83Var, Continuation continuation) {
        super(2, continuation);
        this.f115094c = rnVar;
        this.f115095d = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new qn(this.f115094c, this.f115095d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qn(this.f115094c, this.f115095d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f115093b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            rn rnVar = this.f115094c;
            e83 e83Var = this.f115095d;
            this.f115093b = 1;
            if (rn.a(rnVar, e83Var, this) == objG) {
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
