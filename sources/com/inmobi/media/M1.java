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
public final class M1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f37328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f37329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f37330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3878m9 f37332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f37333f;

    public M1(long j10, ViewGroup observableView, InterfaceC3878m9 interfaceC3878m9, CoroutineScope coroutineScope, MutableStateFlow visibilityStateFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(observableView, "observableView");
        Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.f37328a = coroutineScope;
        this.f37329b = observableView;
        this.f37330c = visibilityStateFlow;
        this.f37331d = j10;
        this.f37332e = interfaceC3878m9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r12.collect(r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r14.collect(r4, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.M1 r11, android.view.ViewGroup r12, kotlinx.coroutines.CoroutineScope r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M1.a(com.inmobi.media.M1, android.view.ViewGroup, kotlinx.coroutines.CoroutineScope, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }

    public final Unit a(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37332e;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("WindowLifecycleHandler", "AttachedStateCollector - view attachment state changed: " + z10);
        }
        if (z10) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37332e;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            this.f37333f = eg.i.d(this.f37328a, null, null, new J1(this, null), 3, null);
        } else {
            InterfaceC3878m9 interfaceC3878m93 = this.f37332e;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            this.f37330c.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            H6.a(this.f37333f);
            this.f37333f = null;
        }
        return Unit.f93236a;
    }
}
