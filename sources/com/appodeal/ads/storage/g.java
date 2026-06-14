package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f14803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f14804s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a0 a0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f14803r = str;
        this.f14804s = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f14804s, this.f14803r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = this.f14803r;
        return new g(this.f14804s, str, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        String str = this.f14803r + "_timestamp";
        String str2 = this.f14803r + "_wst";
        a0 a0Var = this.f14804s;
        d dVar = d.f14788c;
        a0Var.c(d.f14788c).edit().remove(this.f14803r).remove(str).remove(str2).apply();
        return Unit.f93236a;
    }
}
