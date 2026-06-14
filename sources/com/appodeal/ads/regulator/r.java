package com.appodeal.ads.regulator;

import com.appodeal.ads.ext.LogExtKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f14368s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, Continuation continuation) {
        super(2, continuation);
        this.f14368s = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.f14368s, continuation);
        rVar.f14367r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r rVar = new r(this.f14368s, (Continuation) obj2);
        rVar.f14367r = (p) obj;
        return rVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        p pVar = (p) this.f14367r;
        LogExtKt.logInternal$default("ConsentSdk", "Consent state updated: " + pVar, null, 4, null);
        this.f14368s.f14415e.setValue(pVar);
        return Unit.f93236a;
    }
}
