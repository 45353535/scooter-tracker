package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class av0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f108830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv0 f108831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk2 f108832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(dv0 dv0Var, yk2 yk2Var, Continuation continuation) {
        super(2, continuation);
        this.f108831d = dv0Var;
        this.f108832e = yk2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        av0 av0Var = new av0(this.f108831d, this.f108832e, continuation);
        av0Var.f108830c = obj;
        return av0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((av0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objG = pf.b.g();
        int i10 = this.f108829b;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                dv0 dv0Var = this.f108831d;
                yk2 yk2Var = this.f108832e;
                Result.Companion companion = Result.f93230c;
                this.f108829b = 1;
                obj = dv0Var.a(yk2Var, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            objB = Result.b(kotlin.coroutines.jvm.internal.b.a(((Boolean) obj).booleanValue()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return Result.a(objB);
    }
}
