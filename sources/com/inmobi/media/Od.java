package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Od implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f37489a;

    public Od(MutableSharedFlow mutableSharedFlow) {
        this.f37489a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f37489a.collect(new Nd(flowCollector), continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }
}
