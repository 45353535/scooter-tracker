package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class af extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg.p f108667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(eg.p pVar, Continuation continuation) {
        super(2, continuation);
        this.f108667c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new af(this.f108667c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new af(this.f108667c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f108666b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            eg.p pVar = this.f108667c;
            this.f108666b = 1;
            if (pVar.await(this) == objG) {
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
