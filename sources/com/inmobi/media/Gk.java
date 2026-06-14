package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes9.dex */
public final class Gk extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public Gk(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Gk(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Gk((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        pf.b.g();
        kotlin.d.b(obj);
        if (Jk.f37167b.f39393b.get() != null && (deferred = Jk.f37169d) != null) {
            Job.a.a(deferred, null, 1, null);
        }
        return Unit.f93236a;
    }
}
