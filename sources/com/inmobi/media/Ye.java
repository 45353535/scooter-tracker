package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Ye extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3632cf f38054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ye(C3632cf c3632cf, Continuation continuation) {
        super(2, continuation);
        this.f38054b = c3632cf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ye(this.f38054b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ye(this.f38054b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38053a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3632cf c3632cf = this.f38054b;
            this.f38053a = 1;
            if (c3632cf.c(this) == objG) {
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
