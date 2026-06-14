package com.inmobi.media;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4113vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f39793a;

    public C4113vk(GestureDetectorOnGestureListenerC3635ci mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f39793a = mListener;
    }

    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f39793a.a(event.getX(), event.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f39793a.b(event.getX(), event.getY());
        }
    }
}
