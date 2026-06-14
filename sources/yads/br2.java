package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class br2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ er2 f109085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br2(er2 er2Var, Continuation continuation) {
        super(2, continuation);
        this.f109085c = er2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new br2(this.f109085c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new br2(this.f109085c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f109084b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            rs2 rs2Var = this.f109085c.f110447e;
            z41 z41Var = z41.f118544f;
            this.f109084b = 1;
            obj = rs2Var.a(z41Var, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        js2 js2Var = (js2) obj;
        if (js2Var instanceof is2) {
            return null;
        }
        if (js2Var instanceof hs2) {
            return fr2.f110836c;
        }
        throw new lf.m();
    }
}
