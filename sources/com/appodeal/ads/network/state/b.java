package com.appodeal.ads.network.state;

import com.appodeal.ads.ext.LogExtKt;
import eg.e1;
import eg.g;
import eg.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f13993s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f13993s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f13993s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f13993s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f13992r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            LogExtKt.logInternal$default("NetworkStateObserver", "Notify listeners (" + this.f13993s.f13996b.size() + ") about available network", null, 4, null);
            d.c(this.f13993s);
            e1 e1VarC = o0.c();
            a aVar = new a(this.f13993s, null);
            this.f13992r = 1;
            if (g.g(e1VarC, aVar, this) == objG) {
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
