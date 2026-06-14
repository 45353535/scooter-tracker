package com.appodeal.ads.modules.common.internal.service.impl;

import com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl;
import hg.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceInitializationAwaiterImpl f13777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, Continuation continuation) {
        super(2, continuation);
        this.f13777b = serviceInitializationAwaiterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f13777b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f13777b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f13776a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableStateFlow mutableStateFlow = this.f13777b.f13766b;
            b bVar = new b(null);
            this.f13776a = 1;
            if (i.y(mutableStateFlow, bVar, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return ServiceInitializationAwaiterImpl.OutcomeState.Completed;
    }
}
