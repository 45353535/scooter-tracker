package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ta1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ va1 f116143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f116144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta1(va1 va1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f116143c = va1Var;
        this.f116144d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ta1(this.f116143c, this.f116144d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ta1(this.f116143c, this.f116144d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f116142b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            gg.g gVar = this.f116143c.f116932o;
            y80 y80Var = new y80(this.f116144d);
            this.f116142b = 1;
            if (gVar.w(y80Var, this) == objG) {
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
