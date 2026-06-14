package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Vh implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37915a;

    public Vh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f37915a = gestureDetectorOnGestureListenerC3635ci;
    }

    public final void a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f37915a.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).a(str, "onAdScreenDisplayFailed");
        }
        this.f37915a.getListener().c();
    }

    public final void b() {
        InterfaceC3878m9 interfaceC3878m9 = this.f37915a.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f37915a;
        if (gestureDetectorOnGestureListenerC3635ci.f38351b == 0) {
            gestureDetectorOnGestureListenerC3635ci.P = false;
        }
        gestureDetectorOnGestureListenerC3635ci.getListener().f(this.f37915a);
    }
}
