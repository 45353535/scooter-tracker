package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.revenue.RevenueInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9 f11881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RevenueInfo f11882s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(d9 d9Var, RevenueInfo revenueInfo, Continuation continuation) {
        super(2, continuation);
        this.f11881r = d9Var;
        this.f11882s = revenueInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a8(this.f11881r, this.f11882s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a8(this.f11881r, this.f11882s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AdType adType;
        pf.b.g();
        kotlin.d.b(obj);
        AdType[] adTypeArrValues = AdType.values();
        RevenueInfo revenueInfo = this.f11882s;
        int length = adTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                adType = null;
                break;
            }
            adType = adTypeArrValues[i10];
            if (adType.getCode() == revenueInfo.getAdType()) {
                break;
            }
            i10++;
        }
        String displayName = adType != null ? adType.getDisplayName() : null;
        if (displayName == null) {
            displayName = "";
        }
        String str = displayName;
        AppodealRequestCallbacks appodealRequestCallbacks = this.f11881r.f13237b;
        if (appodealRequestCallbacks != null) {
            appodealRequestCallbacks.onImpression(str, this.f11882s.getDemandSource(), this.f11882s.getAdUnitName(), this.f11882s.getRevenue() * ((double) 1000));
        }
        return Unit.f93236a;
    }
}
