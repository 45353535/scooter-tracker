package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Q extends kotlin.jvm.internal.y implements Function0 {
    public Q(Object obj) {
        super(0, obj, U.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        U u10 = (U) this.receiver;
        u10.getClass();
        u10.f37812n = Ji.f37160d.get();
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        O runnable = u10.f37811m;
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.postAtFrontOfQueue(runnable);
        return Unit.f93236a;
    }
}
