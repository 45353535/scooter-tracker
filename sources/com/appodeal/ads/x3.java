package com.appodeal.ads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l4 f15245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f15246t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(l4 l4Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.f15245s = l4Var;
        this.f15246t = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new x3(this.f15245s, this.f15246t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x3(this.f15245s, this.f15246t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15244r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            l4 l4Var = this.f15245s;
            Context context = this.f15246t;
            this.f15244r = 1;
            if (l4.j(l4Var, context, this) == objG) {
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
