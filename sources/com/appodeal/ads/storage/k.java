package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14809r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.f14809r = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f14809r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.f14809r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        d[] dVarArrValues = d.values();
        a0 a0Var = this.f14809r;
        for (d dVar : dVarArrValues) {
            a0Var.f14785c.put(dVar, new b(dVar.f14794b, com.appodeal.ads.context.o.f13205b));
        }
        return Unit.f93236a;
    }
}
