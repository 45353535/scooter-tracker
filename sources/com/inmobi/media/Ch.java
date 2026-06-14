package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Ch extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f36680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ch(Gh gh2, Continuation continuation) {
        super(1, continuation);
        this.f36680a = gh2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Ch(this.f36680a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ch(this.f36680a, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f36680a.f36952k.getAndIncrement();
        this.f36680a.getClass();
        this.f36680a.a(false);
        return Unit.f93236a;
    }
}
