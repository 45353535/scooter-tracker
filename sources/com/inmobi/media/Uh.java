package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37856a;

    public Uh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f37856a = gestureDetectorOnGestureListenerC3635ci;
    }

    public final void a(C3599b8 obj) {
        Intrinsics.checkNotNullParameter(obj, "error");
        InterfaceC3878m9 interfaceC3878m9 = this.f37856a.f38368i;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) obj.f38253b));
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f37856a;
        EnumC3952p8 enumC3952p8 = EnumC3952p8.f39253d;
        Intrinsics.checkNotNullParameter(obj, "obj");
        gestureDetectorOnGestureListenerC3635ci.a(enumC3952p8, AbstractC3879ma.a(obj, obj.getClass()));
    }
}
