package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Xe extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3632cf f38003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rf f38004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xe(C3632cf c3632cf, Rf rf2, Continuation continuation) {
        super(2, continuation);
        this.f38003b = c3632cf;
        this.f38004c = rf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Xe(this.f38003b, this.f38004c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Xe(this.f38003b, this.f38004c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38002a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3632cf c3632cf = this.f38003b;
            Rf rf2 = this.f38004c;
            We we2 = new We(c3632cf, null);
            this.f38002a = 1;
            if (c3632cf.a(rf2, we2, this) == objG) {
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
