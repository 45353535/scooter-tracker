package com.appodeal.ads.utils.session;

import com.appodeal.ads.storage.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f15049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f15050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f15051t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, b bVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f15049r = d0Var;
        this.f15050s = bVar;
        this.f15051t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a0(this.f15049r, this.f15050s, this.f15051t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        z zVar = this.f15049r.f15063a;
        b appTimes = this.f15050s;
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        e0 e0Var = zVar.f15129a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        e0Var.f14800a.f(appTimes);
        z zVar2 = this.f15049r.f15063a;
        e session = this.f15051t;
        Intrinsics.checkNotNullParameter(session, "session");
        e0 e0Var2 = zVar2.f15129a;
        e0Var2.getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        e0Var2.f14800a.g(session);
        return Unit.f93236a;
    }
}
