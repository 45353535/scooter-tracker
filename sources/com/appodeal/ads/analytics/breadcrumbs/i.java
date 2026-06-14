package com.appodeal.ads.analytics.breadcrumbs;

import eg.x1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f12666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f12667t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f12666s = mVar;
        this.f12667t = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f12666s, this.f12667t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f12666s, this.f12667t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12665r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            h hVar = new h(this.f12666s, this.f12667t, null);
            this.f12665r = 1;
            if (x1.e(20000L, hVar, this) == objG) {
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
