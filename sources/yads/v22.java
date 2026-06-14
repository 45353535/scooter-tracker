package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class v22 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x22 f116849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f116850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx1 f116851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v22(x22 x22Var, Context context, dx1 dx1Var, Continuation continuation) {
        super(2, continuation);
        this.f116849c = x22Var;
        this.f116850d = context;
        this.f116851e = dx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v22(this.f116849c, this.f116850d, this.f116851e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v22) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f116848b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            e62 e62Var = this.f116849c.f117690b;
            Context context = this.f116850d;
            dx1 dx1Var = this.f116851e;
            this.f116848b = 1;
            if (e62Var.a(context, dx1Var, this) == objG) {
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
