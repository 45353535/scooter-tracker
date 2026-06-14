package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14806s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a0 a0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f14805r = a0Var;
        this.f14806s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f14805r, this.f14806s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.f14805r, this.f14806s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14805r.c(d.f14790e).edit().remove(this.f14806s).apply();
        return Unit.f93236a;
    }
}
