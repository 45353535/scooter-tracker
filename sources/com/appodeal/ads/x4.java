package com.appodeal.ads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b8 f15248s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(b8 b8Var, Continuation continuation) {
        super(2, continuation);
        this.f15248s = b8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new x4(this.f15248s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x4(this.f15248s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15247r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            b8 b8Var = this.f15248s;
            this.f15247r = 1;
            if (com.appodeal.ads.networking.v.a(b8Var, com.appodeal.ads.networking.processors.c.f14154b, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ((Result) obj).l();
        }
        return Unit.f93236a;
    }
}
