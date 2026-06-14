package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ar2 extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public ar2(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new ar2(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        new ar2((Continuation) obj);
        Unit unit = Unit.f93236a;
        pf.b.g();
        kotlin.d.b(unit);
        return fr2.f110837d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return fr2.f110837d;
    }
}
