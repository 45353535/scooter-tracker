package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.utils.session.e f14836s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, com.appodeal.ads.utils.session.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f14835r = a0Var;
        this.f14836s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f14835r, this.f14836s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.f14835r, this.f14836s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14835r.c(d.f14788c).edit().putString("session_uuid", this.f14836s.f15065b).putLong("session_uptime", this.f14836s.f15068e).putLong("session_uptime_m", this.f14836s.f15069f).putLong("session_start_ts", this.f14836s.f15066c).putLong("session_start_ts_m", this.f14836s.f15067d).apply();
        return Unit.f93236a;
    }
}
