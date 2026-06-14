package com.appodeal.ads.services;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f14688r;

    public g(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(continuation);
        gVar.f14688r = ((Boolean) obj).booleanValue();
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        g gVar = new g((Continuation) obj2);
        gVar.f14688r = bool.booleanValue();
        return gVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(this.f14688r);
    }
}
