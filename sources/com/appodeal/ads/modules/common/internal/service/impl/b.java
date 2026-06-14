package com.appodeal.ads.modules.common.internal.service.impl;

import com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13775a;

    public b(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(continuation);
        bVar.f13775a = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar = new b((Continuation) obj2);
        bVar.f13775a = (ServiceInitializationAwaiterImpl.AwaitingState) obj;
        return bVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(((ServiceInitializationAwaiterImpl.AwaitingState) this.f13775a) == ServiceInitializationAwaiterImpl.AwaitingState.Completed);
    }
}
