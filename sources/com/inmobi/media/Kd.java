package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class Kd implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f37220a;

    public Kd(CoroutineScope coroutineScope, Sd sd2) {
        this.f37220a = sd2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objG = eg.g.g(eg.o0.c(), new Pd(this.f37220a, null), continuation);
        if (objG != pf.b.g()) {
            objG = Unit.f93236a;
        }
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
