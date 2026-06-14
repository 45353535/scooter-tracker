package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Rn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sn f37680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rn(Sn sn, Continuation continuation) {
        super(2, continuation);
        this.f37680b = sn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Rn(this.f37680b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Rn(this.f37680b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37679a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            long jC = this.f37680b.c();
            this.f37679a = 1;
            if (eg.k0.a(jC, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        ((Runnable) this.f37680b.f37747j.getValue()).run();
        return Unit.f93236a;
    }
}
