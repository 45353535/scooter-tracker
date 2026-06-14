package com.appodeal.ads.utils.session;

import com.appodeal.ads.storage.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f15056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f15057s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, f fVar, Continuation continuation) {
        super(2, continuation);
        this.f15056r = d0Var;
        this.f15057s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b0(this.f15056r, this.f15057s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b0(this.f15056r, this.f15057s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        z zVar = this.f15056r.f15063a;
        b appTimes = this.f15057s.f15073a;
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        e0 e0Var = zVar.f15129a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        e0Var.f14800a.f(appTimes);
        this.f15056r.f15063a.f(this.f15057s.f15075c);
        z zVar2 = this.f15056r.f15063a;
        e session = this.f15057s.f15074b;
        Intrinsics.checkNotNullParameter(session, "session");
        e0 e0Var2 = zVar2.f15129a;
        e0Var2.getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        e0Var2.f14800a.g(session);
        return Unit.f93236a;
    }
}
