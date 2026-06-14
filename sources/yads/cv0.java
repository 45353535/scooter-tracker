package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class cv0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f109611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv0 f109612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ev0 f109613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(byte[] bArr, dv0 dv0Var, ev0 ev0Var, Continuation continuation) {
        super(2, continuation);
        this.f109611c = bArr;
        this.f109612d = dv0Var;
        this.f109613e = ev0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new cv0(this.f109611c, this.f109612d, this.f109613e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cv0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f109610b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            byte[] bArr = this.f109611c;
            if (bArr == null) {
                return null;
            }
            tv0 tv0Var = this.f109612d.f110085b;
            ev0 ev0Var = this.f109613e;
            this.f109610b = 1;
            tu0 tu0Var = tv0Var.f116395a;
            tu0Var.getClass();
            Object objG2 = eg.g.g(eg.o0.b(), new su0(tu0Var, ev0Var, bArr, null), this);
            if (objG2 != pf.b.g()) {
                objG2 = Unit.f93236a;
            }
            if (objG2 == objG) {
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
