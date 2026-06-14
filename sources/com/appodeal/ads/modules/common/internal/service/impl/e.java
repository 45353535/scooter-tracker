package com.appodeal.ads.modules.common.internal.service.impl;

import eg.i;
import eg.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceInitializationAwaiterImpl f13782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, long j10, Continuation continuation) {
        super(2, continuation);
        this.f13782b = serviceInitializationAwaiterImpl;
        this.f13783c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f13782b, this.f13783c, continuation);
        eVar.f13781a = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f13781a;
        this.f13782b.f13765a = i.b(coroutineScope, o0.a(), null, new d(this.f13782b, this.f13783c, null), 2, null);
        return Unit.f93236a;
    }
}
