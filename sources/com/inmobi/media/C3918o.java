package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3918o extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public C3918o(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3918o(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3918o((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        if (C3968q.f39326d.get() && C3968q.b()) {
            C3968q.a(kotlin.coroutines.jvm.internal.b.c(0.0f));
        }
        return Unit.f93236a;
    }
}
