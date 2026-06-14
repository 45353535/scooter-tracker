package com.appodeal.ads.regulator.usecases;

import com.appodeal.ads.context.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends k implements Function1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f14402s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(1, continuation);
        this.f14402s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f14402s, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new g(this.f14402s, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f14401r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        o oVar = this.f14402s.f14403a;
        this.f14401r = 1;
        Object objAwaitResumedActivity = oVar.f13206a.awaitResumedActivity(this);
        return objAwaitResumedActivity == objG ? objG : objAwaitResumedActivity;
    }
}
