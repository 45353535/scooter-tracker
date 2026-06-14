package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class xq2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vz f117929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n43 f117930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq2(vz vzVar, n43 n43Var, Continuation continuation) {
        super(2, continuation);
        this.f117929b = vzVar;
        this.f117930c = n43Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new xq2(this.f117929b, this.f117930c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xq2(this.f117929b, this.f117930c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        vz vzVar = this.f117929b;
        String str = this.f117930c.f113726a;
        co3 co3Var = (co3) vzVar;
        co3Var.getClass();
        new CallbackStackTraceMarker(new bo3(co3Var, str));
        return Unit.f93236a;
    }
}
