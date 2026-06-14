package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14817t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a0 a0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f14815r = a0Var;
        this.f14816s = str;
        this.f14817t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f14815r, this.f14816s, this.f14817t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14815r.c(d.f14791f).edit().putString(this.f14816s, this.f14817t).apply();
        return Unit.f93236a;
    }
}
