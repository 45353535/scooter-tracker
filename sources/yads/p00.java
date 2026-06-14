package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class p00 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s00 f114489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e9 f114490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(s00 s00Var, e9 e9Var, Continuation continuation) {
        super(2, continuation);
        this.f114489b = s00Var;
        this.f114490c = e9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p00(this.f114489b, this.f114490c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p00(this.f114489b, this.f114490c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        s00 s00Var = this.f114489b;
        oz1 oz1Var = new oz1(s00Var.f115655b, ((pr3) s00Var.f115654a).a());
        bz1 bz1Var = this.f114489b.f115657d;
        e9 e9Var = this.f114490c;
        k32 k32Var = k32.f112571c;
        o32 o32Var = o32.f114180c;
        bz1Var.getClass();
        cz1 cz1Var = new cz1(bz1Var.f109156a, bz1Var.f109157b, new nz1(e9Var, k32Var, oz1Var, 1), bz1Var, bz1Var.f109158c, 464);
        bz1Var.f109159d.add(cz1Var);
        o00 o00Var = bz1Var.f109161f;
        iz1 iz1Var = cz1Var.f109669b.f118874x;
        iz1Var.f112194d = o00Var;
        iz1Var.f112193c.a(o00Var, null, null);
        cz1Var.a();
        return Unit.f93236a;
    }
}
