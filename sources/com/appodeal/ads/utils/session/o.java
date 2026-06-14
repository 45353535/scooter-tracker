package com.appodeal.ads.utils.session;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f15097r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f15097r = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f15097r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).longValue();
        return new o(this.f15097r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        q qVar = this.f15097r;
        Job job = qVar.f15106h;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        qVar.f15106h = eg.i.d(qVar.f15101c, null, null, new k(qVar, null), 3, null);
        return Unit.f93236a;
    }
}
