package com.appodeal.ads.services;

import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.revenue.RevenueInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f14703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RevenueInfo f14704t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, RevenueInfo revenueInfo, Continuation continuation) {
        super(2, continuation);
        this.f14703s = rVar;
        this.f14704t = revenueInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f14703s, this.f14704t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.f14703s, this.f14704t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f14702r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableStateFlow mutableStateFlow = this.f14703s.f14725c;
            l lVar = new l(null);
            this.f14702r = 1;
            obj = hg.i.y(mutableStateFlow, lVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (obj2 instanceof RevenueTracker) {
                arrayList.add(obj2);
            }
        }
        RevenueInfo revenueInfo = this.f14704t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((RevenueTracker) it.next()).trackRevenue(revenueInfo);
        }
        return Unit.f93236a;
    }
}
