package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Hh extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public Hh(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Hh(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Hh((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Jh.b();
        return Unit.f93236a;
    }
}
