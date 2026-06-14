package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class sa1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ va1 f115729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa1(va1 va1Var, Continuation continuation) {
        super(2, continuation);
        this.f115729c = va1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new sa1(this.f115729c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sa1(this.f115729c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        z80 w80Var;
        Object objG = pf.b.g();
        int i10 = this.f115728b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ux0 ux0Var = this.f115729c.f116919b;
            this.f115728b = 1;
            b80 b80Var = ux0Var.f116795a;
            obj = eg.g.g(b80Var.f108932f, new a80(b80Var, null), this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        j51 j51Var = (j51) obj;
        if (j51Var instanceof i51) {
            w80Var = new x80(((i51) j51Var).f111865a);
        } else if (j51Var instanceof g51) {
            w80Var = new w80(((g51) j51Var).f111066a);
        } else {
            if (!(j51Var instanceof h51)) {
                throw new lf.m();
            }
            w80Var = v80.f116900a;
        }
        va1 va1Var = this.f115729c;
        eg.i.d(va1Var.f116918a, null, null, new ra1(va1Var, w80Var, null), 3, null);
        return Unit.f93236a;
    }
}
