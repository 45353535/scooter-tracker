package com.inmobi.media;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class S extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f37681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u10, Continuation continuation) {
        super(1, continuation);
        this.f37681a = u10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new S(this.f37681a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new S(this.f37681a, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Object objA = H3.a(new Q(this.f37681a));
        U u10 = this.f37681a;
        Throwable thG = Result.g(objA);
        if (thG != null) {
            u10.a(thG);
        }
        return Unit.f93236a;
    }
}
