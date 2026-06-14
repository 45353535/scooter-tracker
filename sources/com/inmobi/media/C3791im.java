package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3791im implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f38774a;

    public C3791im(Flow flow) {
        this.f38774a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f38774a.collect(new C3767hm(flowCollector), continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }
}
