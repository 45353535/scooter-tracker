package com.appodeal.ads.services.ua;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f14772b;

    public h(Flow flow) {
        this.f14772b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f14772b.collect(new g(flowCollector), continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }
}
