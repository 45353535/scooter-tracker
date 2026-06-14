package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class N4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StateFlow f37395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M1 f37396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(StateFlow stateFlow, M1 m12, Continuation continuation) {
        super(2, continuation);
        this.f37395b = stateFlow;
        this.f37396c = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new N4(this.f37395b, this.f37396c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new N4(this.f37395b, this.f37396c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37394a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            StateFlow stateFlow = this.f37395b;
            M1 m12 = this.f37396c;
            this.f37394a = 1;
            if (stateFlow.collect(m12, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
