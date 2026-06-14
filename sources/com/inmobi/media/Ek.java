package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Ek extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public Ek(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Ek(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ek((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Jk.f37169d = null;
        return Unit.f93236a;
    }
}
