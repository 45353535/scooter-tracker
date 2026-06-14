package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class O4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f37474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3603bc f37475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4(MutableSharedFlow mutableSharedFlow, AbstractC3603bc abstractC3603bc, Continuation continuation) {
        super(2, continuation);
        this.f37474b = mutableSharedFlow;
        this.f37475c = abstractC3603bc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new O4(this.f37474b, this.f37475c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new O4(this.f37474b, this.f37475c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37473a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f37474b;
            AbstractC3603bc abstractC3603bc = this.f37475c;
            this.f37473a = 1;
            if (mutableSharedFlow.emit(abstractC3603bc, this) == objG) {
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
