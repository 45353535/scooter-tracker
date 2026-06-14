package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ud extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd f116616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(wd wdVar, Continuation continuation) {
        super(2, continuation);
        this.f116616c = wdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ud(this.f116616c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ud(this.f116616c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f116615b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        ce ceVar = this.f116616c.f117424a;
        this.f116615b = 1;
        Object objG2 = eg.g.g(ceVar.f109374a, new be(ceVar, null), this);
        return objG2 == objG ? objG : objG2;
    }
}
