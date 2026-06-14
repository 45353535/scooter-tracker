package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ix1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kx1 f112178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi f112179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(kx1 kx1Var, gi giVar, Continuation continuation) {
        super(2, continuation);
        this.f112178c = kx1Var;
        this.f112179d = giVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ix1(this.f112178c, this.f112179d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ix1(this.f112178c, this.f112179d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112177b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        kx1 kx1Var = this.f112178c;
        gi giVar = this.f112179d;
        this.f112177b = 1;
        Object objA = kx1.a(kx1Var, giVar, this);
        return objA == objG ? objG : objA;
    }
}
