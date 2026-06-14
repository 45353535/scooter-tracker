package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class L1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M1 f37253a;

    public L1(M1 m12) {
        this.f37253a = m12;
    }

    public final Unit a(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37253a.f37332e;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("WindowLifecycleHandler", "startObservingVisibility - Window visibility changed: " + z10);
        }
        this.f37253a.f37330c.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
        return Unit.f93236a;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }
}
