package yads;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class l21 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f112928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21 f112929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f112930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(n21 n21Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.f112929d = n21Var;
        this.f112930e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        l21 l21Var = new l21(this.f112929d, this.f112930e, continuation);
        l21Var.f112928c = obj;
        return l21Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l21) create((gg.v) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112927b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            gg.v vVar = (gg.v) this.f112928c;
            this.f112929d.a(this.f112930e, new k21(vVar));
            this.f112927b = 1;
            if (gg.t.c(vVar, null, this, 1, null) == objG) {
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
