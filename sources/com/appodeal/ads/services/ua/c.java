package com.appodeal.ads.services.ua;

import com.appodeal.ads.utils.Log;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends k implements Function3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Throwable f14763r;

    public c(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = new c((Continuation) obj3);
        cVar.f14763r = (Throwable) obj2;
        return cVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Log.log(this.f14763r);
        return Unit.f93236a;
    }
}
