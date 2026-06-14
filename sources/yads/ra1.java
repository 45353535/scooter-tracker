package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ra1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ va1 f115388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z80 f115389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra1(va1 va1Var, z80 z80Var, Continuation continuation) {
        super(2, continuation);
        this.f115388c = va1Var;
        this.f115389d = z80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ra1(this.f115388c, this.f115389d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ra1(this.f115388c, this.f115389d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f115387b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            gg.g gVar = this.f115388c.f116932o;
            z80 z80Var = this.f115389d;
            this.f115387b = 1;
            if (gVar.w(z80Var, this) == objG) {
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
