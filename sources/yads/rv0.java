package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class rv0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sv0 f115615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f115616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv0(sv0 sv0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f115615c = sv0Var;
        this.f115616d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new rv0(this.f115615c, this.f115616d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rv0(this.f115615c, this.f115616d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f115614b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            dv0 dv0Var = this.f115615c.f115961a;
            List list = this.f115616d;
            this.f115614b = 1;
            dv0Var.getClass();
            if (kotlinx.coroutines.i.g(new bv0(list, dv0Var, null), this) == objG) {
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
