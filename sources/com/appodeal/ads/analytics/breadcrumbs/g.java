package com.appodeal.ads.analytics.breadcrumbs;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f12660r;

    public g(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(continuation);
        gVar.f12660r = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g gVar = new g((Continuation) obj2);
        gVar.f12660r = (Set) obj;
        return gVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(!((Set) this.f12660r).isEmpty());
    }
}
