package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class H7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f36993a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(Continuation continuation, N7 n72) {
        super(2, continuation);
        this.f36993a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new H7(continuation, this.f36993a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H7((Continuation) obj2, this.f36993a).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f36993a.f37417p.stop();
        this.f36993a.f37417p.clearMediaItems();
        this.f36993a.f37417p.release();
        this.f36993a.f37427z.a();
        this.f36993a.f37426y.f37698d.c();
        return Unit.f93236a;
    }
}
