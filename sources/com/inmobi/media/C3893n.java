package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3893n extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f39063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3793j f39064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3893n(InterfaceC3878m9 interfaceC3878m9, InterfaceC3793j interfaceC3793j, Continuation continuation) {
        super(2, continuation);
        this.f39063a = interfaceC3878m9;
        this.f39064b = interfaceC3793j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3893n(this.f39063a, this.f39064b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3893n(this.f39063a, this.f39064b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        InterfaceC3878m9 interfaceC3878m9 = this.f39063a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet<WeakReference> copyOnWriteArraySet = C3968q.f39330h;
        InterfaceC3793j interfaceC3793j = this.f39064b;
        for (WeakReference weakReference : copyOnWriteArraySet) {
            if (Intrinsics.areEqual(weakReference.get(), interfaceC3793j)) {
                C3968q.f39330h.remove(weakReference);
            }
        }
        if (C3968q.f39330h.isEmpty()) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39063a;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            InterfaceC3878m9 interfaceC3878m93 = this.f39063a;
            Context context = Ji.f37157a;
            if (context == null) {
                if (interfaceC3878m93 != null) {
                    ((C3903n9) interfaceC3878m93).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                C3968q.a((Float) null);
            } else if (C3968q.f39326d.compareAndSet(true, false)) {
                if (interfaceC3878m93 != null) {
                    ((C3903n9) interfaceC3878m93).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                C3968q.a(context, interfaceC3878m93);
            } else if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return Unit.f93236a;
    }
}
