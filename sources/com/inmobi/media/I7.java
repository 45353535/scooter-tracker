package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class I7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f37054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(Continuation continuation, N7 n72) {
        super(2, continuation);
        this.f37054a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new I7(continuation, this.f37054a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I7((Continuation) obj2, this.f37054a).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        N7 n72 = this.f37054a;
        n72.f37417p.removeListener(n72.B);
        return Unit.f93236a;
    }
}
