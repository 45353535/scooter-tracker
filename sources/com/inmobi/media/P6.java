package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class P6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R6 f37520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(R6 r62, Continuation continuation) {
        super(2, continuation);
        this.f37520b = r62;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new P6(this.f37520b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new P6(this.f37520b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37519a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        Z z10 = this.f37520b.f37645n;
        this.f37519a = 1;
        Object objA = z10.a(this);
        return objA == objG ? objG : objA;
    }
}
