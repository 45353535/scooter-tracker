package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class u22 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x22 f116466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f116467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx1 f116468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m30 f116469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u22(x22 x22Var, Context context, dx1 dx1Var, m30 m30Var, Continuation continuation) {
        super(2, continuation);
        this.f116466c = x22Var;
        this.f116467d = context;
        this.f116468e = dx1Var;
        this.f116469f = m30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u22(this.f116466c, this.f116467d, this.f116468e, this.f116469f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u22) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f116465b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        u42 u42Var = this.f116466c.f117691c;
        Context context = this.f116467d;
        dx1 dx1Var = this.f116468e;
        m30 m30Var = this.f116469f;
        this.f116465b = 1;
        Object objA = u42Var.a(true, context, dx1Var, m30Var, (Continuation) this);
        return objA == objG ? objG : objA;
    }
}
