package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class et1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f110458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ es2 f110459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et1(Context context, es2 es2Var, Continuation continuation) {
        super(2, continuation);
        this.f110458b = context;
        this.f110459c = es2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new et1(this.f110458b, this.f110459c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new et1(this.f110458b, this.f110459c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        boolean z10 = u73.f116560a;
        u73.a(this.f110458b, ((pr3) this.f110459c).a());
        qf.a(this.f110458b, ((pr3) this.f110459c).a());
        AtomicBoolean atomicBoolean = bi.f109009a;
        bi.a(this.f110458b, ((pr3) this.f110459c).a());
        return Unit.f93236a;
    }
}
