package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4156xd implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f39925a;

    public C4156xd(MutableSharedFlow mutableSharedFlow) {
        this.f39925a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f39925a.collect(new C4131wd(flowCollector), continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }
}
