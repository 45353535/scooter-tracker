package com.appodeal.ads.services.ua;

import com.appodeal.ads.utils.Log;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends k implements Function3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Throwable f14767r;

    public e(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = new e((Continuation) obj3);
        eVar.f14767r = (Throwable) obj2;
        return eVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Log.log(this.f14767r);
        return Unit.f93236a;
    }
}
