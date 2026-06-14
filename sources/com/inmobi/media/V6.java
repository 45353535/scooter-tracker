package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class V6 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f37892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f37893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableStateFlow f37895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3878m9 f37896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f37897f;

    public V6(long j10, ViewGroup view, InterfaceC3878m9 interfaceC3878m9, CoroutineScope coroutineScope, MutableStateFlow visibilityStateFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.f37892a = coroutineScope;
        this.f37893b = view;
        this.f37894c = j10;
        this.f37895d = visibilityStateFlow;
        this.f37896e = interfaceC3878m9;
    }

    public final Unit a(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37896e;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("WindowLifecycleHandler", "FocusStateCollector - window focus changed: " + z10);
        }
        if (z10) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37896e;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            H6.a(this.f37897f);
            this.f37897f = null;
        } else {
            InterfaceC3878m9 interfaceC3878m93 = this.f37896e;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            this.f37897f = eg.i.d(this.f37892a, null, null, new U6(this, null), 3, null);
        }
        boolean z11 = this.f37893b.getWindowVisibility() == 0;
        InterfaceC3878m9 interfaceC3878m94 = this.f37896e;
        if (interfaceC3878m94 != null) {
            ((C3903n9) interfaceC3878m94).a("WindowLifecycleHandler", "FocusStateCollector - setting visibility state: " + z11);
        }
        this.f37895d.setValue(kotlin.coroutines.jvm.internal.b.a(z11));
        return Unit.f93236a;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }
}
