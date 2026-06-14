package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14824s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, int i10, Continuation continuation) {
        super(2, continuation);
        this.f14823r = a0Var;
        this.f14824s = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f14823r, this.f14824s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r(this.f14823r, this.f14824s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14823r.c(d.f14788c).edit().putInt("part_of_audience", this.f14824s).apply();
        return Unit.f93236a;
    }
}
