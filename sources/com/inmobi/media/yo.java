package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Job f40023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f40024b;

    public yo(long j10, CoroutineScope scope, ViewGroup observableView, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(scope, "coroutineScope");
        Intrinsics.checkNotNullParameter(observableView, "observableView");
        MutableStateFlow mutableStateFlowA = hg.l0.a(Boolean.FALSE);
        this.f40024b = mutableStateFlowA;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + observableView + ", isAttachedToWindow: " + observableView.isAttachedToWindow());
        }
        StateFlow stateFlowT = hg.i.T(hg.i.E(hg.i.f(new Ao(observableView, null)), eg.o0.c()), scope, hg.g0.f73226a.c(), Boolean.valueOf(observableView.isAttachedToWindow()));
        M1 collector = new M1(j10, observableView, interfaceC3878m9, scope, mutableStateFlowA);
        Intrinsics.checkNotNullParameter(stateFlowT, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.f40023a = eg.i.d(scope, null, null, new N4(stateFlowT, collector, null), 3, null);
    }
}
