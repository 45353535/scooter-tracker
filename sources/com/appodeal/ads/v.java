package com.appodeal.ads;

import com.appodeal.ads.revenue.AdRevenueCallbacks;
import com.appodeal.ads.revenue.RevenueInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RevenueInfo f15134s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(RevenueInfo revenueInfo, Continuation continuation) {
        super(2, continuation);
        this.f15134s = revenueInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f15134s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.f15134s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15133r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            boolean z10 = h2.f13367a;
            com.appodeal.ads.services.r rVar = (com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14778a.getValue();
            RevenueInfo revenueInfo = this.f15134s;
            this.f15133r = 1;
            if (rVar.b(revenueInfo, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        AdRevenueCallbacks adRevenueCallbacks = h2.f13371e;
        if (adRevenueCallbacks != null) {
            adRevenueCallbacks.onAdRevenueReceive(this.f15134s);
        }
        d9 d9Var = (d9) h2.f13370d.getValue();
        RevenueInfo revenueInfo2 = this.f15134s;
        d9Var.getClass();
        Intrinsics.checkNotNullParameter(revenueInfo2, "revenueInfo");
        eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new a8(d9Var, revenueInfo2, null), 3, null);
        return Unit.f93236a;
    }
}
