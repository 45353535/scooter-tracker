package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Ph implements InterfaceC3793j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37547a;

    public Ph(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f37547a = gestureDetectorOnGestureListenerC3635ci;
    }

    public final void a(Float f10) {
        this.f37547a.g("window.mraidview.broadcastEvent('audioVolumeChange', " + f10 + ");");
    }
}
