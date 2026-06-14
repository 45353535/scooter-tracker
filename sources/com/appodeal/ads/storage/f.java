package com.appodeal.ads.storage;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f14802s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a0 a0Var, long j10, Continuation continuation) {
        super(2, continuation);
        this.f14801r = a0Var;
        this.f14802s = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f14801r, this.f14802s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f14801r, this.f14802s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Map<String, ?> all = this.f14801r.c(d.f14790e).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        long j10 = this.f14802s;
        a0 a0Var = this.f14801r;
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Long l10 = value instanceof Long ? (Long) value : null;
            if ((l10 != null ? l10.longValue() : 0L) < j10) {
                a0Var.c(d.f14790e).edit().remove(key).apply();
            }
        }
        return Unit.f93236a;
    }
}
