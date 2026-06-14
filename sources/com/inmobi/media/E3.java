package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class E3 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.k f36770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E3(Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.f36770b = (kotlin.coroutines.jvm.internal.k) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new E3(this.f36770b, continuation);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new E3(this.f36770b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36769a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ?? r42 = this.f36770b;
            this.f36769a = 1;
            if (r42.invoke(this) == objG) {
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
