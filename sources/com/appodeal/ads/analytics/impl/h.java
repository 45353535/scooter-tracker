package com.appodeal.ads.analytics.impl;

import eg.x1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f12690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f12691t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f12690s = lVar;
        this.f12691t = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f12690s, this.f12691t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.f12690s, this.f12691t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12689r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            g gVar = new g(this.f12690s, this.f12691t, null);
            this.f12689r = 1;
            if (x1.e(20000L, gVar, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
