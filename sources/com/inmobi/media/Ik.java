package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes9.dex */
public final class Ik extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public Ik(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Ik(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ik((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Deferred deferred = Jk.f37169d;
        if (deferred != null) {
            Job.a.a(deferred, null, 1, null);
        }
        Jk.f37169d = null;
        Jk.f37168c.clear();
        return Unit.f93236a;
    }
}
