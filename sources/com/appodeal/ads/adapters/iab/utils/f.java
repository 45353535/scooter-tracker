package com.appodeal.ads.adapters.iab.utils;

import com.appodeal.ads.adapters.iab.unified.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x f12317r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x xVar, Continuation continuation) {
        super(2, continuation);
        this.f12317r = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f12317r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f12317r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        pf.b.g();
        kotlin.d.b(obj);
        this.f12317r.run();
        return Unit.f93236a;
    }
}
