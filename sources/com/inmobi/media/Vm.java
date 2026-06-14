package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Vm implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f37922a;

    public Vm(MutableStateFlow mutableStateFlow) {
        this.f37922a = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f37922a.collect(new Um(flowCollector), continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }
}
