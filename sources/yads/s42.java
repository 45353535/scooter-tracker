package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class s42 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u42 f115691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f115692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t9 f115693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dx1 f115694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m30 f115695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s42(u42 u42Var, Context context, t9 t9Var, dx1 dx1Var, m30 m30Var, Continuation continuation) {
        super(2, continuation);
        this.f115691c = u42Var;
        this.f115692d = context;
        this.f115693e = t9Var;
        this.f115694f = dx1Var;
        this.f115695g = m30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s42(this.f115691c, this.f115692d, this.f115693e, this.f115694f, this.f115695g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s42) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f115690b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            u42 u42Var = this.f115691c;
            Context context = this.f115692d;
            t9 t9Var = this.f115693e;
            dx1 dx1Var = this.f115694f;
            m30 m30Var = this.f115695g;
            this.f115690b = 1;
            if (u42Var.a(context, t9Var, dx1Var, m30Var, this) == objG) {
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
