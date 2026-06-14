package com.moloco.sdk.publisher;

import com.moloco.sdk.internal.publisher.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/moloco/sdk/internal/e;", "<anonymous>", "()Lcom/moloco/sdk/internal/e;"}, k = 3, mv = {2, 0, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$adCreator$2$1", f = "Moloco.kt", l = {513}, m = "invokeSuspend")
public final class Moloco$adCreator$2$1 extends kotlin.coroutines.jvm.internal.k implements Function1<Continuation, Object> {
    int label;

    public Moloco$adCreator$2$1(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Moloco$adCreator$2$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        o0 initializationHandler = Moloco.INSTANCE.getInitializationHandler();
        this.label = 1;
        Object objE = initializationHandler.e(this);
        return objE == objG ? objG : objE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation continuation) {
        return ((Moloco$adCreator$2$1) create(continuation)).invokeSuspend(Unit.f93236a);
    }
}
