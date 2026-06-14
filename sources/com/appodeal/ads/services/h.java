package com.appodeal.ads.services;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14689r;

    public h(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(continuation);
        hVar.f14689r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        h hVar = new h((Continuation) obj2);
        hVar.f14689r = (Set) obj;
        return hVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(!((Set) this.f14689r).isEmpty());
    }
}
