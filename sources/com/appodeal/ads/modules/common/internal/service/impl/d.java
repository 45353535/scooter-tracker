package com.appodeal.ads.modules.common.internal.service.impl;

import com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl;
import eg.x1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceInitializationAwaiterImpl f13779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, long j10, Continuation continuation) {
        super(2, continuation);
        this.f13779b = serviceInitializationAwaiterImpl;
        this.f13780c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f13779b, this.f13780c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f13779b, this.f13780c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f13778a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            this.f13779b.f13766b.setValue(ServiceInitializationAwaiterImpl.AwaitingState.InProgress);
            long j10 = this.f13780c;
            c cVar = new c(this.f13779b, null);
            this.f13778a = 1;
            obj = x1.e(j10, cVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        ServiceInitializationAwaiterImpl.OutcomeState outcomeState = (ServiceInitializationAwaiterImpl.OutcomeState) obj;
        return outcomeState == null ? ServiceInitializationAwaiterImpl.OutcomeState.TimedOut : outcomeState;
    }
}
