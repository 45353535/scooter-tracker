package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yq2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vz f118327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq2(vz vzVar, Continuation continuation) {
        super(2, continuation);
        this.f118327b = vzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new yq2(this.f118327b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yq2(this.f118327b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        co3 co3Var = (co3) this.f118327b;
        co3Var.getClass();
        new CallbackStackTraceMarker(new ao3(co3Var));
        return Unit.f93236a;
    }
}
