package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class in extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rn f112059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e83 f112060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(rn rnVar, e83 e83Var, Continuation continuation) {
        super(2, continuation);
        this.f112059b = rnVar;
        this.f112060c = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new in(this.f112059b, this.f112060c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new in(this.f112059b, this.f112060c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        pf.b.g();
        kotlin.d.b(obj);
        rn rnVar = this.f112059b;
        synchronized (rnVar) {
            z10 = rnVar.f115523s;
        }
        if (!z10) {
            String strA = this.f112060c.a(this.f112059b.f115507c);
            if (strA == null || strA.length() == 0) {
                this.f112059b.b(f9.f110649j);
            } else {
                this.f112059b.f115506b.a(u5.f116514r, null);
                this.f112059b.f115507c.f109201h = this.f112060c.a();
                rn rnVar2 = this.f112059b;
                c4 c4Var = rnVar2.f115507c;
                nn2 nn2Var = rnVar2.f115519o;
                Context context = rnVar2.f115505a;
                nn2Var.getClass();
                c4Var.f109208o = context.getResources().getConfiguration().orientation;
                e83 e83Var = this.f112060c;
                rn rnVar3 = this.f112059b;
                this.f112059b.f115521q.a(this.f112059b.a(strA, e83Var.a(rnVar3.f115505a, rnVar3.f115507c, rnVar3.f115513i)));
            }
        }
        return Unit.f93236a;
    }
}
