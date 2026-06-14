package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ks2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rs2 f112841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls2 f112842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks2(rs2 rs2Var, ls2 ls2Var, Continuation continuation) {
        super(2, continuation);
        this.f112841c = rs2Var;
        this.f112842d = ls2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ks2(this.f112841c, this.f112842d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ks2(this.f112841c, this.f112842d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112840b;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                rs2 rs2Var = this.f112841c;
                z41 z41Var = z41.f118541c;
                this.f112840b = 1;
                obj = rs2Var.a(z41Var, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            this.f112842d.f113211d.a((js2) obj);
            ls2.f113208f.remove(this.f112841c);
            return Unit.f93236a;
        } catch (Throwable th2) {
            ls2.f113208f.remove(this.f112841c);
            throw th2;
        }
    }
}
