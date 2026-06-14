package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Wh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37957b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, Continuation continuation) {
        super(2, continuation);
        this.f37957b = gestureDetectorOnGestureListenerC3635ci;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Wh(this.f37957b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Wh(this.f37957b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3878m9 interfaceC3878m9;
        Object objG = pf.b.g();
        int i10 = this.f37956a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            this.f37956a = 1;
            if (eg.k0.a(1000L, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        if (!this.f37957b.isAttachedToWindow() && (interfaceC3878m9 = this.f37957b.f38368i) != null) {
            ((C3903n9) interfaceC3878m9).a();
        }
        return Unit.f93236a;
    }
}
