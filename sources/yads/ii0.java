package yads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ii0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ki0 f111999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f112000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(ki0 ki0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f111999b = ki0Var;
        this.f112000c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ii0(this.f111999b, this.f112000c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ii0(this.f111999b, this.f112000c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        ki0 ki0Var = this.f111999b;
        String str = this.f112000c;
        AtomicBoolean atomicBoolean = ki0.f112708e;
        ki0Var.a(str);
        return Unit.f93236a;
    }
}
