package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14827t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f14825r = a0Var;
        this.f14826s = str;
        this.f14827t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f14825r, this.f14826s, this.f14827t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14825r.c(d.f14789d).edit().putString(this.f14826s, this.f14827t).apply();
        return Unit.f93236a;
    }
}
