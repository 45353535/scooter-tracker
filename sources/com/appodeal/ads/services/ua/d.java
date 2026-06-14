package com.appodeal.ads.services.ua;

import com.appodeal.ads.k7;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f14766t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f14766t = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f14766t, continuation);
        dVar.f14765s = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d dVar = new d(this.f14766t, (Continuation) obj2);
        dVar.f14765s = (List) obj;
        return dVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f14764r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            List list = (List) this.f14765s;
            this.f14766t.getClass();
            k7 k7Var = k7.f13545a;
            this.f14764r = 1;
            if (k7Var.d(list, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ((Result) obj).l();
        }
        return Unit.f93236a;
    }
}
