package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class De extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StateFlow f36732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f36733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(StateFlow stateFlow, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.f36732c = stateFlow;
        this.f36733d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        De de2 = new De(this.f36732c, continuation, this.f36733d);
        de2.f36731b = obj;
        return de2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((De) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36730a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f36731b;
            StateFlow stateFlow = this.f36732c;
            Ce ce2 = new Ce(coroutineScope, this.f36733d);
            this.f36730a = 1;
            if (stateFlow.collect(ce2, this) == objG) {
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
