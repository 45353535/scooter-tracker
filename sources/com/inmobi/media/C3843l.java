package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3843l extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f38912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3793j f38913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3843l(InterfaceC3878m9 interfaceC3878m9, InterfaceC3793j interfaceC3793j, Continuation continuation) {
        super(2, continuation);
        this.f38912a = interfaceC3878m9;
        this.f38913b = interfaceC3793j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3843l(this.f38912a, this.f38913b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3843l(this.f38912a, this.f38913b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        InterfaceC3878m9 interfaceC3878m9 = this.f38912a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + C3968q.f39330h.size());
        }
        for (WeakReference weakReference : C3968q.f39330h) {
            if (weakReference.get() == null) {
                C3968q.f39330h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C3968q.f39330h;
        boolean zIsEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.f38913b));
        InterfaceC3793j interfaceC3793j = this.f38913b;
        Float f10 = (Float) C3968q.f39327e.get();
        ((Ph) interfaceC3793j).a(f10 != null ? kotlin.coroutines.jvm.internal.b.c(F3.a(f10.floatValue() * 100.0f)) : null);
        if (zIsEmpty) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38912a;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).c("AdAudioTracker", "Starting audio volume change listener");
            }
            C3968q.a(this.f38912a);
        } else {
            InterfaceC3878m9 interfaceC3878m93 = this.f38912a;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return Unit.f93236a;
    }
}
