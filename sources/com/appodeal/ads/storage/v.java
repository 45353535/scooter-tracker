package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f14839t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, String str, long j10, Continuation continuation) {
        super(2, continuation);
        this.f14837r = a0Var;
        this.f14838s = str;
        this.f14839t = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f14837r, this.f14838s, this.f14839t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14837r.c(d.f14790e).edit().putLong(this.f14838s, this.f14839t).apply();
        return Unit.f93236a;
    }
}
